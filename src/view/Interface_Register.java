package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import Tool.stringUtil;
import handle.HandleRegister;
import model.Register;

/**
 * ע�����
 * 
 * @author л����
 */
public class Interface_Register extends JFrame {

	private static final long serialVersionUID = 1L;

	// ��ť�����ص�¼��ȷ��ע�ᣩ
	private JButton back = new JButton("���ص�¼"), ok = new JButton("ȷ��ע��");
	// ��ǩ���˺ţ������룺��ȷ�����룺��ע����棩
	private JLabel jLabel1 = new JLabel("�˺ţ�"), jLabel2 = new JLabel("���룺"), jLabel3 = new JLabel("ȷ�����룺"),
			jLabelTitle = new JLabel("ע�����");
	// �ı��������˺ţ�
	private JTextField userID = new JTextField();
	// ������������룩
	private JPasswordField password1 = new JPasswordField();
	// �����ȷ�����룩
	private JPasswordField password2 = new JPasswordField();

	// �����м�����[���ò���]
	private JPanel panel;

	/**
	 * ���췽��
	 */
	public Interface_Register() {

		// ��������������
		// ���ô��ڱ���
		this.setTitle("ע�����");
		// ���ô��ڴ�С
		this.setSize(600, 500);
		// ���ô���λ��
		// this.setLocation(150, 200);
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

		// ע������ǩ
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

		// ȷ�����룺��ǩ
		jLabel3.setFont(f);
		jLabel3.setBounds(230, 265, 70, 25);
		jLabel3.setForeground(Color.black);
		panel.add(jLabel3);

		// ȷ������ͼ��
		JLabel iconJLabel3 = new JLabel();
		iconJLabel3.setIcon(iconPassword);
		iconJLabel3.setBounds(230, 290, 20, 25);
		panel.add(iconJLabel3);

		// �˺������
		userID.setBounds(250, 180, 120, 25);
		panel.add(userID);
		// ���������
		password1.setBounds(250, 235, 120, 25);
		panel.add(password1);
		// ȷ�����������
		password2.setBounds(250, 290, 120, 25);
		panel.add(password2);

		// ���ص�¼��ť
		back.setBounds(200, 330, 90, 30);
		panel.add(back);
		// ȷ��ע�ᰴť
		ok.setBounds(340, 330, 90, 30);
		panel.add(ok);

	}

	/**
	 * �¼�����
	 */
	private void addListener() {
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ص�¼����
				backLogin();
			}

		});
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ȷ��ע�᷽��
				setRegister();
			}

		});
	}

	/**
	 * ���ص�¼���淽��
	 */
	private void backLogin() {
		// ���ص�ǰ����
		this.setVisible(false);
		@SuppressWarnings("unused") // "unused"���ξ���
		Interface_Login login = new Interface_Login();
	}

	/**
	 * ʵ��ע���˻�����
	 */
	private void setRegister() {

		String userID = this.userID.getText();
		String password1 = new String(this.password1.getPassword());
		String password2 = new String(this.password2.getPassword());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// ����ʱ���ʽ
		String Brith = formatter.format(new Date());

		if (stringUtil.isEmpty(userID)) {
			JOptionPane.showMessageDialog(null, "�û�������Ϊ��");
			return;
		}
		if (stringUtil.isEmpty(password1)) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
			return;
		}
		if (stringUtil.isEmpty(password2)) {
			JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
			return;
		}
		if (password1.equals(password2) == false) {
			JOptionPane.showMessageDialog(null, "�����������벻һ��");
			return;
		}

		// ע��ģ��
		Register register = new Register();
		register.setUserID(userID);
		register.setUserPassword(password1);

		register.setBirth(Brith);
		// ע�ᴦ����
		HandleRegister handleRegister = new HandleRegister();
		handleRegister.writeRegisterModel(register);

		System.out.println("�˺ţ�" + userID);
		System.out.println("���룺" + password1);
		System.out.println("ȷ�����룺" + password2);
		System.out.println("ע��ʱ�䣺" + Brith);
	}
}
