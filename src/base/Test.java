package base;

import java.awt.EventQueue;

import javax.swing.UIManager;

import view.Interface_MainFrame;
import view.Interface_Login;

public class Test {

	public static void main(String[] args) {

		// 界面风格
		try {
			// Nimbus风格
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 所有的swing组件必须由事件分配线程配置
		// 实现Runnable接口，覆写run方法
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
//				// 登录界面
//				@SuppressWarnings("unused") // "unused"屏蔽警告
//				Interface_Login login = new Interface_Login();

				// 进入主界面
				@SuppressWarnings("unused") // "unused"屏蔽警告
				Interface_MainFrame music_Tree = new Interface_MainFrame();
			}

		});

	}

}
