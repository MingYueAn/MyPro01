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
 * 设置菜单条
 * 
 * @author 谢晓艳
 */
public class SetupJMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	// 菜单+菜单项
	private JMenu jMenu1 = new JMenu("菜单");
	private JMenuItem jItem1_1 = new JMenuItem("打开音乐");
	private JMenuItem jItem1_2 = new JMenuItem("打开文件夹");
	private JMenuItem jItem1_3 = new JMenuItem("打开文本");
	private JMenuItem jItem1_4 = new JMenuItem("保存文本");
	private JMenuItem jItem1_5 = new JMenuItem("另存为...");
	private JMenu jMenu2 = new JMenu("帮助");
	private JMenuItem jItem2_1 = new JMenuItem("关于");
	private JMenuItem jItem2_2 = new JMenuItem("帮助内容");

	SetupJMenuBar() {
		// 菜单（打开音乐、打开文件夹 打开文本、保存文本、另存为）
		jMenu1.add(jItem1_1);
		jMenu1.add(jItem1_2);
		jMenu1.addSeparator();
		jMenu1.add(jItem1_3);
		jMenu1.add(jItem1_4);
		jMenu1.add(jItem1_5);

		// 帮助（关于、帮助内容）
		jMenu2.add(jItem2_1);
		jMenu2.add(jItem2_2);

		this.add(jMenu1);// 添加菜单
		this.add(jMenu2);// 添加帮助

		// 事件监听
		addListener();
	}

	/**
	 * 事件监听
	 */
	public void addListener() {

		jItem1_1.addActionListener((e) -> OpenMusicFile()); // 打开音乐
		jItem1_2.addActionListener((e) -> OpenFolder()); // 打开文件夹

		jItem1_3.addActionListener((e) -> OpenTextFile()); // 打开文本
		jItem1_4.addActionListener((e) -> SaveTextFile()); // 保存文本
		jItem1_5.addActionListener((e) -> SaveTextFileAs()); // 另存为

		jItem2_1.addActionListener((e) -> About()); // 关于
		jItem2_2.addActionListener((e) -> HelpContent()); // 帮助内容
	}

	/**
	 * jMenu2：帮助 jItem2_2：帮助内容
	 * 
	 * @return
	 */
	private Object HelpContent() {
		// TODO 自动生成的方法存根
		return null;
	}

	/**
	 * jMenu2：帮助 jItem2_2：关于
	 * 
	 * @return
	 */
	private Object About() {
		// TODO 自动生成的方法存根
		return null;
	}

	/**
	 * jMenu1：菜单 jItem1_5：另存为
	 * 
	 * @return
	 */
	private Object SaveTextFileAs() {
		// TODO 自动生成的方法存根
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setApproveButtonText("另存为"); // 定义“另存为“按钮”
		fileChooser.setDialogTitle("另存为。。");// 定义文件选择框标题
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// 设置目录

		fileChooser.setSelectedFile(new File("原本名字"));// 默认文件名
		fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));// 文件过滤器
		fileChooser.setAcceptAllFileFilterUsed(false);// 禁用all files过滤器
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\txt.png")));

		result = fileChooser.showSaveDialog(this.getComponent());// 显示保存对话框
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("另存为的文件名称为：" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("没有保存任何文件");
		}

		return null;
	}

	/**
	 * jMenu1：菜单 jItem1_4：保存文本
	 * 
	 * @return
	 */
	private Object SaveTextFile() {
		// TODO 自动生成的方法存根
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("保存文本");// 定义文件选择框标题
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// 设置目录

		fileChooser.setSelectedFile(new File("歌名-音乐书"));// 默认文件名
		fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));// 文件过滤器
		fileChooser.setAcceptAllFileFilterUsed(false);// 禁用all files过滤器
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\txt.png")));

		result = fileChooser.showSaveDialog(this.getComponent());// 显示保存对话框
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("保存的文件名称为：" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("没有保存任何文件");
		}

		return null;
	}

	/**
	 * jMenu1：菜单 jItem1_3：打开文本
	 * 
	 * @return
	 */
	private Object OpenTextFile() {
		// TODO 自动生成的方法存根
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("打开文本");// 定义文件选择框标题
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// 设置目录

		fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt"));// 文件过滤器
		fileChooser.setAcceptAllFileFilterUsed(false);// 禁用all files过滤器
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\txt.png")));

		result = fileChooser.showOpenDialog(this.getComponent());// 显示打开对话框
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("打开的文件名称为：" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("没有打开任何文件");
		}

		return null;
	}

	/**
	 * jMenu1：菜单 jItem1_2：打开文件夹
	 * 
	 * @return
	 */
	private Object OpenFolder() {
		// TODO 自动生成的方法存根
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("打开文件夹");// 定义文件选择框标题
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// 设置目录

		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// 只打开目录
		fileChooser.setFileFilter(new FileNameExtensionFilter("music files", "mp3"));// 文件过滤器
		fileChooser.setAcceptAllFileFilterUsed(false);// 禁用all files过滤器
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\mp3.png")));

		result = fileChooser.showOpenDialog(this.getComponent());// 显示打开对话框
		if (result == JFileChooser.APPROVE_OPTION) {
			System.out.println("打开的文件夹路径为：" + fileChooser.getSelectedFile().getPath());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("没有打开任何文件夹");
		}

		return null;
	}

	/**
	 * jMenu1：菜单 jItem1_1：打开音乐
	 * 
	 * @return
	 */
	private Object OpenMusicFile() {
		// TODO 自动生成的方法存根
		File file = null;
		int result = 0;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("打开音乐");// 定义文件选择框标题
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));// 设置目录

		fileChooser.setFileFilter(new FileNameExtensionFilter("music files", "mp3"));// 文件过滤器
		fileChooser.setAcceptAllFileFilterUsed(false);// 禁用all files过滤器
		fileChooser.setAccessory(new fileAttribute(fileChooser, fileChooser.getSelectedFile()));
		fileChooser
				.setFileView(new fileIconView(fileChooser.getFileFilter(), new ImageIcon("src\\\\image\\\\mp3.png")));

		result = fileChooser.showOpenDialog(this.getComponent());// 显示打开对话框
		if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			System.out.println("打开的文件名称为：" + file.getName());
		} else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("没有打开任何文件");
		}

		return null;
	}

}
