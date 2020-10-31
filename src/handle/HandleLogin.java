package handle;

import java.sql.*;

import Tool.getConnection;
import model.Login;

/**
 * 登录处理者
 * 
 * @author 谢晓艳
 */
public class HandleLogin {

	private Connection connection;
	private PreparedStatement preSQL;// 预处理语句对象
	private ResultSet resultSet = null;

	/**
	 * 构造方法：加载JDBC_MySQL数据库驱动+连接数据库
	 */
	public HandleLogin() {
		// 数据库名+用户名+密码
		connection = getConnection.GetConnection("mypro01", "root", "");
	}

	/**
	 * 查询验证
	 * 
	 * @param login
	 * @return
	 */
	public Login queryVerify(Login login) {
		String UserID = login.getUserID();
		String UserPassword = login.getUserPassword();
		// SQL语句
		String sqlString = "select UserID,UserPassword from register where " + "UserID = ? and UserPassword = ?";
		try {
			// 发送sql语句
			preSQL = connection.prepareStatement(sqlString);
			// 设置要传入的参数
			preSQL.setString(1, UserID);
			preSQL.setString(2, UserPassword);
			// 执行sql语句
			resultSet = preSQL.executeQuery();
			// 检查是否已经注册的用户
			if (resultSet.next()) {
				login.setLoginSuccess(true);
			}
			connection.close();
		} catch (SQLException e) {
		}
		return login;
	}
}
