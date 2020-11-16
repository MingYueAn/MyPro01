package Tool;

import java.awt.Dimension;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 * 文件选择器的附加组件——显示文件属性
 * 
 * @author 谢晓艳
 */
public class fileAttribute extends JLabel {

	private static final long serialVersionUID = 1L;

	public fileAttribute(JFileChooser chooser, File f) {
		// TODO 自动生成的构造函数存根
		loadAttribute(f);
		this.setPreferredSize(new Dimension(100, 100));
		this.setBorder(BorderFactory.createEtchedBorder());
	}

	public void loadAttribute(File f) {
		System.out.println();
		this.setText("123");

	}

}
