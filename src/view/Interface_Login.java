package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Tool.stringUtil;
import handle.HandleLogin;
import model.Login;

/**
 * 登录界面
 * 
 * @author 谢晓艳
 */
public class Interface_Login extends JFrame {

	private static final long serialVersionUID = 1L;

	private boolean LoginSuccess;// 判断登录是否成功

	// 按钮（登录、注册）
	private JButton login = new JButton("登录"), register = new JButton("注册");
	// 标签（账号：、密码：、登录界面）
	private JLabel jLabel1 = new JLabel("账号："), jLabel2 = new JLabel("密码："), jLabelTitle = new JLabel("登录界面");
	// 文本框（输入账号）
	private JTextField userID = new JTextField();
	// 密码框（输入密码）
	private JPasswordField password = new JPasswordField();
	// 复选框（记住密码）
	private JCheckBox remember = new JCheckBox("记住密码");;

	// 创建中间容器[设置布局]
	private JPanel panel;

	/**
	 * 构造方法
	 */
	public Interface_Login() {

		// 顶层容器的设置
		// 设置窗口标题
		this.setTitle("登录界面");
		// 设置窗口大小
		this.setSize(600, 500);
		// 设置窗口位置
//		this.setLocation(150, 200);
		// 居中显示
		this.setLocationRelativeTo(null);

		// 参数是Image抽象类的对象。
		// JFmageIcon实现的是Icon接口 ，并没有实现Image抽象类。
		// 需要使用getImage()获取Image对象
		ImageIcon icon = new ImageIcon("src\\image\\图标_音乐.png");
		this.setIconImage(icon.getImage());

		// 设置点击关闭窗口后做出的处理
		// 其中的参数operation取JFrame类中的静态常量
		// window.setDefaultCloseOperation(operation);
		// JFrame.DO_NOTHING_ON_CLOSE 什么也不做
		// JFrame.HIDE_ON_CLOSE 隐藏当前窗口
		// JFrame.DISPOSE_ON_CLOSE 隐藏当前窗口，并释放窗体占有的其他资源
		// JFrrame.EXIT_ON_CLOSE 结束窗口所在应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 窗体组件初始化
		this.init();
		// 事件监听
		this.addListener();
		// 将中间容器面板添加到窗口
		this.setContentPane(panel);
		// 设置窗口是否可缩放
		this.setResizable(false);
		// 设置窗口是否可见
		this.setVisible(true);

	}

	/**
	 * 窗体组件初始化
	 */
	private void init() {

		Image image = new ImageIcon("src\\image\\背景_登录注册.png").getImage();
		panel = new BackgroundPanel(image);
		panel.setLayout(null);

		// 登录界面标签
		Font fTitle = new Font("微软雅黑", Font.BOLD, 25);
		jLabelTitle.setFont(fTitle);
		jLabelTitle.setBounds(250, 90, 100, 30);
		jLabelTitle.setForeground(Color.black);
		panel.add(jLabelTitle);

		Font f = new Font("宋体", 0, 12);

		// 账号：标签
		jLabel1.setFont(f);
		jLabel1.setBounds(230, 155, 70, 25);
		jLabel1.setForeground(Color.black);
		panel.add(jLabel1);

		// 账号图标
		ImageIcon iconUserID = new ImageIcon("src/image/图标_我的.png");
		iconUserID.setImage(iconUserID.getImage().getScaledInstance(15, 15, 15));
		JLabel iconJLabel1 = new JLabel();
		iconJLabel1.setIcon(iconUserID);
		iconJLabel1.setBounds(230, 180, 20, 25);
		panel.add(iconJLabel1);

		// 密码：标签
		jLabel2.setFont(f);
		jLabel2.setBounds(230, 210, 70, 25);
		jLabel2.setForeground(Color.black);
		panel.add(jLabel2);

		// 密码图标
		ImageIcon iconPassword = new ImageIcon("src/image/图标_密码.png");
		iconPassword.setImage(iconPassword.getImage().getScaledInstance(15, 15, 15));
		JLabel iconJLabel2 = new JLabel();
		iconJLabel2.setIcon(iconPassword);
		iconJLabel2.setBounds(230, 235, 20, 25);
		panel.add(iconJLabel2);

		// 账号输入框
		userID.setBounds(250, 180, 120, 25);
		panel.add(userID);
		// 密码输入框
		password.setBounds(250, 235, 120, 25);
		panel.add(password);

		// 登录按钮
		login.setBounds(220, 300, 60, 30);
		panel.add(login);
		// 注册按钮
		register.setBounds(320, 300, 60, 30);
		panel.add(register);

		// 记住密码复选框
		remember.setBounds(320, 260, 80, 30);
		panel.add(remember);

	}

	/**
	 * 事件监听
	 */
	private void addListener() {
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 登录方法
				forLogin();
			}

		});
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 注册方法
				forRegister();
			}

		});
	}

	/**
	 * 登录方法
	 */
	private void forLogin() {

		String userID = this.userID.getText();
		String password = new String(this.password.getPassword());

		if (stringUtil.isEmpty(userID)) {
			JOptionPane.showMessageDialog(null, "用户名不能为空");
			return;
		}
		if (stringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空");
			return;
		}

		// 登录模型
		Login login = new Login();
		login.setUserID(userID);
		login.setUserPassword(password);
		// 登录处理者
		HandleLogin handleLogin = new HandleLogin();
		login = handleLogin.queryVerify(login);
		LoginSuccess = login.getLoginSuccess();

		if (LoginSuccess == true) {
			JOptionPane.showMessageDialog(null, "登录成功", "恭喜", JOptionPane.INFORMATION_MESSAGE);
			// 隐藏当前界面
			this.setVisible(false);
			// 进入主界面
			@SuppressWarnings("unused") // "unused"屏蔽警告
			Interface_MainFrame music_Tree = new Interface_MainFrame();
		} else {
			JOptionPane.showMessageDialog(null, "登录失败", "登录失败，请重新登录！", JOptionPane.INFORMATION_MESSAGE);
		}

		System.out.println("账号：" + userID);
		System.out.println("密码：" + password);
		System.out.println("LoginSuccess：" + LoginSuccess);
	}

	/**
	 * 注册方法
	 */
	private void forRegister() {
		// 隐藏当前界面
		this.setVisible(false);
		@SuppressWarnings("unused") // "unused"屏蔽警告
		Interface_Register register = new Interface_Register();
	}

}
