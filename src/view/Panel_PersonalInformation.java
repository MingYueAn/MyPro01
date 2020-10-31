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
	private JLabel Title;
	JLabel label1, label2;

	public Panel_PersonalInformation() {
		super(new ImageIcon("src\\image\\背景_2.jpg").getImage());
		// TODO 自动生成的构造函数存根
		Title = new JLabel("个人信息");
		Font fTitle = new Font("楷体", Font.BOLD, 30);
		Title.setFont(fTitle);
		Title.setForeground(Color.white);
		Title.setBounds(20, 100, 200, 50);
		this.add(Title);

		/* 窗体组件初始化 */
		this.init();
		/* 事件监听 */
		this.addListener();
	}

	/**
	 * 窗体组件初始化
	 */
	private void init() {
		// TODO 自动生成的方法存根
		this.setLayout(null);
		label1 = new JLabel("昵称");
		Font f1 = new Font("楷体", Font.BOLD, 20);
		label1.setFont(f1);
		label1.setForeground(Color.white);
		label1.setBounds(20, 10, 50, 20);
		this.add(label1);

		label2 = new JLabel("个性签名");
		Font f2 = new Font("楷体", Font.BOLD, 18);
		label2.setFont(f2);
		label2.setForeground(Color.white);
		label2.setBounds(20, 30, 100, 20);
		this.add(label2);

	}

	/**
	 * 事件监听
	 */
	private void addListener() {
		// TODO 自动生成的方法存根

	}

}
