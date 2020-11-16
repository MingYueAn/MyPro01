package view;

import java.awt.*;
import java.io.File;

import javax.swing.*;

/**
 * ������
 * 
 * @author л����
 */
public class Interface_MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	// �˵���
	private JMenuBar jMenuBar = new SetupJMenuBar();

	// ��ť��������Ϣ�������б������������ֵ��������顢���ã�
	private JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;

	// �����м�����[���ò���]
	private JPanel panel1, panel2, panel3, panel4;

	// �ָ����
	private JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true);
	private JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);
	private JSplitPane splitPane3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true);

	/**
	 * ���췽��
	 */
	public Interface_MainFrame() {

		// ��������������
		// ���ô��ڱ���
		this.setTitle("����");
		// ���ô��ڴ�С
		this.setSize(1000, 600);
		// ������ʾ
		this.setLocationRelativeTo(null);

		// ����ͼ��
		this.setIconImage(new ImageIcon("src\\image\\ͼ��_����.png").getImage());

		// ���õ���رմ��ں������Ĵ���
		// JFrame.DO_NOTHING_ON_CLOSE ʲôҲ����
		// JFrame.HIDE_ON_CLOSE ���ص�ǰ����
		// JFrame.DISPOSE_ON_CLOSE ���ص�ǰ���ڣ����ͷŴ���ռ�е�������Դ
		// JFrrame.EXIT_ON_CLOSE ������������Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* ������� */
		this.panelSettings();
		/* �¼����� */
		this.addListener();

		// ���ָ������ӵ�����
		this.add(splitPane3);
		// ���ô����Ƿ������
		this.setResizable(false);
		// ���ô����Ƿ�ɼ�
		this.setVisible(true);
	}

	/**
	 * �������
	 */
	private void panelSettings() {
		/* ���ò˵��� */
		this.setJMenuBar(jMenuBar);

		/* ���panel1���� */
		this.setupPanel1();
		/* ���panel2���� */
		this.setupPanel2();

		/* ���panel3���ø����ʾ */
		panel3 = new SetupLyricsDisplay();
		/* ���panel4���ò��ſؼ� */
		panel4 = new SetupPlaybackControls();

		/* ���÷ָ���� */
		this.setupSplitPane();
	}

	/**
	 * �¼�����
	 */
	private void addListener() {
		// TODO �Զ����ɵķ������
		jButton1.addActionListener((e) -> setupPanel_PersonalInformation(panel2, new Panel_PersonalInformation()));
		jButton2.addActionListener((e) -> setupPanel_Playlists(panel2, new Panel_Playlists()));
		jButton3.addActionListener((e) -> setupPanel_MusicTree(panel2, new Panel_MusicTree()));
		jButton4.addActionListener((e) -> setupPanel_MusicBook(panel2, new Panel_MusicBook()));
		jButton5.addActionListener((e) -> setupPanel_MusicIsland(panel2, new Panel_MusicIsland()));
		jButton6.addActionListener((e) -> setupPanel_Seting(panel2, new Panel_Seting()));
	}

	/**
	 * ���panel1���ù��ܰ�ť
	 */
	private void setupPanel1() {
		panel1 = new BackgroundPanel(new ImageIcon("src\\image\\����_1.jpg").getImage());
		// ��ť��������Ϣ�������б������������ֵ��������顢���ã�
		jButton1 = new JButton("������Ϣ");
		jButton1.setBounds(0, 100, 80, 45);
		jButton2 = new JButton("�����б�");
		jButton2.setBounds(0, 150, 80, 45);
		jButton3 = new JButton("������");
		jButton3.setBounds(0, 200, 80, 45);
		jButton4 = new JButton("������");
		jButton4.setBounds(0, 250, 80, 45);
		jButton5 = new JButton("���ֵ�");
		jButton5.setBounds(0, 300, 80, 45);
		jButton6 = new JButton("����");
		jButton6.setBounds(0, 350, 80, 45);
		// panel1���þ��Բ���
		panel1.setLayout(null);
		panel1.add(jButton1);
		panel1.add(jButton2);
		panel1.add(jButton3);
		panel1.add(jButton4);
		panel1.add(jButton5);
		panel1.add(jButton6);
	}

	/**
	 * ���panel2��ʼ����
	 */
	private void setupPanel2() {
		// TODO �Զ����ɵķ������
		panel2 = new BackgroundPanel(new ImageIcon("src\\image\\����_2.jpg").getImage());
		JLabel Title = new JLabel("��ӭ��������");
		Title.setFont(new Font("����", 0, 30));
		Title.setForeground(Color.white);
		panel2.add(Title);
	}

	/**
	 * ���÷ָ����
	 */
	private void setupSplitPane() {
		// TODO �Զ����ɵķ������
		splitPane1.setLeftComponent(panel2);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);

		splitPane2.setLeftComponent(panel1);
		splitPane2.setRightComponent(splitPane1);
		// ���÷ָ��ߴ�С
		splitPane2.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane2.setDividerLocation(82);
		// ���÷ָ����϶�
		splitPane2.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane2.setOneTouchExpandable(false);

		splitPane3.setLeftComponent(splitPane2);
		splitPane3.setRightComponent(panel3);
		// ���÷ָ��ߴ�С
		splitPane3.setDividerSize(10);
		// ���÷ָ���λ��
		splitPane3.setDividerLocation(700);
		// ���÷ָ����϶�
		splitPane3.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane3.setOneTouchExpandable(true);
	}

	// ������Ϣ���
	private Object setupPanel_PersonalInformation(JPanel panel, Panel_PersonalInformation personalInformation) {
		// TODO �Զ����ɵķ������
		System.out.println("������Ϣ����");
		panel.removeAll();// �Ƴ�����е��������
		panel.add(personalInformation);// ���Ҫ�л������
		panel.repaint();// ˢ��ҳ�棬�ػ����
		panel.validate();// ʹ�ػ�����ȷ����Ч

		// ������Ϣ����ʼ��
		personalInformation.init(panel.getWidth(), panel.getHeight());
		// ������Ϣ����¼�����
		personalInformation.addListener();

		// �����ָ����
		splitPane1.setLeftComponent(personalInformation);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// �����б����
	private Object setupPanel_Playlists(JPanel panel, Panel_Playlists playlists) {
		// TODO �Զ����ɵķ������
		System.out.println("�����б����");
		panel.removeAll();// �Ƴ�����е��������
		panel.add(playlists);// ���Ҫ�л������
		panel.repaint();// ˢ��ҳ�棬�ػ����
		panel.validate();// ʹ�ػ�����ȷ����Ч

		// �����б�����ʼ��
		playlists.init(panel.getWidth(), panel.getHeight());
		// �����������¼�����
		playlists.addListener();

		// �����ָ����
		splitPane1.setLeftComponent(playlists);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// ���������
	private Object setupPanel_MusicTree(JPanel panel, Panel_MusicTree musicTree) {
		// TODO �Զ����ɵķ������
		System.out.println("����������");
		panel.removeAll();// �Ƴ�����е��������
		panel.add(musicTree);// ���Ҫ�л������
		panel.repaint();// ˢ��ҳ�棬�ػ����
		panel.validate();// ʹ�ػ�����ȷ����Ч

		// ����������ʼ��
		musicTree.init(panel.getWidth(), panel.getHeight());
		// ����������¼�����
		musicTree.addListener();

		// �����ָ����
		splitPane1.setLeftComponent(musicTree);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// ���������
	private Object setupPanel_MusicBook(JPanel panel, Panel_MusicBook musicBook) {
		// TODO �Զ����ɵķ������
		System.out.println("���������");
		panel.removeAll();// �Ƴ�����е��������
		panel.add(musicBook);// ���Ҫ�л������
		panel.repaint();// ˢ��ҳ�棬�ػ����
		panel.validate();// ʹ�ػ�����ȷ����Ч

		// ����������ʼ��
		musicBook.init(panel.getWidth(), panel.getHeight());
		// ����������¼�����
		musicBook.addListener();

		// �����ָ����
		splitPane1.setLeftComponent(musicBook);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// ���ֵ����
	private Object setupPanel_MusicIsland(JPanel panel, Panel_MusicIsland musicIsland) {
		// TODO �Զ����ɵķ������
		System.out.println("���ֵ�����");
		panel.removeAll();// �Ƴ�����е��������
		panel.add(musicIsland);// ���Ҫ�л������
		panel.repaint();// ˢ��ҳ�棬�ػ����
		panel.validate();// ʹ�ػ�����ȷ����Ч

		// ���ֵ�����ʼ��
		musicIsland.init(panel.getWidth(), panel.getHeight());
		// ���ֵ�����¼�����
		musicIsland.addListener();

		// �����ָ����
		splitPane1.setLeftComponent(musicIsland);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

	// �������
	private Object setupPanel_Seting(JPanel panel, Panel_Seting seting) {
		// TODO �Զ����ɵķ������
		System.out.println("���ý���");
		panel.removeAll();// �Ƴ�����е��������
		panel.add(seting);// ���Ҫ�л������
		panel.repaint();// ˢ��ҳ�棬�ػ����
		panel.validate();// ʹ�ػ�����ȷ����Ч

		// ��������ʼ��
		seting.init(panel.getWidth(), panel.getHeight());
		// ��������¼�����
		seting.addListener();

		// �����ָ����
		splitPane1.setLeftComponent(seting);
		splitPane1.setRightComponent(panel4);
		// ���÷ָ��ߴ�С
		splitPane1.setDividerSize(0);
		// ���÷ָ���λ��
		splitPane1.setDividerLocation(470);
		// ���÷ָ����϶�
		splitPane1.setEnabled(false);
		// �ڷָ������ṩUIС�����Կ�����չ/�۵��ָ���
		splitPane1.setOneTouchExpandable(false);
		return null;
	}

}
