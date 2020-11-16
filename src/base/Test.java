package base;

import java.awt.EventQueue;

import javax.swing.UIManager;

import view.Interface_MainFrame;
import view.Interface_Login;

public class Test {

	public static void main(String[] args) {

		// ������
		try {
			// Nimbus���
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ���е�swing����������¼������߳�����
		// ʵ��Runnable�ӿڣ���дrun����
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
//				// ��¼����
//				@SuppressWarnings("unused") // "unused"���ξ���
//				Interface_Login login = new Interface_Login();

				// ����������
				@SuppressWarnings("unused") // "unused"���ξ���
				Interface_MainFrame music_Tree = new Interface_MainFrame();
			}

		});

	}

}
