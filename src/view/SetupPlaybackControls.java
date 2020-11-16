package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 * 设置播放控件
 * 
 * @author 谢晓艳
 */
public class SetupPlaybackControls extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	// 按钮（播放方式、上一首、播放、下一首）
	private JButton modeButton, lastButton, playButton, nextButton;
	// 滑块（播放进度、音量大小）
	private JSlider jSlider1, jSlider2;
	// 判断是否为播放状态
	private boolean pd = false;

	public SetupPlaybackControls() {
		super(new ImageIcon("src\\image\\背景_4.jpg").getImage());
		this.setLayout(null);
		init();
		addListener();
	}

	/**
	 * 窗体组件初始化
	 */
	public void init() {
		// 按钮（播放方式、上一首、播放、下一首）
		modeButton = new JButton(new ImageIcon("src/image/音乐-列表顺序.png"));
		modeButton.setContentAreaFilled(false);// 设置按钮透明
		lastButton = new JButton(new ImageIcon("src/image/音乐_上一首.png"));
		lastButton.setContentAreaFilled(false);// 设置按钮透明
		playButton = new JButton(new ImageIcon("src/image/音乐_暂停.png"));
		playButton.setContentAreaFilled(false);// 设置按钮透明
		nextButton = new JButton(new ImageIcon("src/image/音乐_下一首.png"));
		nextButton.setContentAreaFilled(false);// 设置按钮透明

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
		name.add(lastButton);
		name.add(playButton);
		name.add(nextButton);
		// panel4设置边界布局
		this.setLayout(new BorderLayout());
		this.add(jSlider1, BorderLayout.NORTH);
		this.add(modeButton, BorderLayout.WEST);
		this.add(name);
		this.add(jSlider2, BorderLayout.EAST);
	}

	/**
	 * 事件监听
	 */
	public void addListener() {
		// 添加刻度改变监听器——Java 8 Lambda 表达式
		jSlider1.addChangeListener((e) -> System.out.println("播放进度当前值: " + jSlider1.getValue()));
		jSlider2.addChangeListener((e) -> System.out.println("音量当前值: " + jSlider2.getValue()));

		if (!pd) {
//			playButton.addMouseListener();
		}
		if (pd) {
//			playButton.addMouseListener();
		}

	}

}