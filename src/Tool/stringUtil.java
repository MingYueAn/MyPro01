package Tool;

/**
 * 字符串工具类
 * 
 * @author 谢晓艳
 */
public class stringUtil {
	/**
	 * 判断是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断是否不是空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNoEmpty(String str) {
		if (str != null && "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}
}
