package view;

import java.awt.*;
import javax.swing.*;

/**
 * 个人信息
 * 
 * @author 谢晓艳
 */
public class Panel_PersonalInformation extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	public Panel_PersonalInformation() {
		super(new ImageIcon("src\\image\\背景_2.jpg").getImage());
		this.setLayout(null);
	}

	/**
	 * 窗体组件初始化
	 */
	public void init(int w, int h) {
		// TODO 自动生成的方法存根
		JLabel Title = new JLabel("个人信息");
		Title.setFont(new Font("楷体", 0, 30));
		Title.setForeground(Color.white);
		Title.setBounds((w - 150) / 2, 0, 150, 30);
		this.add(Title);

		Font f1 = new Font("微软雅黑", 0, 15);

		JLabel label1 = new JLabel("昵称");
		label1.setFont(f1);
		label1.setForeground(Color.white);
		label1.setBounds(20, 30, 100, 20);
		this.add(label1);

		JLabel label2 = new JLabel("个性签名");
		label2.setFont(f1);
		label2.setForeground(Color.white);
		label2.setBounds(20, 50, 100, 20);
		this.add(label2);

	}

	/**
	 * 事件监听
	 */
	public void addListener() {
		// TODO 自动生成的方法存根

	}

}
