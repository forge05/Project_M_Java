import javax.swing.*;

public class Game {

	public static void main(String[] args) {
		
		//JPanel backgroundImagePanel = new JPanel();
		initSpielfeld();
		initPlayer();
		//initGame();
		
	}
	
	public static void initGame(byte anzSpieler, byte anzCPUs) {
		Player[] team = new Player[4];
		Content.contents c = Content.contents.valueOf("1");
		System.out.println(c);
		//int i = 0;
		/*
		for (int i = 0; i < anzSpieler; i++) {
			
			team[i] = new Spieler("Spieler" + i, c, Feld[112+5*i], Feld[113+5*i], Feld[114+5*i], Feld[115+5*i], Feld[116+5*i]);
		}
		for (int i = anzSpieler + 1; i <= (anzCPUs + anzSpieler); i++) {
			team[i] = new CPU();
		}
		*/
	}
	
	public static void initPlayer() {
		
	}
	
	public static void initSpielfeld() {
		Feld.initFelder();
		JFrame wnd = new JSpielfeld("Project_M" );
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
