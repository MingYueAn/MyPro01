package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Tool.stringUtil;
import handle.HandleLogin;
import model.Login;

/**
 * ��¼����
 * 
 * @author л����
 */
public class Interface_Login extends JFrame {

	private static final long serialVersionUID = 1L;

	private boolean LoginSuccess;// �жϵ�¼�Ƿ�ɹ�

	// ��ť����¼��ע�ᣩ
	private JButton login = new JButton("��¼"), register = new JButton("ע��");
	// ��ǩ���˺ţ������룺����¼���棩
	private JLabel jLabel1 = new JLabel("�˺ţ�"), jLabel2 = new JLabel("���룺"), jLabelTitle = new JLabel("��¼����");
	// �ı��������˺ţ�
	private JTextField userID = new JTextField();
	// ������������룩
	private JPasswordField password = new JPasswordField();
	// ��ѡ�򣨼�ס���룩
	private JCheckBox remember = new JCheckBox("��ס����");;

	// �����м�����[���ò���]
	private JPanel panel;

	/**
	 * ���췽��
	 */
	public Interface_Login() {

		// ��������������
		// ���ô��ڱ���
		this.setTitle("��¼����");
		// ���ô��ڴ�С
		this.setSize(600, 500);
		// ���ô���λ��
//		this.setLocation(150, 200);
		// ������ʾ
		this.setLocationRelativeTo(null);

		// ������Image������Ķ���
		// JFmageIconʵ�ֵ���Icon�ӿ� ����û��ʵ��Image�����ࡣ
		// ��Ҫʹ��getImage()��ȡImage����
		ImageIcon icon = new ImageIcon("src\\image\\ͼ��_����.png");
		this.setIconImage(icon.getImage());

		// ���õ���رմ��ں������Ĵ���
		// ���еĲ���operationȡJFrame���еľ�̬����
		// window.setDefaultCloseOperation(operation);
		// JFrame.DO_NOTHING_ON_CLOSE ʲôҲ����
		// JFrame.HIDE_ON_CLOSE ���ص�ǰ����
		// JFrame.DISPOSE_ON_CLOSE ���ص�ǰ���ڣ����ͷŴ���ռ�е�������Դ
		// JFrrame.EXIT_ON_CLOSE ������������Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���������ʼ��
		this.init();
		// �¼�����
		this.addListener();
		// ���м����������ӵ�����
		this.setContentPane(panel);
		// ���ô����Ƿ������
		this.setResizable(false);
		// ���ô����Ƿ�ɼ�
		this.setVisible(true);

	}

	/**
	 * ���������ʼ��
	 */
	private void init() {

		Image image = new ImageIcon("src\\image\\����_��¼ע��.png").getImage();
		panel = new BackgroundPanel(image);
		panel.setLayout(null);

		// ��¼�����ǩ
		Font fTitle = new Font("΢���ź�", Font.BOLD, 25);
		jLabelTitle.setFont(fTitle);
		jLabelTitle.setBounds(250, 90, 100, 30);
		jLabelTitle.setForeground(Color.black);
		panel.add(jLabelTitle);

		Font f = new Font("����", 0, 12);

		// �˺ţ���ǩ
		jLabel1.setFont(f);
		jLabel1.setBounds(230, 155, 70, 25);
		jLabel1.setForeground(Color.black);
		panel.add(jLabel1);

		// �˺�ͼ��
		ImageIcon iconUserID = new ImageIcon("src/image/ͼ��_�ҵ�.png");
		iconUserID.setImage(iconUserID.getImage().getScaledInstance(15, 15, 15));
		JLabel iconJLabel1 = new JLabel();
		iconJLabel1.setIcon(iconUserID);
		iconJLabel1.setBounds(230, 180, 20, 25);
		panel.add(iconJLabel1);

		// ���룺��ǩ
		jLabel2.setFont(f);
		jLabel2.setBounds(230, 210, 70, 25);
		jLabel2.setForeground(Color.black);
		panel.add(jLabel2);

		// ����ͼ��
		ImageIcon iconPassword = new ImageIcon("src/image/ͼ��_����.png");
		iconPassword.setImage(iconPassword.getImage().getScaledInstance(15, 15, 15));
		JLabel iconJLabel2 = new JLabel();
		iconJLabel2.setIcon(iconPassword);
		iconJLabel2.setBounds(230, 235, 20, 25);
		panel.add(iconJLabel2);

		// �˺������
		userID.setBounds(250, 180, 120, 25);
		panel.add(userID);
		// ���������
		password.setBounds(250, 235, 120, 25);
		panel.add(password);

		// ��¼��ť
		login.setBounds(220, 300, 60, 30);
		panel.add(login);
		// ע�ᰴť
		register.setBounds(320, 300, 60, 30);
		panel.add(register);

		// ��ס���븴ѡ��
		remember.setBounds(320, 260, 80, 30);
		panel.add(remember);

	}

	/**
	 * �¼�����
	 */
	private void addListener() {
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��¼����
				forLogin();
			}

		});
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ע�᷽��
				forRegister();
			}

		});
	}

	/**
	 * ��¼����
	 */
	private void forLogin() {

		String userID = this.userID.getText();
		String password = new String(this.password.getPassword());

		if (stringUtil.isEmpty(userID)) {
			JOptionPane.showMessageDialog(null, "�û�������Ϊ��");
			return;
		}
		if (stringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
			return;
		}

		// ��¼ģ��
		Login login = new Login();
		login.setUserID(userID);
		login.setUserPassword(password);
		// ��¼������
		HandleLogin handleLogin = new HandleLogin();
		login = handleLogin.queryVerify(login);
		LoginSuccess = login.getLoginSuccess();

		if (LoginSuccess == true) {
			JOptionPane.showMessageDialog(null, "��¼�ɹ�", "��ϲ", JOptionPane.INFORMATION_MESSAGE);
			// ���ص�ǰ����
			this.setVisible(false);
			// ����������
			@SuppressWarnings("unused") // "unused"���ξ���
			Interface_MainFrame music_Tree = new Interface_MainFrame();
		} else {
			JOptionPane.showMessageDialog(null, "��¼ʧ��", "��¼ʧ�ܣ������µ�¼��", JOptionPane.INFORMATION_MESSAGE);
		}

		System.out.println("�˺ţ�" + userID);
		System.out.println("���룺" + password);
		System.out.println("LoginSuccess��" + LoginSuccess);
	}

	/**
	 * ע�᷽��
	 */
	private void forRegister() {
		// ���ص�ǰ����
		this.setVisible(false);
		@SuppressWarnings("unused") // "unused"���ξ���
		Interface_Register register = new Interface_Register();
	}

}
