package com.whale.eos.basic.util;

/**
 * Created with IntelliJ IDEA.
 * User: 李建东
 * Date: 13-10-12
 * Time: 上午11:01
 * To change this template use File | Settings | File Templates.
 */

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public final class StringUtil
{
  public static final String EMPTY = "";
  public static final int PAD_LIMIT = 8192;
  private static final String[] CONSTANTS_PADDING = new String[65535];

  private static final String[] EMPTY_STRING_ARRAY = new String[0];

  static
  {
    CONSTANTS_PADDING[32] = "                                                                ";
  }

  public static boolean isEmpty(String string)
  {
    return StringUtils.isEmpty(string);
  }

  public static boolean isNotEmpty(String string)
  {
    return StringUtils.isNotEmpty(string);
  }

  public static boolean isBlank(String string)
  {
    return StringUtils.isBlank(string);
  }

  public static boolean isNotBlank(String string)
  {
    return StringUtils.isNotBlank(string);
  }

  @Deprecated
  public static String clean(String str)
  {
    return str == null ? "" : str.trim();
  }

  public static String trim(String string)
  {
    return StringUtils.trim(string);
  }

  public static String trimToNull(String string)
  {
    return StringUtils.trimToNull(string);
  }

  public static String trimToEmpty(String string)
  {
    return StringUtils.trimToEmpty(string);
  }

  public static String strip(String string)
  {
    return StringUtils.strip(string);
  }

  public static String stripToNull(String string)
  {
    return StringUtils.stripToNull(string);
  }

  public static String stripToEmpty(String string)
  {
    return StringUtils.stripToEmpty(string);
  }

  public static String strip(String string, String stripChars)
  {
    return StringUtils.strip(string, stripChars);
  }

  public static String stripStart(String string, String stripChars)
  {
    return StringUtils.stripStart(string, stripChars);
  }

  public static String stripEnd(String string, String stripChars)
  {
    return StringUtils.stripEnd(string, stripChars);
  }

  public static String[] stripAll(String[] strs)
  {
    return StringUtils.stripAll(strs);
  }

  public static String[] stripAll(String[] strs, String stripChars)
  {
    return StringUtils.stripAll(strs, stripChars);
  }

  public static boolean equals(String str1, String str2)
  {
    return StringUtils.equals(str1, str2);
  }

  public static boolean equalsIgnoreCase(String str1, String str2)
  {
    return StringUtils.equalsIgnoreCase(str1, str2);
  }

  public static int indexOf(String string, char searchChar)
  {
    return StringUtils.indexOf(string, searchChar);
  }

  public static int indexOf(String string, char searchChar, int startPos)
  {
    return StringUtils.indexOf(string, searchChar, startPos);
  }

  public static int indexOf(String string, String searchStr)
  {
    return StringUtils.indexOf(string, searchStr);
  }

  public static int indexOf(String string, String searchStr, int startPos)
  {
    return StringUtils.indexOf(string, searchStr, startPos);
  }

  public static int lastIndexOf(String string, char searchChar)
  {
    return StringUtils.lastIndexOf(string, searchChar);
  }

  public static int lastIndexOf(String string, char searchChar, int startPos)
  {
    return StringUtils.lastIndexOf(string, searchChar, startPos);
  }

  public static int lastIndexOf(String string, String searchStr)
  {
    return StringUtils.lastIndexOf(string, searchStr);
  }

  public static int lastIndexOf(String string, String searchStr, int startPos)
  {
    return StringUtils.lastIndexOf(string, searchStr, startPos);
  }

  public static boolean contains(String string, char searchChar)
  {
    return StringUtils.contains(string, searchChar);
  }

  public static boolean contains(String string, String searchStr)
  {
    return StringUtils.contains(string, searchStr);
  }

  public static int indexOfAny(String string, char[] searchChars)
  {
    return StringUtils.indexOfAny(string, searchChars);
  }

  public static int indexOfAny(String string, String searchChars)
  {
    return StringUtils.indexOfAny(string, searchChars);
  }

  public static int indexOfAnyBut(String string, char[] searchChars)
  {
    return StringUtils.indexOfAnyBut(string, searchChars);
  }

  public static int indexOfAnyBut(String string, String searchChars)
  {
    return StringUtils.indexOfAnyBut(string, searchChars);
  }

  public static boolean containsOnly(String string, char[] valid)
  {
    return StringUtils.containsOnly(string, valid);
  }

  public static boolean containsOnly(String string, String validChars)
  {
    return StringUtils.containsOnly(string, validChars);
  }

  public static boolean containsNone(String string, char[] invalidChars)
  {
    return StringUtils.containsNone(string, invalidChars);
  }

  public static boolean containsNone(String string, String invalidChars)
  {
    return StringUtils.containsNone(string, invalidChars);
  }

  public static int indexOfAny(String string, String[] searchStrs)
  {
    return StringUtils.indexOfAny(string, searchStrs);
  }

  public static int lastIndexOfAny(String string, String[] searchStrs)
  {
    return StringUtils.lastIndexOfAny(string, searchStrs);
  }

  public static String substring(String string, int start)
  {
    return StringUtils.substring(string, start);
  }

  public static String substring(String string, int start, int end)
  {
    return StringUtils.substring(string, start, end);
  }

  public static String left(String string, int len)
  {
    return StringUtils.left(string, len);
  }

  public static String right(String string, int len)
  {
    return StringUtils.right(string, len);
  }

  public static String mid(String string, int pos, int len)
  {
    return StringUtils.mid(string, pos, len);
  }

  public static String substringBefore(String string, String separator)
  {
    return StringUtils.substringBefore(string, separator);
  }

  public static String substringAfter(String string, String separator)
  {
    return StringUtils.substringAfter(string, separator);
  }

  public static String substringBeforeLast(String string, String separator)
  {
    return StringUtils.substringBeforeLast(string, separator);
  }

  public static String substringAfterLast(String string, String separator)
  {
    return StringUtils.substringAfterLast(string, separator);
  }

  public static String substringBetween(String string, String tag)
  {
    return StringUtils.substringBetween(string, tag);
  }

  public static String substringBetween(String string, String open, String close)
  {
    return StringUtils.substringBetween(string, open, close);
  }

  public static String[] substringAllBetween(String string, String open, String close)
  {
    String strSub = getSubStringBetween(string, open, close);
    String[] strTest = strSub.split("&&");
    return strTest;
  }

  public static String getSubStringBetween(String str, String open, String close)
  {
    if ((str == null) || (open == null) || (close == null)) {
      return null;
    }
    StringBuffer sbBuffer = new StringBuffer();
    int iStart = str.indexOf(open);
    if (iStart != -1) {
      int iEnd = str.indexOf(close, iStart + open.length());
      if (iEnd != -1) {
        sbBuffer.append(str.substring(iStart + open.length(), iEnd));

        sbBuffer.append("&&");
        String strSubStr = str.substring(iEnd + 1, str.length());
        sbBuffer.append(getSubStringBetween(strSubStr, open, close));
      }
    }
    return sbBuffer.toString();
  }

  @Deprecated
  public static String getNestedString(String str, String tag)
  {
    return substringBetween(str, tag, tag);
  }

  @Deprecated
  public static String getNestedString(String str, String open, String close)
  {
    return substringBetween(str, open, close);
  }

  public static String[] split(String string)
  {
    return StringUtils.split(string);
  }

  public static String[] split(String string, char separatorChar)
  {
    return StringUtils.split(string, separatorChar);
  }

  public static String[] split(String string, String separatorChars)
  {
    return StringUtils.split(string, separatorChars);
  }

  public static List<String> splitString(String string, String separatorChars)
  {
    return Arrays.asList(StringUtils.split(string, separatorChars));
  }

  public static String[] split(String string, String separatorChars, int max)
  {
    return StringUtils.split(string, separatorChars, max);
  }

  public static String[] splitByChar(String str, char separatorChar)
  {
    return splitWorker(str, separatorChar, false);
  }

  private static String[] splitWorker(String str, char separatorChar, boolean preserveAllTokens)
  {
    if (str == null) {
      return new String[0];
    }
    int iLen = str.length();
    if (iLen == 0) {
      return EMPTY_STRING_ARRAY;
    }
    List lstAr = new ArrayList();
    int i = 0;
    int iStart = 0;
    boolean bMatch = false;
    boolean bLastMatch = false;
    while (i < iLen)
      if (str.charAt(i) == separatorChar) {
        if ((bMatch) || (preserveAllTokens)) {
          lstAr.add(str.substring(iStart, i));
          bMatch = false;
          bLastMatch = true;
        }
        i++; iStart = i;
      }
      else {
        bLastMatch = false;
        bMatch = true;
        i++;
      }
    if ((bMatch) || ((preserveAllTokens) && (bLastMatch))) {
      lstAr.add(str.substring(iStart, i));
    }
    return (String[])lstAr.toArray(new String[lstAr.size()]);
  }

  public static String[] splitByWholeSeparator(String string, String separator)
  {
    return StringUtils.splitByWholeSeparator(string, separator);
  }

  public static String[] splitByWholeSeparator(String string, String separator, int max)
  {
    return StringUtils.splitByWholeSeparator(string, separator, max);
  }

  public static String[] splitPreserveAllTokens(String string)
  {
    return StringUtils.splitPreserveAllTokens(string);
  }

  public static String[] splitPreserveAllTokens(String string, char separatorChar)
  {
    return StringUtils.splitPreserveAllTokens(string, separatorChar);
  }

  public static String[] splitPreserveAllTokens(String string, String separatorChars)
  {
    return StringUtils.splitPreserveAllTokens(string, separatorChars);
  }

  public static String[] splitPreserveAllTokens(String string, String separatorChars, int max)
  {
    return StringUtils.splitPreserveAllTokens(string, separatorChars, max);
  }

  public static String getSplitIndexString(String source, String splitString, int position)
  {
    String[] strSplitStrings = StringUtils.split(source, splitString);
    if (strSplitStrings.length > position) {
      return strSplitStrings[position];
    }
    return "";
  }

  @Deprecated
  public static String concatenate(Object[] array)
  {
    return join(array, null);
  }

  public static String join(Object[] array)
  {
    return StringUtils.join(array);
  }

  public static String join(Object[] array, char separator)
  {
    return StringUtils.join(array, separator);
  }

  public static String join(Object[] array, String separator)
  {
    return StringUtils.join(array, separator);
  }

  public static String join(Iterator<?> iterator, char separator)
  {
    return StringUtils.join(iterator, separator);
  }

  public static String join(Iterator<?> iterator, String separator)
  {
    return StringUtils.join(iterator, separator);
  }

  public static String deleteWhitespace(String string)
  {
    return StringUtils.deleteWhitespace(string);
  }

  public static String replaceOnce(String text, String repl, String with)
  {
    return StringUtils.replaceOnce(text, repl, with);
  }

  public static String replace(String text, String repl, String with)
  {
    return StringUtils.replace(text, repl, with);
  }

  public static String replace(String text, String repl, String with, int max)
  {
    return StringUtils.replace(text, repl, with, max);
  }

  public static String replaceChars(String string, char searchChar, char replaceChar)
  {
    return StringUtils.replaceChars(string, searchChar, replaceChar);
  }

  public static String replaceChars(String string, String searchChars, String replaceChars)
  {
    return StringUtils.replaceChars(string, searchChars, replaceChars);
  }

  @Deprecated
  public static String overlayString(String text, String overlay, int start, int end)
  {
    return start + overlay.length() + text.length() - end + 1 + text.substring(0, start) + 
      overlay + text.substring(end);
  }

  public static String overlay(String string, String overlay, int start, int end)
  {
    return StringUtils.overlay(string, overlay, start, end);
  }

  public static String chomp(String string)
  {
    return StringUtils.chomp(string);
  }

  public static String chomp(String string, String separator)
  {
    return StringUtils.chomp(string, separator);
  }

  @Deprecated
  public static String chompLast(String str, String sep)
  {
    if (str.length() == 0) {
      return str;
    }
    String strSub = str.substring(str.length() - sep.length());
    if (sep.equals(strSub)) {
      return str.substring(0, str.length() - sep.length());
    }
    return str;
  }

  @Deprecated
  public static String getChomp(String str, String sep)
  {
    int iIdx = str.lastIndexOf(sep);
    if (iIdx == str.length() - sep.length())
      return sep;
    if (iIdx != -1) {
      return str.substring(iIdx);
    }
    return "";
  }

  @Deprecated
  public static String prechomp(String str, String sep)
  {
    int iIdx = str.indexOf(sep);
    if (iIdx != -1) {
      return str.substring(iIdx + sep.length());
    }
    return str;
  }

  @Deprecated
  public static String getPrechomp(String str, String sep)
  {
    int iIdx = str.indexOf(sep);
    if (iIdx != -1) {
      return str.substring(0, iIdx + sep.length());
    }
    return "";
  }

  public static String chop(String string)
  {
    return StringUtils.chop(string);
  }

  @Deprecated
  public static String chopNewline(String str)
  {
    int iLastIdx = str.length() - 1;
    if (iLastIdx <= 0) {
      return "";
    }
    char chLast = str.charAt(iLastIdx);
    if (chLast == '\n') {
      if (str.charAt(iLastIdx - 1) == '\r')
        iLastIdx--;
    }
    else {
      iLastIdx++;
    }
    return str.substring(0, iLastIdx);
  }

  public static String repeat(String string, int repeat)
  {
    return StringUtils.repeat(string, repeat);
  }

  public static String padding(int repeat, char padChar)
  {
    String strPad = CONSTANTS_PADDING[padChar];
    if (strPad == null) {
      strPad = String.valueOf(padChar);
    }
    while (strPad.length() < repeat) {
      strPad = strPad.concat(strPad);
    }
    CONSTANTS_PADDING[padChar] = strPad;
    return strPad.substring(0, repeat);
  }

  public static String rightPad(String string, int size)
  {
    return StringUtils.rightPad(string, size);
  }

  public static String rightPad(String string, int size, char padChar)
  {
    return StringUtils.rightPad(string, size, padChar);
  }

  public static String rightPad(String string, int size, String padStr)
  {
    return StringUtils.rightPad(string, size, padStr);
  }

  public static String leftPad(String string, int size)
  {
    return StringUtils.leftPad(string, size);
  }

  public static String leftPad(String string, int size, char padChar)
  {
    return StringUtils.leftPad(string, size, padChar);
  }

  public static String leftPad(String string, int size, String padStr)
  {
    return StringUtils.leftPad(string, size, padStr);
  }

  public static String center(String string, int size)
  {
    return StringUtils.center(string, size);
  }

  public static String center(String string, int size, char padChar)
  {
    return StringUtils.center(string, size, padChar);
  }

  public static String center(String string, int size, String padStr)
  {
    return StringUtils.center(string, size, padStr);
  }

  public static String upperCase(String string)
  {
    return StringUtils.upperCase(string);
  }

  public static String lowerCase(String string)
  {
    return StringUtils.lowerCase(string);
  }

  public static String capitalize(String string)
  {
    return StringUtils.capitalize(string);
  }

  @Deprecated
  public static String capitalise(String str)
  {
    return capitalize(str);
  }

  public static String uncapitalize(String string)
  {
    return StringUtils.uncapitalize(string);
  }

  @Deprecated
  public static String uncapitalise(String str)
  {
    return uncapitalize(str);
  }

  public static String swapCase(String string)
  {
    return StringUtils.swapCase(string);
  }

  public static int countMatches(String string, String sub)
  {
    return StringUtils.countMatches(string, sub);
  }

  public static boolean isAlpha(String string)
  {
    return StringUtils.isAlpha(string);
  }

  public static boolean isAlphaSpace(String string)
  {
    return StringUtils.isAlphaSpace(string);
  }

  public static boolean isAlphanumeric(String string)
  {
    return StringUtils.isAlphanumeric(string);
  }

  public static boolean isAlphanumericSpace(String string)
  {
    return StringUtils.isAlphanumericSpace(string);
  }

  public static boolean isNumeric(String string)
  {
    return StringUtils.isNumeric(string);
  }

  public static boolean isNumericSpace(String string)
  {
    return StringUtils.isNumericSpace(string);
  }

  public static boolean isWhitespace(String string)
  {
    return StringUtils.isWhitespace(string);
  }

  public static String defaultString(String string)
  {
    return StringUtils.defaultString(string);
  }

  public static String defaultString(String string, String defaultStr)
  {
    return StringUtils.defaultString(string, defaultStr);
  }

  public static String reverse(String string)
  {
    return StringUtils.reverse(string);
  }

  public static String abbreviate(String string, int maxWidth)
  {
    return StringUtils.abbreviate(string, maxWidth);
  }

  public static String abbreviate(String string, int offset, int maxWidth)
  {
    return StringUtils.abbreviate(string, offset, maxWidth);
  }

  public static String difference(String str1, String str2)
  {
    return StringUtils.difference(str1, str2);
  }

  public static int indexOfDifference(String str1, String str2)
  {
    return StringUtils.indexOfDifference(str1, str2);
  }

  public static int getLevenshteinDistance(String s, String t)
  {
    return StringUtils.getLevenshteinDistance(s, t);
  }

  public static String filterSpecialChar(String string, String regex)
  {
    if (string == null) {
      return null;
    }

    Pattern objPattern = Pattern.compile(regex, 32);
    Matcher objMatcher = objPattern.matcher(string);
    return objMatcher.replaceAll("").trim();
  }

  public static boolean isMatch(String string, String regex)
  {
    if ((string == null) || (regex == null) || (regex.trim().length() == 0)) {
      return false;
    }
    Pattern objPattern = Pattern.compile(regex, 32);
    Matcher objMatcher = objPattern.matcher(string);
    return objMatcher.find();
  }

  public static String getFixedLengthString(String source, int len, String concat)
    throws UnsupportedEncodingException
  {
    String strRet = "";
    if ((source == null) || (concat == null)) {
      return "";
    }
    if (len <= 0) {
      return strRet;
    }
    for (int i = 1; i <= source.length(); i++) {
      strRet = source.substring(0, i);
      if (strRet.getBytes("GBK").length >= len) {
        break;
      }
    }
    if (strRet.getBytes("GBK").length < source.getBytes("GBK").length) {
      strRet = strRet + concat;
    }
    return strRet;
  }

  public static int getStringCharsCount(String pstrSrc)
  {
    int iSize = pstrSrc.length();
    int iHZCnt = 0;
    for (int i = 0; i < iSize; i++) {
      if ((pstrSrc.charAt(i) < 0) || (pstrSrc.charAt(i) > 'ÿ')) {
        iHZCnt++;
      }
    }
    iSize += iHZCnt;
    return iSize;
  }

  public static String toString(long[] lArray)
  {
    if (lArray == null) {
      return "null";
    }
    if (lArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBufer = new StringBuffer();
    sbBufer.append('[');
    sbBufer.append(lArray[0]);

    for (int i = 1; i < lArray.length; i++) {
      sbBufer.append(", ");
      sbBufer.append(lArray[i]);
    }

    sbBufer.append("]");
    return sbBufer.toString();
  }

  public static String toString(int[] iArray)
  {
    if (iArray == null) {
      return "null";
    }
    if (iArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(iArray[0]);

    for (int i = 1; i < iArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(iArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(short[] sArray)
  {
    if (sArray == null) {
      return "null";
    }
    if (sArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(sArray[0]);

    for (int i = 1; i < sArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(sArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(char[] cArray)
  {
    if (cArray == null) {
      return "null";
    }
    if (cArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(cArray[0]);

    for (int i = 1; i < cArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(cArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(byte[] bArray)
  {
    if (bArray == null) {
      return "null";
    }
    if (bArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(bArray[0]);

    for (int i = 1; i < bArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(bArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(boolean[] bArray)
  {
    if (bArray == null) {
      return "null";
    }
    if (bArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(bArray[0]);

    for (int i = 1; i < bArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(bArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(float[] fArray)
  {
    if (fArray == null) {
      return "null";
    }
    if (fArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(fArray[0]);

    for (int i = 1; i < fArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(fArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(double[] dArray)
  {
    if (dArray == null) {
      return "null";
    }
    if (dArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();
    sbBuffer.append('[');
    sbBuffer.append(dArray[0]);

    for (int i = 1; i < dArray.length; i++) {
      sbBuffer.append(", ");
      sbBuffer.append(dArray[i]);
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static String toString(Object[] objArray)
  {
    if (objArray == null) {
      return "null";
    }
    if (objArray.length == 0) {
      return "[]";
    }

    StringBuffer sbBuffer = new StringBuffer();

    for (int i = 0; i < objArray.length; i++) {
      if (i == 0)
        sbBuffer.append('[');
      else {
        sbBuffer.append(", ");
      }

      sbBuffer.append(String.valueOf(objArray[i]));
    }

    sbBuffer.append("]");
    return sbBuffer.toString();
  }

  public static boolean isContainChineseCharacter(String cnStr)
  {
    if (isEmpty(cnStr)) {
      return false;
    }
    char[] chArray = cnStr.toCharArray();
    boolean bIsContainChineseCharacter = false;
    for (int i = 0; i < chArray.length; i++) {
    	char c = chArray[i];
    	
      /*byte[] bBytes = chArray[i].getBytes();
      if (bBytes.length == 2) {
        int[] iInts = new int[2];
        bBytes[0] &= 255;
        bBytes[1] &= 255;
        if ((iInts[0] >= 129) && (iInts[0] <= 254) && (iInts[1] >= 64) && (iInts[1] <= 254)) {
          bIsContainChineseCharacter = true;
          break;
        }
      }*/
    }
    return bIsContainChineseCharacter;
  }

  public static int getStringLength(String str)
  {
    if (isEmpty(str)) {
      return 0;
    }
    int iLen = 0;
    char[] chArs = str.toCharArray();
    for (int i = 0; i < chArs.length; i++) {
      char chTemp = chArs[i];
      String strTemp = String.valueOf(chTemp);
      if (isContainChineseCharacter(strTemp))
        iLen += 2;
      else {
        iLen++;
      }
    }
    return iLen;
  }

  public static String replaceIllegalString(String strInput)
  {
    String strOutPut = 
      strInput.replaceAll("<", "&lt ").replaceAll(">", "&gt ").replaceAll("\"", "&#34 ").replaceAll("'", "&#39 ");
    return strOutPut;
  }
  
  /**
   * 将string按照length长度设置，左边不足部分填充为padding
   */
  public static String leftPadding(int length, char padding, String string) {
      if (string == null) {
          string = "";
      }
      int length1 = string.length();
      if (length1 >= length) {
          return string;
      }
      StringBuffer stringBuffer = new StringBuffer();

      for (int i = 0; i < length - length1; i++) {
          stringBuffer.append(padding);
      }
      stringBuffer.append(string);
      return stringBuffer.toString();
  }


  /**
   * 将字符串分割成maxLength长度的数组
   *
   * @param dest
   * @param maxLength
   * @return
   */
  public static String[] split(String dest, int maxLength) {
      if (dest == null) {
          return new String[0];
      }
      int length = 0;

      length = dest.length();
      if (length <= maxLength) {
          return new String[]{dest};
      }

      int count = length / maxLength;
      if (length % maxLength > 0)
          count++;

      String[] contents = new String[count];
      int pointer = 0;
      for (int i = 0; i < count - 1; i++) {
          contents[i] = dest.substring
                  (pointer, pointer + maxLength);
          pointer = pointer + maxLength;
      }
      contents[count - 1] = dest.substring(pointer);


      return contents;
  }

  /**
   * 获取字符串的长度，如果有中文，则每个中文字符计为2位
   *
   * @param value 指定的字符串
   * @return 字符串的长度
   */
  public static int length(String value) {
      int valueLength = 0;
      String chinese = "[\u0391-\uFFE5]";
      /* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
      for (int i = 0; i < value.length(); i++) {
          /* 获取一个字符 */
          String temp = value.substring(i, i + 1);
          /* 判断是否为中文字符 */
          if (temp.matches(chinese)) {
              /* 中文字符长度为2 */
              valueLength += 2;
          } else {
              /* 其他字符长度为1 */
              valueLength += 1;
          }
      }
      return valueLength;
  }
}
