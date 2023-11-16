package mascot;

import javax.swing.JFrame;

public class MainWindowSetup extends JFrame{
	
	public MainWindowSetup() {
		//getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		//GraphicsDevice gd = ge.getDefaultScreenDevice();
		//gd.setFullScreenWindow(frame);
		// 3, 画面のウィンドウサイズ指定はこの位置で。
		this.getContentPane().setLayout(null);
		this.setSize(1300, 700);
		this.setVisible(true);
		//setVisible(false);
		
		// 枠を外す。
		//this.setUndecorated(true);
		// 背景色を透明にする。
		//this.setBackground(new Color(0, 0, 0, 0));
		// タスクバーのアイコンを非表示
		//this.setType(Type.UTILITY) ;
	}

}
