package view;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

import Tool.fileAttribute;
import Tool.fileIconView;

/**
 * ���ò˵���
 * 
 * @author л����
 */
public class SetupJMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	// �˵�+�˵���
	private JMenu jMenu1 = new JMenu("�˵�");
	private JMenuItem jItem1_1 = new JMenuItem("������");
	private JMenuItem jItem1_2 = new JMenuItem("���ļ���");
	private JMenuItem jItem1_3 = new JMenuItem("���ı�");
	private JMenuItem jItem1_4 = new JMenuItem("�����ı�");
	private JMenuItem jItem1_5 = new JMenuItem("���Ϊ...");
	private JMenu jMenu2 = new JMenu("����");
	private JMenuItem jItem2_1 = new JMenuItem("����");
	private JMenuItem jItem2_2 = new JMenuItem("��������");

	SetupJMenuBar() {
		// �˵��������֡����ļ��� ���ı��������ı������Ϊ��
		jMenu1.add(jItem1_1);
		jMenu1.add(jItem1_2);
		jMenu1.addSeparator();
		jMenu1.add(jItem1_3);
		jMenu1.add(jItem1_4);
		jMenu1.add(jItem1_5);

		// ���������ڡ��������ݣ�
		jMenu2.add(jItem2_1);
		jMenu2.add(jItem2_2);

		this.add(jMenu1);// ��Ӳ˵�
		this.add(jMenu2);// ��Ӱ���

		// �¼�����
		addListener();
	}

	/**
	 * �¼�����
	 */
	public void addListener() {

		jItem1_1.addActionListener((e) -> OpenMusicFile()); // ������
		jItem1_2.addActionListener((e) -> OpenFolder()); // ���ļ���

		jItem1_3.addActionListener((e) -> OpenTextFile()); // ���ı�
		jItem1_4.addActionListener((e) -> SaveTextFile()); // �����ı�
		jItem1_5.addActionListener((e) -> SaveTextFileAs()); // ���Ϊ

		jItem2_1.addActionListener((e) -> About()); // ����
		jItem2_2.addActionListener((e) -> HelpContent()); // ��������
	}

	/**
	 * jMenu2������ jItem2_2����������
	 * 
	 * @return
	 */
	private Object HelpContent() {
		// TODO �Զ����ɵķ������
		return null;
	}

	/**
	 * jMenu2������ jItem2_2������
	 * 
	 * @return
	 */
	private Object About() {
		// TODO �Զ����ɵķ������
		return null;
	}

	/**
	 * jMenu1���˵� jItem1_5�����Ϊ
	 * 
	 * @return
	 */
	private Object SaveTextFileAs() {
		// TODO �Զ����ɵķ������
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setApproveButtonText("���Ϊ"); // ���塰���Ϊ����ť��
		fileChooser.setDialogTitle("���Ϊ����");// �����ļ�ѡ������
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// ����Ŀ¼

		fileChooser.setSelectedFile(new File("ԭ������"));// Ĭ���ļ���
		fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));// �ļ�������
		fileChooser.setAcceptAllFileFilterUsed(false);// ����all files������
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\txt.png")));

		result = fileChooser.showSaveDialog(this.getComponent());// ��ʾ����Ի���
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("���Ϊ���ļ�����Ϊ��" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("û�б����κ��ļ�");
		}

		return null;
	}

	/**
	 * jMenu1���˵� jItem1_4�������ı�
	 * 
	 * @return
	 */
	private Object SaveTextFile() {
		// TODO �Զ����ɵķ������
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("�����ı�");// �����ļ�ѡ������
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// ����Ŀ¼

		fileChooser.setSelectedFile(new File("����-������"));// Ĭ���ļ���
		fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));// �ļ�������
		fileChooser.setAcceptAllFileFilterUsed(false);// ����all files������
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\txt.png")));

		result = fileChooser.showSaveDialog(this.getComponent());// ��ʾ����Ի���
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("������ļ�����Ϊ��" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("û�б����κ��ļ�");
		}

		return null;
	}

	/**
	 * jMenu1���˵� jItem1_3�����ı�
	 * 
	 * @return
	 */
	private Object OpenTextFile() {
		// TODO �Զ����ɵķ������
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("���ı�");// �����ļ�ѡ������
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// ����Ŀ¼

		fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));// �ļ�������
		fileChooser.setAcceptAllFileFilterUsed(false);// ����all files������
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\txt.png")));

		result = fileChooser.showOpenDialog(this.getComponent());// ��ʾ�򿪶Ի���
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("�򿪵��ļ�����Ϊ��" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("û�д��κ��ļ�");
		}

		return null;
	}

	/**
	 * jMenu1���˵� jItem1_2�����ļ���
	 * 
	 * @return
	 */
	private Object OpenFolder() {
		// TODO �Զ����ɵķ������
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("���ļ���");// �����ļ�ѡ������
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// ����Ŀ¼

		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// ֻ��Ŀ¼
		fileChooser.setFileFilter(new FileNameExtensionFilter("music files", "mp3"));// �ļ�������
		fileChooser.setAcceptAllFileFilterUsed(false);// ����all files������
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\mp3.png")));

		result = fileChooser.showOpenDialog(this.getComponent());// ��ʾ�򿪶Ի���
		if (result == JFileChooser.APPROVE_OPTION) {
			System.out.println("�򿪵��ļ���·��Ϊ��" + fileChooser.getSelectedFile().getPath());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("û�д��κ��ļ���");
		}

		return null;
	}

	/**
	 * jMenu1���˵� jItem1_1��������
	 * 
	 * @return
	 */
	private Object OpenMusicFile() {
		// TODO �Զ����ɵķ������
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("������");// �����ļ�ѡ������
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// ����Ŀ¼

		fileChooser.setFileFilter(new FileNameExtensionFilter("music files", "mp3"));// �ļ�������
		fileChooser.setAcceptAllFileFilterUsed(false);// ����all files������
		fileChooser.setAccessory(new fileAttribute(fileChooser, fileChooser.getSelectedFile()));
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\mp3.png")));

		result = fileChooser.showOpenDialog(this.getComponent());// ��ʾ�򿪶Ի���
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("�򿪵��ļ�����Ϊ��" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("û�д��κ��ļ�");
		}

		return null;
	}

}
