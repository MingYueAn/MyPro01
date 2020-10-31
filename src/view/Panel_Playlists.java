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
		// TODO 自动生成的构造函数存根
		JLabel Title = new JLabel("播放列表");
		Font fTitle = new Font("楷体", Font.BOLD, 30);
		Title.setFont(fTitle);
		Title.setForeground(Color.white);
		this.add(Title);

	}

}
