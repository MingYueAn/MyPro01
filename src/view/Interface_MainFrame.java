package view;

import java.awt.*;
import javax.swing.*;

/**
 * 主界面
 * 
 * @author 谢晓艳
 */
public class Interface_MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	// 菜单条
	private JMenuBar jMenuBar = new JMenuBar();
	// 菜单
	private JMenu jMenu1 = new JMenu("菜单");
	private JMenu jMenu2 = new JMenu("帮助");
	// 菜单项
	private JMenuItem jItem1_1 = new JMenuItem("打开文件");
	private JMenuItem jItem1_2 = new JMenuItem("打开文件夹");
	private JMenuItem jItem2_1 = new JMenuItem("关于");
	private JMenuItem jItem2_2 = new JMenuItem("帮助内容");

	// 功能按钮
	private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
	private JButton button1, button2, button3, button4;

	// 滑块（播放进度、音量大小）
	private JSlider jSlider1, jSlider2;

	// 创建中间容器[设置布局]
	private JPanel panel1, panel2, panel3, panel4;

	// 分割面板
	private JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true);
	private JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);
	private JSplitPane splitPane3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);

	/**
	 * 构造方法
	 */
	public Interface_MainFrame() {

		// 顶层容器的设置
		// 设置窗口标题
		this.setTitle("音域");
		// 设置窗口大小
		this.setSize(900, 600);
		// 居中显示
		this.setLocationRelativeTo(null);

		// 设置图标
		ImageIcon icon = new ImageIcon("src\\image\\图标_音乐.png");
		this.setIconImage(icon.getImage());

		// 设置点击关闭窗口后做出的处理
		// JFrame.DO_NOTHING_ON_CLOSE 什么也不做
		// JFrame.HIDE_ON_CLOSE 隐藏当前窗口
		// JFrame.DISPOSE_ON_CLOSE 隐藏当前窗口，并释放窗体占有的其他资源
		// JFrrame.EXIT_ON_CLOSE 结束窗口所在应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* 面板背景设置 */
		this.background();
		/* 窗体组件初始化 */
		this.init();
		/* 事件监听 */
		this.addListener();

		// 将分割面板添加到窗口
		this.add(splitPane3);
		// 设置窗口是否可缩放
		this.setResizable(false);
		// 设置窗口是否可见
		this.setVisible(true);
	}

	/**
	 * 面板背景设置
	 */
	private void background() {
		Image image1 = new ImageIcon("src\\image\\背景_1.jpg").getImage();
		Image image3 = new ImageIcon("src\\image\\背景_3.jpg").getImage();
		Image image4 = new ImageIcon("src\\image\\背景_4.jpg").getImage();
		panel1 = new BackgroundPanel(image1);
		panel3 = new BackgroundPanel(image3);
		panel4 = new BackgroundPanel(image4);
	}

	/**
	 * 窗体组件初始化
	 */
	private void init() {
		/* 设置菜单条 */
		this.setupMenuBar();
		/* 面板panel1设置 */
		this.setupPanel1();
		/* 面板panel2设置 */
		this.setupPanel2();
		/* 面板panel3设置 */
		this.setupPanel3();
		/* 面板panel4设置 */
		this.setupPanel4();
		/* 设置分割面板 */
		this.setupSplitPane();
	}

	/**
	 * 事件监听
	 */
	private void addListener() {
		// TODO 自动生成的方法存根
		jButton1.addActionListener((e) -> setupPanel_PersonalInformation(panel2, new Panel_PersonalInformation()));
		jButton2.addActionListener((e) -> setupPanel_Playlists(panel2, new Panel_Playlists()));
		jButton3.addActionListener((e) -> setupPanel_MusicTree(panel2, new Panel_MusicTree()));
		jButton4.addActionListener((e) -> setupPanel_MusicBook(panel2, new Panel_MusicBook()));
		jButton5.addActionListener((e) -> setupPanel_MusicIsland(panel2, new Panel_MusicIsland()));
		jButton6.addActionListener((e) -> setupPanel_Seting(panel2, new Panel_Seting()));
		// 添加刻度改变监听器——Java 8 Lambda 表达式
		jSlider1.addChangeListener((e) -> System.out.println("播放进度当前值: " + jSlider1.getValue()));
		jSlider2.addChangeListener((e) -> System.out.println("音量当前值: " + jSlider2.getValue()));
	}

	/**
	 * 设置菜单条
	 */
	private void setupMenuBar() {
		// TODO 自动生成的方法存根
		// 初始化菜单条
		jMenu1.add(jItem1_1);
		jMenu1.add(jItem1_2);
		jMenu2.add(jItem2_1);
		jMenu2.add(jItem2_2);
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		this.setJMenuBar(jMenuBar);
	}

	/**
	 * 面板panel1设置功能按钮
	 */
	private void setupPanel1() {
		// TODO 自动生成的方法存根
		// 按钮（个人信息、播放列表、音乐树、音乐岛、音乐书、设置）
		jButton1 = new JButton("个人信息");
		jButton1.setBounds(0, 100, 80, 45);
		jButton2 = new JButton("播放列表");
		jButton2.setBounds(0, 150, 80, 45);
		jButton3 = new JButton("音乐树");
		jButton3.setBounds(0, 200, 80, 45);
		jButton4 = new JButton("音乐书");
		jButton4.setBounds(0, 250, 80, 45);
		jButton5 = new JButton("音乐岛");
		jButton5.setBounds(0, 300, 80, 45);
		jButton6 = new JButton("设置");
		jButton6.setBounds(0, 350, 80, 45);
		// panel1设置绝对布局
		panel1.setLayout(null);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jButton6);
	}

	/**
	 * 面板panel2初始界面
	 */
	private void setupPanel2() {
		// TODO 自动生成的方法存根
		panel2 = new BackgroundPanel(new ImageIcon("src\\image\\背景_2.jpg").getImage());
		JLabel Title = new JLabel("欢迎来到音域！");
		Font fTitle = new Font("楷体", Font.BOLD, 30);
		Title.setFont(fTitle);
		Title.setForeground(Color.white);
		panel2.add(Title);
	}

	/**
	 * 面板panel3设置歌词显示
	 */
	private void setupPanel3() {
		// TODO 自动生成的方法存根

	}

	/**
	 * 面板panel4设置播放控件
	 */
	private void setupPanel4() {
		// TODO 自动生成的方法存根
		// 按钮（播放方式、上一首、播放、下一首）
		ImageIcon buttonIcon1 = new ImageIcon("src/image/音乐-列表顺序.png");
		button1 = new JButton(buttonIcon1);
		button1.setContentAreaFilled(false);// 设置按钮透明
		ImageIcon buttonIcon2 = new ImageIcon("src/image/音乐_上一首.png");
		button2 = new JButton(buttonIcon2);
		button2.setContentAreaFilled(false);// 设置按钮透明
		ImageIcon buttonIcon3 = new ImageIcon("src/image/音乐_暂停.png");
		button3 = new JButton(buttonIcon3);
		button3.setContentAreaFilled(false);// 设置按钮透明
		ImageIcon buttonIcon4 = new ImageIcon("src/image/音乐_下一首.png");
		button4 = new JButton(buttonIcon4);
		button4.setContentAreaFilled(false);// 设置按钮透明

		// 播放进度滑块
		jSlider1 = new JSlider(0, 100, 0);
		// 设置滑块的方向，SwingConstants.VERTICAL 或 SwingConstants.HORIZONTAL
		jSlider1.setOrientation(SwingConstants.HORIZONTAL);

		// 音量滑块
		jSlider2 = new JSlider(0, 100, 50);
		// 设置滑块的方向，SwingConstants.VERTICAL 或 SwingConstants.HORIZONTAL
		jSlider2.setOrientation(SwingConstants.VERTICAL);
		// 设置主刻度间隔
		jSlider2.setMajorTickSpacing(50);
		// 设置次刻度间隔
		jSlider2.setMinorTickSpacing(10);
		// 绘制 刻度 和 标签
		jSlider2.setPaintTicks(true);
		jSlider2.setPaintLabels(true);

		// 临时布局面板设置网格布局
		Image image = new ImageIcon("src\\image\\背景_4.jpg").getImage();
		JPanel name = new BackgroundPanel(image);
		name.setLayout(new GridLayout(1, 3));
		name.add(button2);
		name.add(button3);
		name.add(button4);
		// panel4设置边界布局
		panel4.setLayout(new BorderLayout());
		panel4.add(jSlider1, BorderLayout.NORTH);
		panel4.add(button1, BorderLayout.WEST);
		panel4.add(name);
		panel4.add(jSlider2, BorderLayout.EAST);
	}

	/**
	 * 设置分割面板
	 */
	private void setupSplitPane() {
		// TODO 自动生成的方法存根
		splitPane1.setLeftComponent(panel2);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);

		splitPane2.setLeftComponent(panel1);
		splitPane2.setRightComponent(splitPane1);
		// 设置分割线大小
		splitPane2.setDividerSize(0);
		// 设置分割线位置
		splitPane2.setDividerLocation(82);
		// 设置分割线拖动
		splitPane2.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane2.setOneTouchExpandable(false);

		splitPane3.setLeftComponent(splitPane2);
		splitPane3.setRightComponent(panel3);
		// 设置分割线大小
		splitPane3.setDividerSize(10);
		// 设置分割线位置
		splitPane3.setDividerLocation(700);
		// 设置分割线拖动
		splitPane3.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane3.setOneTouchExpandable(true);
	}

	// 个人信息面板
	private Object setupPanel_PersonalInformation(JPanel panel, Panel_PersonalInformation personalInformation) {
		// TODO 自动生成的方法存根
		System.out.println("个人信息界面");
		panel.removeAll();// 移除面板中的所有组件
		panel.add(personalInformation);// 添加要切换的面板
		panel.repaint();// 刷新页面，重绘面板
		panel.validate();// 使重绘的面板确认生效

		// 更换分割面板
		splitPane1.setLeftComponent(personalInformation);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// 播放列表面板
	private Object setupPanel_Playlists(JPanel panel, Panel_Playlists playlists) {
		// TODO 自动生成的方法存根
		System.out.println("播放列表界面");
		panel.removeAll();// 移除面板中的所有组件
		panel.add(playlists);// 添加要切换的面板
		panel.repaint();// 刷新页面，重绘面板
		panel.validate();// 使重绘的面板确认生效

		// 更换分割面板
		splitPane1.setLeftComponent(playlists);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// 音乐树面板
	private Object setupPanel_MusicTree(JPanel panel, Panel_MusicTree musicTree) {
		// TODO 自动生成的方法存根
		System.out.println("音乐树界面");
		panel.removeAll();// 移除面板中的所有组件
		panel.add(musicTree);// 添加要切换的面板
		panel.repaint();// 刷新页面，重绘面板
		panel.validate();// 使重绘的面板确认生效

		// 更换分割面板
		splitPane1.setLeftComponent(musicTree);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// 音乐书面板
	private Object setupPanel_MusicBook(JPanel panel, Panel_MusicBook musicBook) {
		// TODO 自动生成的方法存根
		System.out.println("音乐书界面");
		panel.removeAll();// 移除面板中的所有组件
		panel.add(musicBook);// 添加要切换的面板
		panel.repaint();// 刷新页面，重绘面板
		panel.validate();// 使重绘的面板确认生效

		// 更换分割面板
		splitPane1.setLeftComponent(musicBook);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// 音乐岛面板
	private Object setupPanel_MusicIsland(JPanel panel, Panel_MusicIsland musicIsland) {
		// TODO 自动生成的方法存根
		System.out.println("音乐岛界面");
		panel.removeAll();// 移除面板中的所有组件
		panel.add(musicIsland);// 添加要切换的面板
		panel.repaint();// 刷新页面，重绘面板
		panel.validate();// 使重绘的面板确认生效

		// 更换分割面板
		splitPane1.setLeftComponent(musicIsland);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// 设置面板
	private Object setupPanel_Seting(JPanel panel, Panel_Seting seting) {
		// TODO 自动生成的方法存根
		System.out.println("设置界面");
		panel.removeAll();// 移除面板中的所有组件
		panel.add(seting);// 添加要切换的面板
		panel.repaint();// 刷新页面，重绘面板
		panel.validate();// 使重绘的面板确认生效

		// 更换分割面板
		splitPane1.setLeftComponent(seting);
		splitPane1.setRightComponent(panel4);
		// 设置分割线大小
		splitPane1.setDividerSize(0);
		// 设置分割线位置
		splitPane1.setDividerLocation(470);
		// 设置分割线拖动
		splitPane1.setEnabled(false);
		// 在分隔符上提供UI小部件以快速扩展/折叠分隔符
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

}
