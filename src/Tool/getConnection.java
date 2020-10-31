package Tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 加载JDBC_MySQL数据库驱动+连接数据库
 * 
 * @author 谢晓艳
 */
public class getConnection {
	/**
	 * 加载JDBC_MySQL数据库驱动+连接数据库
	 * 
	 * @param Name
	 * @param id
	 * @param p
	 * @return
	 */
	public static Connection GetConnection(String Name, String id, String p) {

		/* 加载JDBC_MySQL数据库驱动 */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		/* 连接数据库 */
		Connection connection = null;
		String uri = "jdbc:mysql://localhost:3306/" + Name + "?userSSL=true&characterEncoding=utf-8";
		try {
			// 连接代码
			connection = DriverManager.getConnection(uri, id, p);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return connection;
	}
}
