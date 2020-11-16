package Tool;

import java.io.File;

import javax.swing.Icon;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

/**
 * �����ļ�ѡ��������Ϊ�ļ�ѡ������ʾ��ÿ���ļ��ṩ�ض���ͼ����ļ�����
 * 
 * @author л����
 */
public class fileIconView extends FileView {
	private FileFilter filter;
	private Icon icon;

	public fileIconView(FileFilter filter, Icon icon) {
		super();
		this.filter = filter;
		this.icon = icon;
	}

	public Icon getIcon(File f) {
		if (!f.isDirectory() && filter.accept(f)) {
			return icon;
		} else {
			return null;
		}

	}

}
