package Tool;

import java.awt.Dimension;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 * �ļ�ѡ�����ĸ������������ʾ�ļ�����
 * 
 * @author л����
 */
public class fileAttribute extends JLabel {

	private static final long serialVersionUID = 1L;

	public fileAttribute(JFileChooser chooser, File f) {
		// TODO �Զ����ɵĹ��캯�����
		loadAttribute(f);
		this.setPreferredSize(new Dimension(100, 100));
		this.setBorder(BorderFactory.createEtchedBorder());
	}

	public void loadAttribute(File f) {
		System.out.println();
		this.setText("123");

	}

}
