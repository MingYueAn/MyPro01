package Tool;

import java.io.File;

import javax.swing.Icon;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

/**
 * 定制文件选择器——为文件选择器显示的每个文件提供特定的图标和文件描述
 * 
 * @author 谢晓艳
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
