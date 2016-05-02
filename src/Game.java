import javax.swing.*;

public class Game {
	public static Feld f0;
	public static Feld f1;
	public static Feld f2;
	public static Feld f3;
	public static Feld f4;
	public static Feld f5;
	public static Feld f6;
	public static Feld f7;
	public static Feld f8;
	public static Feld f9;
	public static Feld f10;
	public static Feld f11;
	public static Feld f12;
	public static Feld f13;
	public static Feld f14;
	public static Feld f15;
	public static Feld f16;
	public static Feld f17;
	public static Feld f18;
	public static Feld f19;
	public static Feld f20;
	public static Feld f21;
	public static Feld f22;
	public static Feld f23;
	public static Feld f24;
	public static Feld f25;
	public static Feld f26;
	public static Feld f27;
	public static Feld f28;
	public static Feld f29;
	public static Feld f30;
	public static Feld f31;
	public static Feld f32;
	public static Feld f33;
	public static Feld f34;
	public static Feld f35;
	public static Feld f36;
	public static Feld f37;
	public static Feld f38;
	public static Feld f39;
	public static Feld f40;
	public static Feld f41;
	public static Feld f42;
	public static Feld f43;
	public static Feld f44;
	public static Feld f45;
	public static Feld f46;
	public static Feld f47;
	public static Feld f48;
	public static Feld f49;
	public static Feld f50;
	public static Feld f51;
	public static Feld f52;
	public static Feld f53;
	public static Feld f54;
	public static Feld f55;
	public static Feld f56;
	public static Feld f57;
	public static Feld f58;
	public static Feld f59;
	public static Feld f60;
	public static Feld f61;
	public static Feld f62;
	public static Feld f63;
	public static Feld f64;
	public static Feld f65;
	public static Feld f66;
	public static Feld f67;
	public static Feld f68;
	public static Feld f69;
	public static Feld f70;
	public static Feld f71;
	public static Feld f72;
	public static Feld f73;
	public static Feld f74;
	public static Feld f75;
	public static Feld f76;
	public static Feld f77;
	public static Feld f78;
	public static Feld f79;
	public static Feld f80;
	public static Feld f81;
	public static Feld f82;
	public static Feld f83;
	public static Feld f84;
	public static Feld f85;
	public static Feld f86;
	public static Feld f87;
	public static Feld f88;
	public static Feld f89;
	public static Feld f90;
	public static Feld f91;
	public static Feld f92;
	public static Feld f93;
	public static Feld f94;
	public static Feld f95;
	public static Feld f96;
	public static Feld f97;
	public static Feld f98;
	public static Feld f99;
	public static Feld f100;
	public static Feld f101;
	public static Feld f102;
	public static Feld f103;
	public static Feld f104;
	public static Feld f105;
	public static Feld f106;
	public static Feld f107;
	public static Feld f108;
	public static Feld f109;
	public static Feld f110;
	public static Feld f111;
	public static Feld f112;
	public static Feld f113;
	public static Feld f114;
	public static Feld f115;
	public static Feld f116;
	public static Feld f117;
	public static Feld f118;
	public static Feld f119;
	public static Feld f120;
	public static Feld f121;
	public static Feld f122;
	public static Feld f123;
	public static Feld f124;
	public static Feld f125;
	public static Feld f126;
	public static Feld f127;
	public static Feld f128;
	public static Feld f129;
	public static Feld f130;
	public static Feld f131;
	
	
	
	public static void main(String[] args) {

		// JPanel backgroundImagePanel = new JPanel();
		// initMenu
		initSpielfeld();
		initPlayer();
		// initGame();

	}

	public static void initGame(byte anzSpieler, byte anzCPUs) {
		Feld[] fRed = { f112, f113, f14, f115, f116 };
		Feld[] fGreen = { f117, f18, f119, f120, f121 };
		Feld[] fYellow = { f122, f123, f124, f125, f126 };
		Feld[] fBlue = { f127, f128, f129, f130, f131 };
		Player red = new Player("red", Content.contents.RED, fRed);
		Player green = new Player("green", Content.contents.GREEN, fGreen);
		Player yellow = new Player("yellow", Content.contents.YELLOW, fYellow);
		Player blue = new Player("blue", Content.contents.BLUE, fBlue);
		//Player[] team = new Player[];
		Content.contents c = Content.contents.valueOf("1");
		System.out.println(c);
		// int i = 0;
		/*
		 * for (int i = 0; i < anzSpieler; i++) {
		 * 
		 * team[i] = new Spieler("Spieler" + i, c, Feld[112+5*i], Feld[113+5*i],
		 * Feld[114+5*i], Feld[115+5*i], Feld[116+5*i]); } for (int i =
		 * anzSpieler + 1; i <= (anzCPUs + anzSpieler); i++) { team[i] = new
		 * CPU(); }
		 */
	}

	public static void initPlayer() {

	}

	public static void initSpielfeld() {
		initFelder();
		JFrame wnd = new JSpielfeld("Project_M");
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// begin game
	}

	public static void initFelder() {
		f0 = new Feld(Content.contents.EMPTY, 37, 20, 80, 40, 40);
		f1 = new Feld(Content.contents.EMPTY, 37, 70, 80, 40, 40);
		f2 = new Feld(Content.contents.EMPTY, 37, 120, 80, 40, 40);
		f3 = new Feld(Content.contents.EMPTY, 37, 170, 80, 40, 40);
		f4 = new Feld(Content.contents.EMPTY, 37, 220, 80, 40, 40);
		f5 = new Feld(Content.contents.EMPTY, 37, 270, 80, 40, 40);
		f6 = new Feld(Content.contents.EMPTY, 37, 320, 80, 40, 40);
		f7 = new Feld(Content.contents.EMPTY, 37, 370, 80, 40, 40);
		f8 = new Feld(Content.contents.BLOCK, 37, 420, 80, 40, 40);
		f9 = new Feld(Content.contents.EMPTY, 37, 470, 80, 40, 40);
		f10 = new Feld(Content.contents.EMPTY, 37, 520, 80, 40, 40);
		f11 = new Feld(Content.contents.EMPTY, 37, 570, 80, 40, 40);
		f12 = new Feld(Content.contents.EMPTY, 37, 620, 80, 40, 40);
		f13 = new Feld(Content.contents.EMPTY, 37, 670, 80, 40, 40);
		f14 = new Feld(Content.contents.EMPTY, 37, 720, 80, 40, 40);
		f15 = new Feld(Content.contents.EMPTY, 37, 770, 80, 40, 40);
		f16 = new Feld(Content.contents.EMPTY, 37, 820, 80, 40, 40);
		f17 = new Feld(Content.contents.EMPTY, 37, 20, 130, 40, 40);
		f18 = new Feld(Content.contents.EMPTY, 37, 820, 130, 40, 40);
		f19 = new Feld(Content.contents.EMPTY, 37, 20, 180, 40, 40);
		f20 = new Feld(Content.contents.EMPTY, 37, 70, 180, 40, 40);
		f21 = new Feld(Content.contents.EMPTY, 37, 120, 180, 40, 40);
		f22 = new Feld(Content.contents.EMPTY, 37, 170, 180, 40, 40);
		f23 = new Feld(Content.contents.EMPTY, 37, 220, 180, 40, 40);
		f24 = new Feld(Content.contents.EMPTY, 37, 270, 180, 40, 40);
		f25 = new Feld(Content.contents.EMPTY, 37, 320, 180, 40, 40);
		f26 = new Feld(Content.contents.EMPTY, 37, 370, 180, 40, 40);
		f27 = new Feld(Content.contents.BLOCK, 37, 420, 180, 40, 40);
		f28 = new Feld(Content.contents.EMPTY, 37, 470, 180, 40, 40);
		f29 = new Feld(Content.contents.EMPTY, 37, 520, 180, 40, 40);
		f30 = new Feld(Content.contents.EMPTY, 37, 570, 180, 40, 40);
		f31 = new Feld(Content.contents.EMPTY, 37, 620, 180, 40, 40);
		f32 = new Feld(Content.contents.EMPTY, 37, 670, 180, 40, 40);
		f33 = new Feld(Content.contents.EMPTY, 37, 720, 180, 40, 40);
		f34 = new Feld(Content.contents.EMPTY, 37, 770, 180, 40, 40);
		f35 = new Feld(Content.contents.EMPTY, 37, 820, 180, 40, 40);
		f36 = new Feld(Content.contents.BLOCK, 37, 420, 230, 40, 40);
		f37 = new Feld(Content.contents.EMPTY, 37, 320, 280, 40, 40);
		f38 = new Feld(Content.contents.EMPTY, 37, 370, 280, 40, 40);
		f39 = new Feld(Content.contents.BLOCK, 37, 420, 280, 40, 40);
		f40 = new Feld(Content.contents.EMPTY, 37, 470, 280, 40, 40);
		f41 = new Feld(Content.contents.EMPTY, 37, 520, 280, 40, 40);
		f42 = new Feld(Content.contents.EMPTY, 37, 320, 330, 40, 40);
		f43 = new Feld(Content.contents.EMPTY, 37, 520, 330, 40, 40);
		f44 = new Feld(Content.contents.EMPTY, 37, 220, 380, 40, 40);
		f45 = new Feld(Content.contents.EMPTY, 37, 270, 380, 40, 40);
		f46 = new Feld(Content.contents.BLOCK, 37, 320, 380, 40, 40);
		f47 = new Feld(Content.contents.EMPTY, 37, 370, 380, 40, 40);
		f48 = new Feld(Content.contents.EMPTY, 37, 420, 380, 40, 40);
		f49 = new Feld(Content.contents.EMPTY, 37, 470, 380, 40, 40);
		f50 = new Feld(Content.contents.BLOCK, 37, 520, 380, 40, 40);
		f51 = new Feld(Content.contents.EMPTY, 37, 570, 380, 40, 40);
		f52 = new Feld(Content.contents.EMPTY, 37, 620, 380, 40, 40);
		f53 = new Feld(Content.contents.EMPTY, 37, 220, 430, 40, 40);
		f54 = new Feld(Content.contents.EMPTY, 37, 620, 430, 40, 40);
		f55 = new Feld(Content.contents.EMPTY, 37, 120, 480, 40, 40);
		f56 = new Feld(Content.contents.EMPTY, 37, 170, 480, 40, 40);
		f57 = new Feld(Content.contents.EMPTY, 37, 220, 480, 40, 40);
		f58 = new Feld(Content.contents.EMPTY, 37, 270, 480, 40, 40);
		f59 = new Feld(Content.contents.EMPTY, 37, 320, 480, 40, 40);
		f60 = new Feld(Content.contents.EMPTY, 37, 370, 480, 40, 40);
		f61 = new Feld(Content.contents.EMPTY, 37, 420, 480, 40, 40);
		f62 = new Feld(Content.contents.EMPTY, 37, 470, 480, 40, 40);
		f63 = new Feld(Content.contents.EMPTY, 37, 520, 480, 40, 40);
		f64 = new Feld(Content.contents.EMPTY, 37, 570, 480, 40, 40);
		f65 = new Feld(Content.contents.EMPTY, 37, 620, 480, 40, 40);
		f66 = new Feld(Content.contents.EMPTY, 37, 670, 480, 40, 40);
		f67 = new Feld(Content.contents.EMPTY, 37, 720, 480, 40, 40);
		f68 = new Feld(Content.contents.EMPTY, 37, 120, 530, 40, 40);
		f69 = new Feld(Content.contents.EMPTY, 37, 320, 530, 40, 40);
		f70 = new Feld(Content.contents.EMPTY, 37, 520, 530, 40, 40);
		f71 = new Feld(Content.contents.EMPTY, 37, 720, 530, 40, 40);
		f72 = new Feld(Content.contents.BLOCK, 37, 20, 580, 40, 40);
		f73 = new Feld(Content.contents.EMPTY, 37, 70, 580, 40, 40);
		f74 = new Feld(Content.contents.EMPTY, 37, 120, 580, 40, 40);
		f75 = new Feld(Content.contents.EMPTY, 37, 170, 580, 40, 40);
		f76 = new Feld(Content.contents.BLOCK, 37, 220, 580, 40, 40);
		f77 = new Feld(Content.contents.EMPTY, 37, 270, 580, 40, 40);
		f78 = new Feld(Content.contents.EMPTY, 37, 320, 580, 40, 40);
		f79 = new Feld(Content.contents.EMPTY, 37, 370, 580, 40, 40);
		f80 = new Feld(Content.contents.BLOCK, 37, 420, 580, 40, 40);
		f81 = new Feld(Content.contents.EMPTY, 37, 470, 580, 40, 40);
		f82 = new Feld(Content.contents.EMPTY, 37, 520, 580, 40, 40);
		f83 = new Feld(Content.contents.EMPTY, 37, 570, 580, 40, 40);
		f84 = new Feld(Content.contents.BLOCK, 37, 620, 580, 40, 40);
		f85 = new Feld(Content.contents.EMPTY, 37, 670, 580, 40, 40);
		f86 = new Feld(Content.contents.EMPTY, 37, 720, 580, 40, 40);
		f87 = new Feld(Content.contents.EMPTY, 37, 770, 580, 40, 40);
		f88 = new Feld(Content.contents.BLOCK, 37, 820, 580, 40, 40);
		f89 = new Feld(Content.contents.EMPTY, 37, 20, 630, 40, 40);
		f90 = new Feld(Content.contents.EMPTY, 37, 220, 630, 40, 40);
		f91 = new Feld(Content.contents.EMPTY, 37, 420, 630, 40, 40);
		f92 = new Feld(Content.contents.EMPTY, 37, 620, 630, 40, 40);
		f93 = new Feld(Content.contents.EMPTY, 37, 820, 630, 40, 40);
		f94 = new Feld(Content.contents.EMPTY, 37, 20, 680, 40, 40);
		f95 = new Feld(Content.contents.EMPTY, 37, 70, 680, 40, 40);
		f96 = new Feld(Content.contents.EMPTY, 37, 120, 680, 40, 40);
		f97 = new Feld(Content.contents.EMPTY, 37, 170, 680, 40, 40);
		f98 = new Feld(Content.contents.EMPTY, 37, 220, 680, 40, 40);
		f99 = new Feld(Content.contents.EMPTY, 37, 270, 680, 40, 40);
		f100 = new Feld(Content.contents.EMPTY, 37, 320, 680, 40, 40);
		f101 = new Feld(Content.contents.EMPTY, 37, 370, 680, 40, 40);
		f102 = new Feld(Content.contents.EMPTY, 37, 420, 680, 40, 40);
		f103 = new Feld(Content.contents.EMPTY, 37, 470, 680, 40, 40);
		f104 = new Feld(Content.contents.EMPTY, 37, 520, 680, 40, 40);
		f105 = new Feld(Content.contents.EMPTY, 37, 570, 680, 40, 40);
		f106 = new Feld(Content.contents.EMPTY, 37, 620, 680, 40, 40);
		f107 = new Feld(Content.contents.EMPTY, 37, 670, 680, 40, 40);
		f108 = new Feld(Content.contents.EMPTY, 37, 720, 680, 40, 40);
		f109 = new Feld(Content.contents.EMPTY, 37, 770, 680, 40, 40);
		f110 = new Feld(Content.contents.EMPTY, 37, 820, 680, 40, 40);
		f111 = new Feld(Content.contents.EMPTY, 37, 420, 20, 40, 40);
		f112 = new Feld(Content.contents.RED, 37, 120, 730, 40, 40);
		f113 = new Feld(Content.contents.RED, 37, 75, 760, 40, 40);
		f114 = new Feld(Content.contents.RED, 37, 165, 760, 40, 40);
		f115 = new Feld(Content.contents.RED, 37, 95, 810, 40, 40);
		f116 = new Feld(Content.contents.RED, 37, 145, 810, 40, 40);
		f117 = new Feld(Content.contents.GREEN, 37, 320, 730, 40, 40);
		f118 = new Feld(Content.contents.GREEN, 37, 275, 760, 40, 40);
		f119 = new Feld(Content.contents.GREEN, 37, 365, 760, 40, 40);
		f120 = new Feld(Content.contents.GREEN, 37, 295, 810, 40, 40);
		f121 = new Feld(Content.contents.GREEN, 37, 345, 810, 40, 40);
		f122 = new Feld(Content.contents.YELLOW, 37, 520, 730, 40, 40);
		f123 = new Feld(Content.contents.YELLOW, 37, 475, 760, 40, 40);
		f124 = new Feld(Content.contents.YELLOW, 37, 565, 760, 40, 40);
		f125 = new Feld(Content.contents.YELLOW, 37, 495, 810, 40, 40);
		f126 = new Feld(Content.contents.YELLOW, 37, 545, 810, 40, 40);
		f127 = new Feld(Content.contents.BLUE, 37, 720, 730, 40, 40);
		f128 = new Feld(Content.contents.BLUE, 37, 675, 760, 40, 40);
		f129 = new Feld(Content.contents.BLUE, 37, 765, 760, 40, 40);
		f130 = new Feld(Content.contents.BLUE, 37, 695, 810, 40, 40);
		f131 = new Feld(Content.contents.BLUE, 37, 745, 810, 40, 40);
	}

}
