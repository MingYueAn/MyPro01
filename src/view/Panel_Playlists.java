package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 播放列表
 * 
 * @author 谢晓艳
 */
public class Panel_Playlists extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	public Panel_Playlists() {
		super(new ImageIcon("src\\image\\背景_2.jpg").getImage());
		this.setLayout(null);
	}

	/**
	 * 窗体组件初始化
	 */
	public void init(int w, int h) {
		JLabel Title = new JLabel("播放列表");
		Title.setFont(new Font("楷体", 0, 30));
		Title.setForeground(Color.white);
		Title.setBounds((w - 150) / 2, 0, 150, 30);
		this.add(Title);
	}

	/**
	 * 事件监听
	 */
	public void addListener() {
		// TODO 自动生成的方法存根

	}

}
