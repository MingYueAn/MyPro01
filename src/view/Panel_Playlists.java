package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * �����б�
 * 
 * @author л����
 */
public class Panel_Playlists extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	public Panel_Playlists() {
		super(new ImageIcon("src\\image\\����_2.jpg").getImage());
		this.setLayout(null);
	}

	/**
	 * ���������ʼ��
	 */
	public void init(int w, int h) {
		JLabel Title = new JLabel("�����б�");
		Title.setFont(new Font("����", 0, 30));
		Title.setForeground(Color.white);
		Title.setBounds((w - 150) / 2, 0, 150, 30);
		this.add(Title);
	}

	/**
	 * �¼�����
	 */
	public void addListener() {
		// TODO �Զ����ɵķ������

	}

}
