package model;

/**
 * ע��ģ��
 * 
 * @author л����
 */
public class Register {

	public String UserID;// �û��˺�
	public String UserPassword;// �û�����
	public String Birth;// �û�ע��ʱ��

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
	 * @return birth
	 */
	public String getBirth() {
		return Birth;
	}

	/**
	 * @param birth Ҫ���õ� birth
	 */
	public void setBirth(String birth) {
		Birth = birth;
	}

}
