package view;

import java.awt.*;
import javax.swing.*;

/**
 * ������Ϣ
 * 
 * @author л����
 */
public class Panel_PersonalInformation extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	public Panel_PersonalInformation() {
		super(new ImageIcon("src\\image\\����_2.jpg").getImage());
		this.setLayout(null);
	}

	/**
	 * ���������ʼ��
	 */
	public void init(int w, int h) {
		// TODO �Զ����ɵķ������
		JLabel Title = new JLabel("������Ϣ");
		Title.setFont(new Font("����", 0, 30));
		Title.setForeground(Color.white);
		Title.setBounds((w - 150) / 2, 0, 150, 30);
		this.add(Title);

		Font f1 = new Font("΢���ź�", 0, 15);

		JLabel label1 = new JLabel("�ǳ�");
		label1.setFont(f1);
		label1.setForeground(Color.white);
		label1.setBounds(20, 30, 100, 20);
		this.add(label1);

		JLabel label2 = new JLabel("����ǩ��");
		label2.setFont(f1);
		label2.setForeground(Color.white);
		label2.setBounds(20, 50, 100, 20);
		this.add(label2);

	}

	/**
	 * �¼�����
	 */
	public void addListener() {
		// TODO �Զ����ɵķ������

	}

}
