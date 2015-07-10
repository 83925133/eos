package com.whale.eos.basic.util.persistance;

import java.util.Collection;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import com.google.common.collect.Lists;
import com.whale.eos.basic.util.Collections3;

/**
 * Created by IntelliJ IDEA.
 * User: zhanghong
 * Date: 13-4-28
 * Time: 下午12:03
 */
public class DynamicSpecifications {


    public static <T> Specification<T> bySearchFilter(final Collection<SearchFilter> filters, final Class<T> clazz) {
        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
                if (Collections3.isNotEmpty(filters)) {

                    List<Predicate> predicates = Lists.newArrayList();
                    for (SearchFilter filter : filters) {
                        // nested path translate, 如Task的名为"user.name"的filedName, 转换为Task.user.name属性
                        String[] names = StringUtils.split(filter.fieldName, ".");
                        Path expression = root.get(names[0]);
                        int length = names.length;
                        for (int i = 1; i < length; i++) {
                            expression = expression.get(names[i]);
                        }
                        // logic operator
                        switch (filter.operatorEnum) {
                            case EQ:
                                predicates.add(builder.equal(expression, filter.value));
                                break;
                            case LIKE:
                                predicates.add(builder.like(expression, "%" + filter.value + "%"));
                                break;
                            case GT:
                                predicates.add(builder.greaterThan(expression, (Comparable) filter.value));
                                break;
                            case LT:
                                predicates.add(builder.lessThan(expression, (Comparable) filter.value));
                                break;
                            case GTE:
                                predicates.add(builder.greaterThanOrEqualTo(expression, (Comparable) filter.value));
                                break;
                            case LTE:
                                predicates.add(builder.lessThanOrEqualTo(expression, (Comparable) filter.value));
                                break;
//                            case countDistinct:
//                                builder.countDistinct(expression);
//                                break;
//                            case sum:
//                                builder.sum(expression);
//                                break;
                        }
                    }

                    // 将所有条件用 and 联合起来
                    if (predicates.size() > 0) {
                        return builder.and(predicates.toArray(new Predicate[predicates.size()]));
                    }
                }

                return builder.conjunction();
            }
        };
    }


    public static void appendQuerySql(StringBuffer sqlBf, Collection<SearchFilter> searchFilters) {
        Collection<SearchFilter> filters = searchFilters;
        if (Collections3.isNotEmpty(filters)) {
            for (SearchFilter filter : filters) {
                switch (filter.operatorEnum) {
                    case EQ:
                        sqlBf.append(" and t." + filter.fieldName + "='" + filter.value + "'");
                        break;
                    case LIKE:
                        sqlBf.append(" and t." + filter.fieldName + "%'" + filter.value + "'%");
                        break;
                    case GT:
                        sqlBf.append(" and t." + filter.fieldName + ">" + filter.value);
                        break;
                    case LT:
                        sqlBf.append(" and t." + filter.fieldName + "<" + filter.value);
                        break;
                    case GTE:
                        sqlBf.append(" and t." + filter.fieldName + ">=" + filter.value);
                        break;
                    case LTE:
                        sqlBf.append(" and t." + filter.fieldName + "<=" + filter.value);
                        break;
                }
            }
        }
    }
}
