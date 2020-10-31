package model;

/**
 * 注册模型
 * 
 * @author 谢晓艳
 */
public class Register {

	public String UserID;// 用户账号
	public String UserPassword;// 用户密码
	public String Birth;// 用户注册时间

	/**
	 * @return userID
	 */
	public String getUserID() {
		return UserID;
	}

	/**
	 * @param userID 要设置的 userID
	 */
	public void setUserID(String userID) {
		UserID = userID;
	}

	/**
	 * @return userPassword
	 */
	public String getUserPassword() {
		return UserPassword;
	}

	/**
	 * @param userPassword 要设置的 userPassword
	 */
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	/**
	 * @return birth
	 */
	public String getBirth() {
		return Birth;
	}

	/**
	 * @param birth 要设置的 birth
	 */
	public void setBirth(String birth) {
		Birth = birth;
	}

}
