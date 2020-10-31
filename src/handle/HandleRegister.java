package handle;

import java.sql.*;

import javax.swing.JOptionPane;

import Tool.getConnection;
import model.Register;

/**
 * 注册处理者
 * 
 * @author 谢晓艳
 */
public class HandleRegister {

	private Connection connection;
	private PreparedStatement preSQL;// 预处理语句对象

	/**
	 * 构造方法：加载JDBC_MySQL数据库驱动+连接数据库
	 */
	public HandleRegister() {
		// 数据库名+用户名+密码
		// 加载JDBC_MySQL数据库驱动+连接数据库
		connection = getConnection.GetConnection("mypro01", "root", "");
	}

	/**
	 * 将数据写入表中
	 * 
	 * @param register
	 */
	public void writeRegisterModel(Register register) {
		// SQL语句
		String sqlString = "insert into register values(?,?,?)";
		int ok = 0;
		try {
			// 发送sql语句
			preSQL = connection.prepareStatement(sqlString);
			// 设置要传入的参数
			preSQL.setString(1, register.getUserID());
			preSQL.setString(2, register.getUserPassword());
			preSQL.setString(3, register.getBirth());
			// 执行sql语句
			ok = preSQL.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "账号不能重复", "警告", JOptionPane.INFORMATION_MESSAGE);
		}
		if (ok != 0) {
			JOptionPane.showMessageDialog(null, "注册成功", "恭喜", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
