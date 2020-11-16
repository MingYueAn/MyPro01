package view;

import java.awt.*;
import java.io.File;

import javax.swing.*;

/**
 * 主界面
 * 
 * @author 谢晓艳
 */
public class Interface_MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	// 菜单条
	private JMenuBar jMenuBar = new SetupJMenuBar();

	// 按钮（个人信息、播放列表、音乐树、音乐岛、音乐书、设置）
	private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;

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
		this.setSize(1000, 600);
		// 居中显示
		this.setLocationRelativeTo(null);

		// 设置图标
		this.setIconImage(new ImageIcon("src\\image\\图标_音乐.png").getImage());

		// 设置点击关闭窗口后做出的处理
		// JFrame.DO_NOTHING_ON_CLOSE 什么也不做
		// JFrame.HIDE_ON_CLOSE 隐藏当前窗口
		// JFrame.DISPOSE_ON_CLOSE 隐藏当前窗口，并释放窗体占有的其他资源
		// JFrrame.EXIT_ON_CLOSE 结束窗口所在应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* 面板设置 */
		this.panelSettings();
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
	 * 面板设置
	 */
	private void panelSettings() {
		/* 设置菜单条 */
		this.setJMenuBar(jMenuBar);

		/* 面板panel1设置 */
		this.setupPanel1();
		/* 面板panel2设置 */
		this.setupPanel2();

		/* 面板panel3设置歌词显示 */
		panel3 = new SetupLyricsDisplay();
		/* 面板panel4设置播放控件 */
		panel4 = new SetupPlaybackControls();

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
	}

	/**
	 * 面板panel1设置功能按钮
	 */
	private void setupPanel1() {
		panel1 = new BackgroundPanel(new ImageIcon("src\\image\\背景_1.jpg").getImage());
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
		Title.setFont(new Font("楷体", 0, 30));
		Title.setForeground(Color.white);
		panel2.add(Title);
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

		// 个人信息面板初始化
		personalInformation.init(panel.getWidth(), panel.getHeight());
		// 个人信息面板事件监听
		personalInformation.addListener();

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

		// 播放列表面板初始化
		playlists.init(panel.getWidth(), panel.getHeight());
		// 播放面板面板事件监听
		playlists.addListener();

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

		// 音乐树面板初始化
		musicTree.init(panel.getWidth(), panel.getHeight());
		// 音乐树面板事件监听
		musicTree.addListener();

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

		// 音乐书面板初始化
		musicBook.init(panel.getWidth(), panel.getHeight());
		// 音乐书面板事件监听
		musicBook.addListener();

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

		// 音乐岛面板初始化
		musicIsland.init(panel.getWidth(), panel.getHeight());
		// 音乐岛面板事件监听
		musicIsland.addListener();

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

		// 设置面板初始化
		seting.init(panel.getWidth(), panel.getHeight());
		// 设置面板事件监听
		seting.addListener();

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
