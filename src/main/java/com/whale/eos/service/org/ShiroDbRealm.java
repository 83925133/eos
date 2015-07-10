/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.whale.eos.service.org;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.AllowAllCredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.whale.eos.basic.util.Encodes;
import com.whale.eos.basic.util.ResourceUtils;
import com.whale.eos.basic.util.security.shiro.CaptchaUsernamePasswordToken;
import com.whale.eos.basic.util.security.shiro.IncorrectCaptchaException;
import com.whale.eos.basic.util.security.utils.Digests;
import com.whale.eos.basic.util.spring.PropertyUtil;
import com.whale.eos.entity.org.EosEmp;
import com.whale.eos.service.menu.IEosMenuService;

public class ShiroDbRealm extends AuthorizingRealm {

	protected IEosEmpService eosEmpService;
	protected IEosMenuService eosMenuService;
	protected IEosUserService eosUserService;
	protected boolean useCaptcha = false;

	public void setEosEmpService(IEosEmpService eosEmpService) {
		this.eosEmpService = eosEmpService;
	}

	public void setEosMenuService(IEosMenuService eosMenuService) {
		this.eosMenuService = eosMenuService;
	}

	public void setEosUserService(IEosUserService eosUserService) {
		this.eosUserService = eosUserService;
	}

	/**
	 * 设置 useCaptcha 的值
	 *
	 * @param useCaptcha
	 */
	public void setUseCaptcha(boolean useCaptcha) {
		this.useCaptcha = useCaptcha;
	}

	/**
	 * 认证回调函数,登录时调用.
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		if (useCaptcha) {
			CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) authcToken;
			String parm = token.getCaptcha();
			String c = (String) SecurityUtils
					.getSubject()
					.getSession()
					.getAttribute(
							com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
			if (parm == null || !parm.equalsIgnoreCase(c)) {
				throw new IncorrectCaptchaException(
						ResourceUtils.getString("msg.login.kaptcha.code.error"));
			}
		}
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		// System.out.println("token.getUsername() : " + token.getUsername());
		EosEmp eosEmp = eosEmpService.findByEno(token.getUsername());
		// byte[] salt = Encodes.decodeHex(operator.getPwdSalt());
		// byte[] salt = Encodes.decodeHex(PropertyUtil.getString("salt"));
		if (eosEmp != null) {
			if (PropertyUtil.getBoolean("encrypt")) {
				return new SimpleAuthenticationInfo(new ShiroEmp(
						String.valueOf(eosEmp.getId()), eosEmp.getEno(),
						eosEmp.getEname()), eosEmp.getEpwd(),
						ByteSource.Util.bytes(Encodes.decodeHex(PropertyUtil
								.getString("salt"))), getName());
			} else {
				return new SimpleAccount(new ShiroEmp(String.valueOf(eosEmp
						.getId()), eosEmp.getEno(), eosEmp.getEname()),
						eosEmp.getPwd(), getName());
			}

		} else {
			throw new UnknownAccountException();
		}
	}

	public void assertCredentialsMatch(AuthenticationToken token,
			AuthenticationInfo info) throws AuthenticationException {
		if (PropertyUtil.getBoolean("encrypt")) {
			super.assertCredentialsMatch(token, info);
		} else {
			if (token != null && info != null) {
				CaptchaUsernamePasswordToken tk = (CaptchaUsernamePasswordToken) token;
				if (!(String.valueOf(tk.getPassword())).equals((String)info.getCredentials())) {
					// not successful - throw an exception to indicate this:
					String msg = "Submitted credentials for token [" + tk
							+ "] did not match the expected credentials.";
					throw new IncorrectCredentialsException(msg);
				}
			} else {
				throw new AuthenticationException(
						"A CredentialsMatcher must be configured in order to verify "
								+ "credentials during authentication.  If you do not wish for credentials to be examined, you "
								+ "can configure an "
								+ AllowAllCredentialsMatcher.class.getName()
								+ " instance.");
			}
		}
	}
	

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		ShiroEmp shiroEmp = (ShiroEmp) principals.getPrimaryPrincipal();
		EosEmp eosEmp = eosEmpService.findByEno(shiroEmp.loginName);

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

		/* 系统不使用角色 */
		/*
		 * List<String> resourceList =
		 * eosEmpService.getAllRoleAction(eosEmp.getRoleId());
		 * info.addStringPermissions(resourceList); String roleName =
		 * eosRoleService.getRoleName(eosEmp.getRoleId());
		 * info.addRole(roleName);
		 */

		Session session = SecurityUtils.getSubject().getSession();
		session.setAttribute("eosEmp", eosEmp);
		return info;
	}

	/**
	 * 设定Password校验的Hash算法与迭代次数.
	 */
	@PostConstruct
	public void initCredentialsMatcher() {
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(
				IEosEmpService.HASH_ALGORITHM);
		matcher.setHashIterations(IEosEmpService.HASH_INTERATIONS);

		setCredentialsMatcher(matcher);
	}

	/**
	 * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息.
	 */
	public static class ShiroEmp implements Serializable {
		private static final long serialVersionUID = -1373760761780840081L;
		public String id;
		public String loginName;
		public String name;

		public ShiroEmp(String id, String loginName, String name) {
			this.id = id;
			this.loginName = loginName;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String getLoginName() {
			return loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		/**
		 * 本函数输出将作为默认的<shiro:principal/>输出.
		 */
		@Override
		public String toString() {
			return loginName;
		}

		/**
		 * 重载equals,只计算loginName;
		 */
		@Override
		public int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this, "loginName");
		}

		/**
		 * 重载equals,只比较loginName
		 */
		@Override
		public boolean equals(Object obj) {
			return EqualsBuilder.reflectionEquals(this, obj, "loginName");
		}
	}

	public static String entryptPassword(String pwd, String salt) {
		byte[] hashPassword = Digests.sha1(pwd.getBytes(),
				Encodes.decodeHex(salt), 1024);
		return Encodes.encodeHex(hashPassword);
	}

	public static void main(String[] args) {
		String pwd = entryptPassword("1", "e7a0f54224a1814b");// e7a0f54224a1814b
		System.out.println("密码：" + pwd);
	}
}
