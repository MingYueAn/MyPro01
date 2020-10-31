package handle;

import java.sql.*;

import Tool.getConnection;
import model.Login;

/**
 * ��¼������
 * 
 * @author л����
 */
public class HandleLogin {

	private Connection connection;
	private PreparedStatement preSQL;// Ԥ����������
	private ResultSet resultSet = null;

	/**
	 * ���췽��������JDBC_MySQL���ݿ�����+�������ݿ�
	 */
	public HandleLogin() {
		// ���ݿ���+�û���+����
		connection = getConnection.GetConnection("mypro01", "root", "");
	}

	/**
	 * ��ѯ��֤
	 * 
	 * @param login
	 * @return
	 */
	public Login queryVerify(Login login) {
		String UserID = login.getUserID();
		String UserPassword = login.getUserPassword();
		// SQL���
		String sqlString = "select UserID,UserPassword from register where " + "UserID = ? and UserPassword = ?";
		try {
			// ����sql���
			preSQL = connection.prepareStatement(sqlString);
			// ����Ҫ����Ĳ���
			preSQL.setString(1, UserID);
			preSQL.setString(2, UserPassword);
			// ִ��sql���
			resultSet = preSQL.executeQuery();
			// ����Ƿ��Ѿ�ע����û�
			if (resultSet.next()) {
				login.setLoginSuccess(true);
			}
			connection.close();
		} catch (SQLException e) {
		}
		return login;
	}
}
