package model;

/**
 * ��¼ģ��
 * 
 * @author л����
 */
public class Login {

	public String UserID;// �û��˺�
	public String UserPassword;// �û�����
	public boolean LoginSuccess = false;// �жϵ�¼�Ƿ�ɹ�

	/**
	 * @return userID
	 */
	public String getUserID() {
		return UserID;
	}

	/**
	 * @param userID Ҫ���õ� userID
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
	 * @param userPassword Ҫ���õ� userPassword
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
	 * @param loginSuccess Ҫ���õ� loginSuccess
	 */
	public void setLoginSuccess(boolean loginSuccess) {
		LoginSuccess = loginSuccess;
	}

}
