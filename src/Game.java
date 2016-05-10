import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import javax.swing.*;

import org.jgrapht.DirectedGraph;
import org.jgrapht.EdgeFactory;
import org.jgrapht.graph.ClassBasedEdgeFactory;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.DepthFirstIterator;

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
	public static boolean someoneWon = false;
	public static JFrame wnd;
	public static Player red;
	public static DirectedGraph<Feld, DefaultEdge> feldGraph;

	public static void main(String[] args) {

		// JPanel backgroundImagePanel = new JPanel();
		// initMenu
		initSpielfeld();
		feldGraph = createBoardGraph();
		//System.out.println(feldGraph.toString());
		initPlayer();
		initGame((byte) 1, (byte) 0);
		// runGame();

	}

	public static void initGame(byte anzSpieler, byte anzCPUs) {
		Feld[] fRed = { f112, f113, f114, f115, f116 };
		// Feld[] fGreen = { f117, f118, f119, f120, f121 };
		// Feld[] fYellow = { f122, f123, f124, f125, f126 };
		// Feld[] fBlue = { f127, f128, f129, f130, f131 };
		red = new Player("red", Content.contents.RED, fRed);
		// Player green = new Player("green", Content.contents.GREEN, fGreen);
		// Player yellow = new Player("yellow", Content.contents.YELLOW,
		// fYellow);
		// Player blue = new Player("blue", Content.contents.BLUE, fBlue);
		// Player[] team = new Player[];
		// Content.contents c = Content.contents.valueOf("1");
		// System.out.println(c);
		// int i = 0;
		/*
		 * for (int i = 0; i < anzSpieler; i++) {
		 * 
		 * team[i] = new Spieler("Spieler" + i, c, Feld[112+5*i], Feld[113+5*i],
		 * Feld[114+5*i], Feld[115+5*i], Feld[116+5*i]); } for (int i =
		 * anzSpieler + 1; i <= (anzCPUs + anzSpieler); i++) { team[i] = new
		 * CPU(); }
		 */
		int rückZahl = 0;
		Object warteObjekt = new Object();
		synchronized (warteObjekt) {
			try {
				while (!someoneWon) {
					warteObjekt.wait(50);

					if (rückZahl == 0) {
						rückZahl = JSpielfeld.wuerfelErg;
						// System.out.println("" + rückZahl);
					} else {
						rücken(rückZahl);
						//System.out.println("ich rücke jetzt mit: " + rückZahl);
						someoneWon = true;
					}

				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
	public static void rücken(int rückZahl){
		// ermittle Felder von Spieler
		// rücken muss rekursiv sein mit allen kanten
		// rückzahl muss verringert werden
		Feld[] spielerFelder = red.getMyFields();
		for(Feld feld: spielerFelder){
			// berechne Felder und gib ihnen Listener 
			Iterator<Feld> iter =
		            //new DepthFirstIterator<Feld, DefaultEdge>(feldGraph);
					new DepthFirstIterator<Feld, DefaultEdge>(feldGraph, feld);
		        //Feld vertex;
		        for(int i = 1; i <= rückZahl; i++) {
		            feld = iter.next();
		            System.out.println(feld.nummer);
		            System.out.println(
		                "Vertex " + feld.toString() + " is connected to: "
		                + feldGraph.edgesOf(feld).toString());
		        }
			//feldGraph.outgoingEdgesOf(feld);
		}
		// warte auf input vom spieler und rücke Figur
	}

	// public static void runGame(){

	// }
	private static DirectedGraph<Feld, DefaultEdge> createBoardGraph() {
		EdgeFactory<Feld, DefaultEdge> vFactory = new ClassBasedEdgeFactory<>(DefaultEdge.class);
		DirectedGraph<Feld, DefaultEdge> g = new DefaultDirectedGraph<>(vFactory);

		try {
			// add the vertices
			g.addVertex(f0);
			g.addVertex(f1);
			g.addVertex(f2);
			g.addVertex(f3);
			g.addVertex(f4);
			g.addVertex(f5);
			g.addVertex(f6);
			g.addVertex(f7);
			g.addVertex(f8);
			g.addVertex(f9);
			g.addVertex(f10);
			g.addVertex(f11);
			g.addVertex(f12);
			g.addVertex(f13);
			g.addVertex(f14);
			g.addVertex(f15);
			g.addVertex(f16);
			g.addVertex(f17);
			g.addVertex(f18);
			g.addVertex(f19);
			g.addVertex(f20);
			g.addVertex(f21);
			g.addVertex(f22);
			g.addVertex(f23);
			g.addVertex(f24);
			g.addVertex(f25);
			g.addVertex(f26);
			g.addVertex(f27);
			g.addVertex(f28);
			g.addVertex(f29);
			g.addVertex(f30);
			g.addVertex(f31);
			g.addVertex(f32);
			g.addVertex(f33);
			g.addVertex(f34);
			g.addVertex(f35);
			g.addVertex(f36);
			g.addVertex(f37);
			g.addVertex(f38);
			g.addVertex(f39);
			g.addVertex(f40);
			g.addVertex(f41);
			g.addVertex(f42);
			g.addVertex(f43);
			g.addVertex(f44);
			g.addVertex(f45);
			g.addVertex(f46);
			g.addVertex(f47);
			g.addVertex(f48);
			g.addVertex(f49);
			g.addVertex(f50);
			g.addVertex(f51);
			g.addVertex(f52);
			g.addVertex(f53);
			g.addVertex(f54);
			g.addVertex(f55);
			g.addVertex(f56);
			g.addVertex(f57);
			g.addVertex(f58);
			g.addVertex(f59);
			g.addVertex(f60);
			g.addVertex(f61);
			g.addVertex(f62);
			g.addVertex(f63);
			g.addVertex(f64);
			g.addVertex(f65);
			g.addVertex(f66);
			g.addVertex(f67);
			g.addVertex(f68);
			g.addVertex(f69);
			g.addVertex(f70);
			g.addVertex(f71);
			g.addVertex(f72);
			g.addVertex(f73);
			g.addVertex(f74);
			g.addVertex(f75);
			g.addVertex(f76);
			g.addVertex(f77);
			g.addVertex(f78);
			g.addVertex(f79);
			g.addVertex(f80);
			g.addVertex(f81);
			g.addVertex(f82);
			g.addVertex(f83);
			g.addVertex(f84);
			g.addVertex(f85);
			g.addVertex(f86);
			g.addVertex(f87);
			g.addVertex(f88);
			g.addVertex(f89);
			g.addVertex(f90);
			g.addVertex(f91);
			g.addVertex(f92);
			g.addVertex(f93);
			g.addVertex(f94);
			g.addVertex(f95);
			g.addVertex(f96);
			g.addVertex(f97);
			g.addVertex(f98);
			g.addVertex(f99);
			g.addVertex(f100);
			g.addVertex(f101);
			g.addVertex(f102);
			g.addVertex(f103);
			g.addVertex(f104);
			g.addVertex(f105);
			g.addVertex(f106);
			g.addVertex(f107);
			g.addVertex(f108);
			g.addVertex(f109);
			g.addVertex(f110);
			g.addVertex(f111);
			g.addVertex(f112);
			g.addVertex(f113);
			g.addVertex(f114);
			g.addVertex(f115);
			g.addVertex(f116);
			g.addVertex(f117);
			g.addVertex(f118);
			g.addVertex(f119);
			g.addVertex(f120);
			g.addVertex(f121);
			g.addVertex(f122);
			g.addVertex(f123);
			g.addVertex(f124);
			g.addVertex(f125);
			g.addVertex(f126);
			g.addVertex(f127);
			g.addVertex(f128);
			g.addVertex(f129);
			g.addVertex(f130);
			g.addVertex(f131);

			// add edges to create linking structure
			g.addEdge(f0, f1);
			g.addEdge(f1, f2);
			g.addEdge(f2, f3);
			g.addEdge(f3, f4);
			g.addEdge(f4, f5);
			g.addEdge(f6, f7);
			g.addEdge(f7, f8);
			g.addEdge(f8, f120);
			g.addEdge(f9, f8);
			g.addEdge(f10, f9);
			g.addEdge(f11, f10);
			g.addEdge(f12, f11);
			g.addEdge(f13, f12);
			g.addEdge(f14, f13);
			g.addEdge(f15, f14);
			g.addEdge(f16, f15);
			g.addEdge(f17, f0);
			g.addEdge(f18, f16);
			g.addEdge(f19, f17);
			g.addEdge(f20, f19);
			g.addEdge(f21, f20);
			g.addEdge(f22, f21);
			g.addEdge(f23, f22);
			g.addEdge(f24, f23);
			g.addEdge(f25, f24);
			g.addEdge(f26, f25);
			g.addEdge(f27, f26);
			g.addEdge(f27, f28);
			g.addEdge(f28, f29);
			g.addEdge(f29, f30);
			g.addEdge(f30, f31);
			g.addEdge(f31, f32);
			g.addEdge(f32, f33);
			g.addEdge(f33, f34);
			g.addEdge(f34, f35);
			g.addEdge(f35, f18);
			g.addEdge(f36, f27);
			g.addEdge(f37, f38);
			g.addEdge(f38, f39);
			g.addEdge(f39, f36);
			g.addEdge(f40, f39);
			g.addEdge(f41, f40);
			g.addEdge(f42, f37);
			g.addEdge(f43, f41);
			g.addEdge(f44, f45);
			g.addEdge(f45, f46);
			g.addEdge(f46, f42);
			g.addEdge(f47, f46);
			//
			g.addEdge(f48, f47);
			g.addEdge(f48, f49);
			//
			g.addEdge(f49, f50);
			g.addEdge(f50, f43);
			g.addEdge(f51, f50);
			g.addEdge(f52, f51);
			g.addEdge(f53, f44);
			g.addEdge(f54, f52);
			g.addEdge(f55, f56);
			g.addEdge(f56, f57);
			g.addEdge(f57, f53);
			g.addEdge(f58, f57);
			//
			g.addEdge(f59, f58);
			g.addEdge(f59, f60);
			//
			g.addEdge(f60, f59);
			//
			g.addEdge(f61, f60);
			g.addEdge(f61, f62);
			//
			g.addEdge(f62, f63);
			//
			g.addEdge(f63, f62);
			g.addEdge(f63, f64);
			//
			g.addEdge(f64, f65);
			g.addEdge(f65, f54);
			g.addEdge(f66, f65);
			g.addEdge(f67, f66);
			g.addEdge(f68, f55);
			g.addEdge(f69, f59);
			g.addEdge(f70, f63);
			g.addEdge(f71, f67);
			g.addEdge(f72, f73);
			g.addEdge(f73, f74);
			g.addEdge(f74, f68);
			g.addEdge(f75, f74);
			//
			g.addEdge(f76, f75);
			g.addEdge(f76, f77);
			//
			g.addEdge(f77, f78);
			g.addEdge(f78, f69);
			g.addEdge(f79, f78);
			//
			g.addEdge(f80, f79);
			g.addEdge(f80, f81);
			//
			g.addEdge(f81, f82);
			g.addEdge(f82, f70);
			g.addEdge(f83, f82);
			//
			g.addEdge(f84, f83);
			g.addEdge(f84, f85);
			//
			g.addEdge(f85, f86);
			g.addEdge(f86, f71);
			g.addEdge(f87, f86);
			g.addEdge(f88, f87);
			g.addEdge(f89, f72);
			g.addEdge(f90, f76);
			g.addEdge(f91, f80);
			g.addEdge(f92, f84);
			g.addEdge(f93, f88);
			g.addEdge(f94, f89);
			g.addEdge(f95, f94);
			//
			g.addEdge(f96, f95);
			g.addEdge(f96, f97);
			//
			g.addEdge(f97, f98);
			g.addEdge(f98, f90);
			g.addEdge(f99, f98);
			//
			g.addEdge(f100, f99);
			g.addEdge(f100, f101);
			//
			g.addEdge(f101, f102);
			g.addEdge(f102, f91);
			g.addEdge(f103, f102);
			//
			g.addEdge(f104, f103);
			g.addEdge(f104, f105);
			//
			g.addEdge(f105, f106);
			g.addEdge(f106, f92);
			g.addEdge(f107, f106);
			//
			g.addEdge(f108, f107);
			g.addEdge(f108, f109);
			//
			g.addEdge(f109, f110);
			g.addEdge(f110, f93);
			g.addEdge(f112, f96);
			g.addEdge(f113, f96);
			g.addEdge(f114, f96);
			g.addEdge(f115, f96);
			g.addEdge(f116, f96);
			g.addEdge(f117, f100);
			g.addEdge(f118, f100);
			g.addEdge(f119, f100);
			g.addEdge(f120, f100);
			g.addEdge(f121, f100);
			g.addEdge(f122, f104);
			g.addEdge(f123, f104);
			g.addEdge(f124, f104);
			g.addEdge(f125, f104);
			g.addEdge(f126, f104);
			g.addEdge(f127, f108);
			g.addEdge(f128, f108);
			g.addEdge(f129, f108);
			g.addEdge(f130, f108);
			g.addEdge(f131, f108);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return g;
	}

	public static void initPlayer() {

	}

	public static void initSpielfeld() {
		initFelder();
		wnd = new JSpielfeld("Project_M");
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
