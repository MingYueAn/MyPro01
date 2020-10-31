package model;

/**
 * 登录模型
 * 
 * @author 谢晓艳
 */
public class Login {

	public String UserID;// 用户账号
	public String UserPassword;// 用户密码
	public boolean LoginSuccess = false;// 判断登录是否成功

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
	 * @return loginSuccess
	 */
	public boolean getLoginSuccess() {
		return LoginSuccess;
	}

	/**
	 * @param loginSuccess 要设置的 loginSuccess
	 */
	public void setLoginSuccess(boolean loginSuccess) {
		LoginSuccess = loginSuccess;
	}

}
