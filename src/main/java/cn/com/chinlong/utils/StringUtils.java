package cn.com.chinlong.utils;

import cn.com.chinlong.common.Constant.Sign;

/**
 * 字符串工具类
 * 
 * @author ChinLong
 *
 */
public class StringUtils {
	/**
	 * 安全ToString
	 * 
	 * @param object
	 * @return
	 */
	public static String safeToString(Object object) {
		return null == object ? "" : object.toString();
	}

	/**
	 * 安全去空
	 * 
	 * @param obj
	 * @return
	 */
	public static String safeTrim(Object obj) {
		char[] charArr = safeToString(obj).toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if ((charArr[i] > ' ') && (charArr[i] != '　')) {
				break;
			}
			if (charArr[i] == '　') {
				charArr[i] = ' ';
			}
		}
		for (int i = charArr.length - 1; i >= 0; i--) {
			if ((charArr[i] > ' ') && (charArr[i] != '　')) {
				break;
			}
			if (charArr[i] == '　') {
				charArr[i] = ' ';
			}
		}

		return new String(charArr).trim();
	}

	/**
	 * 判断字符串为空
	 * 
	 * @param strVal
	 * @return
	 */
	public static boolean isEmpty(String strVal) {
		return (strVal == null) || (safeTrim(strVal).isEmpty());
	}

	/**
	 * 判断字符串不是空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 首字母转大写
	 * 
	 * @param str
	 * @return
	 */
	public static String upperFirstCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		str = sb.toString();
		return str;
	}

	/**
	 * 首字母转小写
	 * 
	 * @param str
	 * @return
	 */
	public static String lowerFirstCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		str = sb.toString();
		return str;
	}

	/**
	 * 驼峰原则
	 * 
	 * @param str
	 * @return
	 */
	public static String underscoreToCamel(String str) {
		StringBuffer sb = new StringBuffer();
		if (null != str) {
			str = str.toLowerCase();
			String[] strArr = str.split(Sign.UNDERSCORE);
			for (String string : strArr) {
				sb.append(upperFirstCase(safeTrim(string)));
			}
			sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		}
		return sb.toString();
	}
}
