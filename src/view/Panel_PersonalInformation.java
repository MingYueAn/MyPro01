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
	private JLabel Title;
	JLabel label1, label2;

	public Panel_PersonalInformation() {
		super(new ImageIcon("src\\image\\����_2.jpg").getImage());
		// TODO �Զ����ɵĹ��캯�����
		Title = new JLabel("������Ϣ");
		Font fTitle = new Font("����", Font.BOLD, 30);
		Title.setFont(fTitle);
		Title.setForeground(Color.white);
		Title.setBounds(20, 100, 200, 50);
		this.add(Title);

		/* ���������ʼ�� */
		this.init();
		/* �¼����� */
		this.addListener();
	}

	/**
	 * ���������ʼ��
	 */
	private void init() {
		// TODO �Զ����ɵķ������
		this.setLayout(null);
		label1 = new JLabel("�ǳ�");
		Font f1 = new Font("����", Font.BOLD, 20);
		label1.setFont(f1);
		label1.setForeground(Color.white);
		label1.setBounds(20, 10, 50, 20);
		this.add(label1);

		label2 = new JLabel("����ǩ��");
		Font f2 = new Font("����", Font.BOLD, 18);
		label2.setFont(f2);
		label2.setForeground(Color.white);
		label2.setBounds(20, 30, 100, 20);
		this.add(label2);

	}

	/**
	 * �¼�����
	 */
	private void addListener() {
		// TODO �Զ����ɵķ������

	}

}
