package handle;

import java.sql.*;

import javax.swing.JOptionPane;

import Tool.getConnection;
import model.Register;

/**
 * ע�ᴦ����
 * 
 * @author л����
 */
public class HandleRegister {

	private Connection connection;
	private PreparedStatement preSQL;// Ԥ����������

	/**
	 * ���췽��������JDBC_MySQL���ݿ�����+�������ݿ�
	 */
	public HandleRegister() {
		// ���ݿ���+�û���+����
		// ����JDBC_MySQL���ݿ�����+�������ݿ�
		connection = getConnection.GetConnection("mypro01", "root", "");
	}

	/**
	 * ������д�����
	 * 
	 * @param register
	 */
	public void writeRegisterModel(Register register) {
		// SQL���
		String sqlString = "insert into register values(?,?,?)";
		int ok = 0;
		try {
			// ����sql���
			preSQL = connection.prepareStatement(sqlString);
			// ����Ҫ����Ĳ���
			preSQL.setString(1, register.getUserID());
			preSQL.setString(2, register.getUserPassword());
			preSQL.setString(3, register.getBirth());
			// ִ��sql���
			ok = preSQL.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "�˺Ų����ظ�", "����", JOptionPane.INFORMATION_MESSAGE);
		}
		if (ok != 0) {
			JOptionPane.showMessageDialog(null, "ע��ɹ�", "��ϲ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
