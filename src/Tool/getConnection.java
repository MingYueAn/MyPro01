package Tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ����JDBC_MySQL���ݿ�����+�������ݿ�
 * 
 * @author л����
 */
public class getConnection {
	/**
	 * ����JDBC_MySQL���ݿ�����+�������ݿ�
	 * 
	 * @param Name
	 * @param id
	 * @param p
	 * @return
	 */
	public static Connection GetConnection(String Name, String id, String p) {

		/* ����JDBC_MySQL���ݿ����� */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		/* �������ݿ� */
		Connection connection = null;
		String uri = "jdbc:mysql://localhost:3306/" + Name + "?userSSL=true&characterEncoding=utf-8";
		try {
			// ���Ӵ���
			connection = DriverManager.getConnection(uri, id, p);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return connection;
	}
}
