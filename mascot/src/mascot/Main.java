package mascot;

public class Main{
	
	public static void main(String[] args) {

		MainWindowSetup mainwindowsetup = new MainWindowSetup();
		Character character = new Character();
		mainwindowsetup.getContentPane().add(character.label);
		System.out.println("実行前");
		character.move();
		character.timer1.schedule(character.task, 0, 1000);
		System.out.println("実行後");
	}
	

}
	
	