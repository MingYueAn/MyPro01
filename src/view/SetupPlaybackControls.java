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
 * ���ò��ſؼ�
 * 
 * @author л����
 */
public class SetupPlaybackControls extends BackgroundPanel {

	private static final long serialVersionUID = 1L;

	// ��ť�����ŷ�ʽ����һ�ס����š���һ�ף�
	private JButton modeButton, lastButton, playButton, nextButton;
	// ���飨���Ž��ȡ�������С��
	private JSlider jSlider1, jSlider2;
	// �ж��Ƿ�Ϊ����״̬
	private boolean pd = false;

	public SetupPlaybackControls() {
		super(new ImageIcon("src\\image\\����_4.jpg").getImage());
		this.setLayout(null);
		init();
		addListener();
	}

	/**
	 * ���������ʼ��
	 */
	public void init() {
		// ��ť�����ŷ�ʽ����һ�ס����š���һ�ף�
		modeButton = new JButton(new ImageIcon("src/image/����-�б�˳��.png"));
		modeButton.setContentAreaFilled(false);// ���ð�ť͸��
		lastButton = new JButton(new ImageIcon("src/image/����_��һ��.png"));
		lastButton.setContentAreaFilled(false);// ���ð�ť͸��
		playButton = new JButton(new ImageIcon("src/image/����_��ͣ.png"));
		playButton.setContentAreaFilled(false);// ���ð�ť͸��
		nextButton = new JButton(new ImageIcon("src/image/����_��һ��.png"));
		nextButton.setContentAreaFilled(false);// ���ð�ť͸��

		// ���Ž��Ȼ���
		jSlider1 = new JSlider(0, 100, 0);
		// ���û���ķ���SwingConstants.VERTICAL �� SwingConstants.HORIZONTAL
		jSlider1.setOrientation(SwingConstants.HORIZONTAL);

		// ��������
		jSlider2 = new JSlider(0, 100, 50);
		// ���û���ķ���SwingConstants.VERTICAL �� SwingConstants.HORIZONTAL
		jSlider2.setOrientation(SwingConstants.VERTICAL);
		// �������̶ȼ��
		jSlider2.setMajorTickSpacing(50);
		// ���ôο̶ȼ��
		jSlider2.setMinorTickSpacing(10);
		// ���� �̶� �� ��ǩ
		jSlider2.setPaintTicks(true);
		jSlider2.setPaintLabels(true);

		// ��ʱ��������������񲼾�
		Image image = new ImageIcon("src\\image\\����_4.jpg").getImage();
		JPanel name = new BackgroundPanel(image);
		name.setLayout(new GridLayout(1, 3));
		name.add(lastButton);
		name.add(playButton);
		name.add(nextButton);
		// panel4���ñ߽粼��
		this.setLayout(new BorderLayout());
		this.add(jSlider1, BorderLayout.NORTH);
		this.add(modeButton, BorderLayout.WEST);
		this.add(name);
		this.add(jSlider2, BorderLayout.EAST);
	}

	/**
	 * �¼�����
	 */
	public void addListener() {
		// ��ӿ̶ȸı����������Java 8 Lambda ���ʽ
		jSlider1.addChangeListener((e) -> System.out.println("���Ž��ȵ�ǰֵ: " + jSlider1.getValue()));
		jSlider2.addChangeListener((e) -> System.out.println("������ǰֵ: " + jSlider2.getValue()));

		if (!pd) {
//			playButton.addMouseListener();
		}
		if (pd) {
//			playButton.addMouseListener();
		}

	}

}