package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * ������
 * 
 * @author л����
 */
public class Panel_MusicTree extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	public Panel_MusicTree() {
		super(new ImageIcon("src\\image\\����_2.jpg").getImage());
		// TODO �Զ����ɵĹ��캯�����
		JLabel Title = new JLabel("������");
		Font fTitle = new Font("����", Font.BOLD, 30);
		Title.setFont(fTitle);
		Title.setForeground(Color.white);
		this.add(Title);

	}
}
