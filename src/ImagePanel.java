import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePanel extends JPanel{

   /* private BufferedImage image;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("PFAD"));
       } catch (IOException ex) {
            // handle exception...
       }
    }
*/
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters       
        //g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        //g.drawrect(40, 100, 840, 100);
        Feld f0 = new Feld(Content.contents.EMPTY, 37, 20,80,40,40);
        Feld f1 = new Feld(Content.contents.EMPTY, 37, 70,80,40,40);
        Feld f2 = new Feld(Content.contents.EMPTY, 37, 120,80,40,40);
        Feld f3 = new Feld(Content.contents.EMPTY, 37, 170,80,40,40);
        Feld f4 = new Feld(Content.contents.EMPTY, 37, 220,80,40,40);
        Feld f5 = new Feld(Content.contents.EMPTY, 37, 270,80,40,40);
        Feld f6 = new Feld(Content.contents.EMPTY, 37, 320,80,40,40);
        Feld f7 = new Feld(Content.contents.EMPTY, 37, 370,80,40,40);
        Feld f8 = new Feld(Content.contents.BLOCK, 37, 420,80,40,40);
        Feld f9 = new Feld(Content.contents.EMPTY, 37, 470,80,40,40);
        Feld f10 = new Feld(Content.contents.EMPTY, 37, 520,80,40,40);
        Feld f11 = new Feld(Content.contents.EMPTY, 37, 570,80,40,40);
        Feld f12 = new Feld(Content.contents.EMPTY, 37, 620,80,40,40);
        Feld f13 = new Feld(Content.contents.EMPTY, 37, 670,80,40,40);
        Feld f14 = new Feld(Content.contents.EMPTY, 37, 720,80,40,40);
        Feld f15 = new Feld(Content.contents.EMPTY, 37, 770,80,40,40);
        Feld f16 = new Feld(Content.contents.EMPTY, 37, 820,80,40,40);
        Feld f17 = new Feld(Content.contents.EMPTY, 37, 20,130,40,40);
        Feld f18 = new Feld(Content.contents.EMPTY, 37, 820,130,40,40);
        Feld f19 = new Feld(Content.contents.EMPTY, 37, 20,180,40,40);
        Feld f20 = new Feld(Content.contents.EMPTY, 37, 70,180,40,40);
        Feld f21 = new Feld(Content.contents.EMPTY, 37, 120,180,40,40);
        Feld f22 = new Feld(Content.contents.EMPTY, 37, 170,180,40,40);
        Feld f23 = new Feld(Content.contents.EMPTY, 37, 220,180,40,40);
        Feld f24 = new Feld(Content.contents.EMPTY, 37, 270,180,40,40);
        Feld f25 = new Feld(Content.contents.EMPTY, 37, 320,180,40,40);
        Feld f26 = new Feld(Content.contents.EMPTY, 37, 370,180,40,40);
        Feld f27 = new Feld(Content.contents.BLOCK, 37, 420,180,40,40);
        Feld f28 = new Feld(Content.contents.EMPTY, 37, 470,180,40,40);
        Feld f29 = new Feld(Content.contents.EMPTY, 37, 520,180,40,40);
        Feld f30 = new Feld(Content.contents.EMPTY, 37, 570,180,40,40);
        Feld f31 = new Feld(Content.contents.EMPTY, 37, 620,180,40,40);
        Feld f32 = new Feld(Content.contents.EMPTY, 37, 670,180,40,40);
        Feld f33 = new Feld(Content.contents.EMPTY, 37, 720,180,40,40);
        Feld f34 = new Feld(Content.contents.EMPTY, 37, 770,180,40,40);
        Feld f35 = new Feld(Content.contents.EMPTY, 37, 820,180,40,40);
        Feld f36 = new Feld(Content.contents.BLOCK, 37, 420,230,40,40);
        Feld f37 = new Feld(Content.contents.EMPTY, 37, 320,280,40,40);
        Feld f38 = new Feld(Content.contents.EMPTY, 37, 370,280,40,40);
        Feld f39 = new Feld(Content.contents.BLOCK, 37, 420,280,40,40);
        Feld f40 = new Feld(Content.contents.EMPTY, 37, 470,280,40,40);
        Feld f41 = new Feld(Content.contents.EMPTY, 37, 520,280,40,40);
        Feld f42 = new Feld(Content.contents.EMPTY, 37, 320,330,40,40);
        Feld f43 = new Feld(Content.contents.EMPTY, 37, 520,330,40,40);
        Feld f44 = new Feld(Content.contents.EMPTY, 37, 220,380,40,40);
        Feld f45 = new Feld(Content.contents.EMPTY, 37, 270,380,40,40);
        Feld f46 = new Feld(Content.contents.BLOCK, 37, 320,380,40,40);
        Feld f47 = new Feld(Content.contents.EMPTY, 37, 370,380,40,40);
        Feld f48 = new Feld(Content.contents.EMPTY, 37, 420,380,40,40);
        Feld f49 = new Feld(Content.contents.EMPTY, 37, 470,380,40,40);
        Feld f50 = new Feld(Content.contents.BLOCK, 37, 520,380,40,40);
        Feld f51 = new Feld(Content.contents.EMPTY, 37, 570,380,40,40);
        Feld f52 = new Feld(Content.contents.EMPTY, 37, 620,380,40,40);
        Feld f53 = new Feld(Content.contents.EMPTY, 37, 220,430,40,40);
        Feld f54 = new Feld(Content.contents.EMPTY, 37, 620,430,40,40);
        Feld f55 = new Feld(Content.contents.EMPTY, 37, 120,480,40,40);
        Feld f56 = new Feld(Content.contents.EMPTY, 37, 170,480,40,40);
        Feld f57 = new Feld(Content.contents.EMPTY, 37, 220,480,40,40);
        Feld f58 = new Feld(Content.contents.EMPTY, 37, 270,480,40,40);
        Feld f59 = new Feld(Content.contents.EMPTY, 37, 320,480,40,40);
        Feld f60 = new Feld(Content.contents.EMPTY, 37, 370,480,40,40);
        Feld f61 = new Feld(Content.contents.EMPTY, 37, 420,480,40,40);
        Feld f62 = new Feld(Content.contents.EMPTY, 37, 470,480,40,40);
        Feld f63 = new Feld(Content.contents.EMPTY, 37, 520,480,40,40);
        Feld f64 = new Feld(Content.contents.EMPTY, 37, 570,480,40,40);
        Feld f65 = new Feld(Content.contents.EMPTY, 37, 620,480,40,40);
        Feld f66 = new Feld(Content.contents.EMPTY, 37, 670,480,40,40);
        Feld f67 = new Feld(Content.contents.EMPTY, 37, 720,480,40,40);
        Feld f68 = new Feld(Content.contents.EMPTY, 37, 120,530,40,40);
        Feld f69 = new Feld(Content.contents.EMPTY, 37, 320,530,40,40);
        Feld f70 = new Feld(Content.contents.EMPTY, 37, 520,530,40,40);
        Feld f71 = new Feld(Content.contents.EMPTY, 37, 720,530,40,40);
        Feld f72 = new Feld(Content.contents.BLOCK, 37, 20,580,40,40);
        Feld f73 = new Feld(Content.contents.EMPTY, 37, 70,580,40,40);
        Feld f74 = new Feld(Content.contents.EMPTY, 37, 120,580,40,40);
        Feld f75 = new Feld(Content.contents.EMPTY, 37, 170,580,40,40);
        Feld f76 = new Feld(Content.contents.BLOCK, 37, 220,580,40,40);
        Feld f77 = new Feld(Content.contents.EMPTY, 37, 270,580,40,40);
        Feld f78 = new Feld(Content.contents.EMPTY, 37, 320,580,40,40);
        Feld f79 = new Feld(Content.contents.EMPTY, 37, 370,580,40,40);
        Feld f80 = new Feld(Content.contents.BLOCK, 37, 420,580,40,40);
        Feld f81 = new Feld(Content.contents.EMPTY, 37, 470,580,40,40);
        Feld f82 = new Feld(Content.contents.EMPTY, 37, 520,580,40,40);
        Feld f83 = new Feld(Content.contents.EMPTY, 37, 570,580,40,40);
        Feld f84 = new Feld(Content.contents.BLOCK, 37, 620,580,40,40);
        Feld f85 = new Feld(Content.contents.EMPTY, 37, 670,580,40,40);
        Feld f86 = new Feld(Content.contents.EMPTY, 37, 720,580,40,40);
        Feld f87 = new Feld(Content.contents.EMPTY, 37, 770,580,40,40);
        Feld f88 = new Feld(Content.contents.BLOCK, 37, 820,580,40,40);
        Feld f89 = new Feld(Content.contents.EMPTY, 37, 20,630,40,40);
        Feld f90 = new Feld(Content.contents.EMPTY, 37, 220,630,40,40);
        Feld f91 = new Feld(Content.contents.EMPTY, 37, 420,630,40,40);
        Feld f92 = new Feld(Content.contents.EMPTY, 37, 620,630,40,40);
        Feld f93 = new Feld(Content.contents.EMPTY, 37, 820,630,40,40);
        Feld f94 = new Feld(Content.contents.EMPTY, 37, 20,680,40,40);
        Feld f95 = new Feld(Content.contents.EMPTY, 37, 70,680,40,40);
        Feld f96 = new Feld(Content.contents.EMPTY, 37, 120,680,40,40);
        Feld f97 = new Feld(Content.contents.EMPTY, 37, 170,680,40,40);
        Feld f98 = new Feld(Content.contents.EMPTY, 37, 220,680,40,40);
        Feld f99 = new Feld(Content.contents.EMPTY, 37, 270,680,40,40);
        Feld f100 = new Feld(Content.contents.EMPTY, 37, 320,680,40,40);
        Feld f101 = new Feld(Content.contents.EMPTY, 37, 370,680,40,40);
        Feld f102 = new Feld(Content.contents.EMPTY, 37, 420,680,40,40);
        Feld f103 = new Feld(Content.contents.EMPTY, 37, 470,680,40,40);
        Feld f104 = new Feld(Content.contents.EMPTY, 37, 520,680,40,40);
        Feld f105 = new Feld(Content.contents.EMPTY, 37, 570,680,40,40);
        Feld f106 = new Feld(Content.contents.EMPTY, 37, 620,680,40,40);
        Feld f107 = new Feld(Content.contents.EMPTY, 37, 670,680,40,40);
        Feld f108 = new Feld(Content.contents.EMPTY, 37, 720,680,40,40);
        Feld f109 = new Feld(Content.contents.EMPTY, 37, 770,680,40,40);
        Feld f110 = new Feld(Content.contents.EMPTY, 37, 820,680,40,40);
        Feld f111 = new Feld(Content.contents.EMPTY, 37, 420,20,40,40);
        Feld f112 = new Feld(Content.contents.RED, 37, 120,730,40,40);
        Feld f113 = new Feld(Content.contents.RED, 37, 75,760,40,40);
        Feld f114 = new Feld(Content.contents.RED, 37, 165,760,40,40);
        Feld f115 = new Feld(Content.contents.RED, 37, 95,810,40,40);
        Feld f116 = new Feld(Content.contents.RED, 37, 145,810,40,40);
        Feld f117 = new Feld(Content.contents.GREEN, 37, 320,730,40,40);
        Feld f118 = new Feld(Content.contents.GREEN, 37, 275,760,40,40);
        Feld f119 = new Feld(Content.contents.GREEN, 37, 365,760,40,40);
        Feld f120 = new Feld(Content.contents.GREEN, 37, 295,810,40,40);
        Feld f121 = new Feld(Content.contents.GREEN, 37, 345,810,40,40);
        Feld f122 = new Feld(Content.contents.YELLOW, 37, 520,730,40,40);
        Feld f123 = new Feld(Content.contents.YELLOW, 37, 475,760,40,40);
        Feld f124 = new Feld(Content.contents.YELLOW, 37, 565,760,40,40);
        Feld f125 = new Feld(Content.contents.YELLOW, 37, 495,810,40,40);
        Feld f126 = new Feld(Content.contents.YELLOW, 37, 545,810,40,40);
        Feld f127 = new Feld(Content.contents.BLUE, 37, 720,730,40,40);
        Feld f128 = new Feld(Content.contents.BLUE, 37, 675,760,40,40);
        Feld f129 = new Feld(Content.contents.BLUE, 37, 765,760,40,40);
        Feld f130 = new Feld(Content.contents.BLUE, 37, 695,810,40,40);
        Feld f131 = new Feld(Content.contents.BLUE, 37, 745,810,40,40);
        
        g.setColor(Color.ORANGE);
        //Rectangle r = new Rectangle(20, 10, 800, 10);
        //g.fillRect(r.x, r.y, r.width, r.height);
        /*horizontale Linien*/
        /*erste reihe*/
        g.fillRect(40, 95, 800, 10);
        /*dritte reihe*/
        g.fillRect(40, 195, 800, 10);
        /*fünfte reihe*/
        g.fillRect(340, 295, 200, 10);
        /*siebte reihe*/
        g.fillRect(240, 395, 400, 10);
        /*neunte reihe*/
        g.fillRect(140, 495, 600, 10);
        /*elfte reihe*/
        g.fillRect(40, 595, 800, 10);
        /*dreizehnte reihe*/
        g.fillRect(40, 695, 800, 10);
        
        /*vertikale Linien*/
        g.fillRect(435, 45, 10, 60);
        
        g.fillRect(35, 95, 10, 120);
        g.fillRect(835, 95, 10, 120);
        
        g.fillRect(435, 195, 10, 120);
        
        g.fillRect(335, 295, 10, 120);
        g.fillRect(535, 295, 10, 120);
        
        g.fillRect(235, 395, 10, 120);
        g.fillRect(635, 395, 10, 120);
        
        g.fillRect(135, 495, 10, 120);
        g.fillRect(335, 495, 10, 120);
        g.fillRect(535, 495, 10, 120);
        g.fillRect(735, 495, 10, 120);
        
        g.fillRect(35, 595, 10, 120);
        g.fillRect(235, 595, 10, 120);
        g.fillRect(435, 595, 10, 120);
        g.fillRect(635, 595, 10, 120);
        g.fillRect(835, 595, 10, 120);
        
        g.fillRect(135, 695, 10, 60);
        g.fillRect(335, 695, 10, 60);
        g.fillRect(535, 695, 10, 60);
        g.fillRect(735, 695, 10, 60);
        
        g.setColor(Color.MAGENTA);
        g.fillOval(420,20,40,40); //zielfeld
        g.fillOval(f111.x, f111.y, f111.breite, f111.hoehe);
        g.setColor(Color.BLACK);
     	
        /*erste Reihe schwarze Felder*/
        //g.fillOval(20,80,40,40);
        g.fillOval(f0.x, f0.y, f0.breite, f0.hoehe);
    	g.fillOval(f1.x, f1.y, f1.breite, f1.hoehe);
    	g.fillOval(f2.x, f2.y, f2.breite, f2.hoehe);
    	g.fillOval(f3.x, f3.y, f3.breite, f3.hoehe);
    	g.fillOval(f4.x, f4.y, f4.breite, f4.hoehe);
    	g.fillOval(f5.x, f5.y, f5.breite, f5.hoehe);
    	g.fillOval(f6.x, f6.y, f6.breite, f6.hoehe);
    	g.fillOval(f7.x, f7.y, f7.breite, f7.hoehe);
    	g.fillOval(f9.x, f9.y, f9.breite, f9.hoehe);
    	g.fillOval(f10.x, f10.y, f10.breite, f10.hoehe);
    	g.fillOval(f11.x, f11.y, f11.breite, f11.hoehe);
    	g.fillOval(f12.x, f12.y, f12.breite, f12.hoehe);
    	g.fillOval(f13.x, f13.y, f13.breite, f13.hoehe);
    	g.fillOval(f14.x, f14.y, f14.breite, f14.hoehe);
    	g.fillOval(f15.x, f15.y, f15.breite, f15.hoehe);
    	g.fillOval(f16.x, f16.y, f16.breite, f16.hoehe);
    	
    	/*zweite Reihe schwarze Felder*/
    	g.fillOval(f17.x, f17.y, f17.breite, f17.hoehe);
    	g.fillOval(f18.x, f18.y, f18.breite, f18.hoehe);
    	
    	/*dritte Reihe schwarze Felder*/
    	g.fillOval(f19.x, f19.y, f19.breite, f19.hoehe);
    	g.fillOval(f20.x, f20.y, f20.breite, f20.hoehe);
    	g.fillOval(f21.x, f21.y, f21.breite, f21.hoehe);
    	g.fillOval(f22.x, f22.y, f22.breite, f22.hoehe);
    	g.fillOval(f23.x, f23.y, f23.breite, f23.hoehe);
    	g.fillOval(f24.x, f24.y, f24.breite, f24.hoehe);
    	g.fillOval(f25.x, f25.y, f25.breite, f25.hoehe);
    	g.fillOval(f26.x, f26.y, f26.breite, f26.hoehe);
    	g.fillOval(f28.x, f28.y, f28.breite, f28.hoehe);
    	g.fillOval(f29.x, f29.y, f29.breite, f29.hoehe);
    	g.fillOval(f30.x, f30.y, f30.breite, f30.hoehe);
    	g.fillOval(f31.x, f31.y, f31.breite, f31.hoehe);
    	g.fillOval(f32.x, f32.y, f32.breite, f32.hoehe);
    	g.fillOval(f33.x, f33.y, f33.breite, f33.hoehe);
    	g.fillOval(f34.x, f34.y, f34.breite, f34.hoehe);
    	g.fillOval(f35.x, f35.y, f35.breite, f35.hoehe);
    	
    	/*fünfte Reihe schwarze Felder*/
    	g.fillOval(f37.x, f37.y, f37.breite, f37.hoehe);
    	g.fillOval(f38.x, f38.y, f38.breite, f38.hoehe);
    	g.fillOval(f40.x, f40.y, f40.breite, f40.hoehe);
    	g.fillOval(f41.x, f41.y, f41.breite, f41.hoehe);
    	
    	/*sechste Reihe schwarze Felder*/
    	g.fillOval(f42.x, f42.y, f42.breite, f42.hoehe);
    	g.fillOval(f43.x, f43.y, f43.breite, f43.hoehe);
    	
    	/*siebte Reihe schwarze Felder*/
    	g.fillOval(f44.x, f44.y, f44.breite, f44.hoehe);
    	g.fillOval(f45.x, f45.y, f45.breite, f45.hoehe);
    	g.fillOval(f47.x, f47.y, f47.breite, f47.hoehe);
    	g.fillOval(f48.x, f48.y, f48.breite, f48.hoehe);
    	g.fillOval(f49.x, f49.y, f49.breite, f49.hoehe);
    	g.fillOval(f51.x, f51.y, f51.breite, f51.hoehe);
    	g.fillOval(f52.x, f52.y, f52.breite, f52.hoehe);
    	
    	/*achte Reihe schwarze Felder*/
    	g.fillOval(f53.x, f53.y, f53.breite, f53.hoehe);
    	g.fillOval(f54.x, f54.y, f54.breite, f54.hoehe);
    	
    	/*neunte Reihe schwarze Felder*/
    	g.fillOval(f55.x, f55.y, f55.breite, f55.hoehe);
    	g.fillOval(f56.x, f56.y, f56.breite, f56.hoehe);
    	g.fillOval(f57.x, f57.y, f57.breite, f57.hoehe);
    	g.fillOval(f58.x, f58.y, f58.breite, f58.hoehe);
    	g.fillOval(f59.x, f59.y, f59.breite, f59.hoehe);
    	g.fillOval(f60.x, f60.y, f60.breite, f60.hoehe);
    	g.fillOval(f61.x, f61.y, f61.breite, f61.hoehe);
    	g.fillOval(f62.x, f62.y, f62.breite, f62.hoehe);
    	g.fillOval(f63.x, f63.y, f63.breite, f63.hoehe);
    	g.fillOval(f64.x, f64.y, f64.breite, f64.hoehe);
    	g.fillOval(f65.x, f65.y, f65.breite, f65.hoehe);
    	g.fillOval(f66.x, f66.y, f66.breite, f66.hoehe);
    	g.fillOval(f67.x, f67.y, f67.breite, f67.hoehe);
    	
    	/*zehnte Reihe schwarze Felder*/
    	g.fillOval(f68.x, f68.y, f68.breite, f68.hoehe);
    	g.fillOval(f69.x, f69.y, f69.breite, f69.hoehe);
    	g.fillOval(f70.x, f70.y, f70.breite, f70.hoehe);
    	g.fillOval(f71.x, f71.y, f71.breite, f71.hoehe);
    	
    	/*elfte Reihe schwarze Felder*/
    	g.fillOval(f73.x, f73.y, f73.breite, f73.hoehe);
    	g.fillOval(f74.x, f74.y, f74.breite, f74.hoehe);
    	g.fillOval(f75.x, f75.y, f75.breite, f75.hoehe);
    	g.fillOval(f77.x, f77.y, f77.breite, f77.hoehe);
    	g.fillOval(f78.x, f78.y, f78.breite, f78.hoehe);
    	g.fillOval(f79.x, f79.y, f79.breite, f79.hoehe);
    	g.fillOval(f81.x, f81.y, f81.breite, f81.hoehe);
    	g.fillOval(f82.x, f82.y, f82.breite, f82.hoehe);
    	g.fillOval(f83.x, f83.y, f83.breite, f83.hoehe);
    	g.fillOval(f85.x, f85.y, f85.breite, f85.hoehe);
    	g.fillOval(f86.x, f86.y, f86.breite, f86.hoehe);
    	g.fillOval(f87.x, f87.y, f87.breite, f87.hoehe);
    	
    	/*zwölfte Reihe schwarze Felder*/
    	g.fillOval(f89.x, f89.y, f89.breite, f89.hoehe);
    	g.fillOval(f90.x, f90.y, f90.breite, f90.hoehe);
    	g.fillOval(f91.x, f91.y, f91.breite, f91.hoehe);
    	g.fillOval(f92.x, f92.y, f92.breite, f92.hoehe);
    	g.fillOval(f93.x, f93.y, f93.breite, f93.hoehe);
    	
     	
        /*dreizehnte Reihe schwarze Felder*/
    	g.fillOval(f94.x, f94.y, f94.breite, f94.hoehe);
    	g.fillOval(f95.x, f95.y, f95.breite, f95.hoehe);
    	g.fillOval(f96.x, f96.y, f96.breite, f96.hoehe);
    	g.fillOval(f97.x, f97.y, f97.breite, f97.hoehe);
    	g.fillOval(f98.x, f98.y, f98.breite, f98.hoehe);
    	g.fillOval(f99.x, f99.y, f99.breite, f99.hoehe);
    	g.fillOval(f100.x, f100.y, f100.breite, f100.hoehe);
    	g.fillOval(f101.x, f101.y, f101.breite, f101.hoehe);
    	g.fillOval(f102.x, f102.y, f102.breite, f102.hoehe);
    	g.fillOval(f103.x, f103.y, f103.breite, f103.hoehe);
    	g.fillOval(f104.x, f104.y, f104.breite, f104.hoehe);
    	g.fillOval(f105.x, f105.y, f105.breite, f105.hoehe);
    	g.fillOval(f106.x, f106.y, f106.breite, f106.hoehe);
    	g.fillOval(f107.x, f107.y, f107.breite, f107.hoehe);
    	g.fillOval(f108.x, f108.y, f108.breite, f108.hoehe);
    	g.fillOval(f109.x, f109.y, f109.breite, f109.hoehe);
    	g.fillOval(f110.x, f110.y, f110.breite, f110.hoehe);
    	
    	
    	g.setColor(Color.WHITE);
    	/*erste Reihe rote Felder*/
    	g.fillOval(f8.x, f8.y, f8.breite, f8.hoehe);
    	/*zweite Reihe rote Felder*/
    	/*dritte Reihe rote Felder*/
    	g.fillOval(f27.x, f27.y, f27.breite, f27.hoehe);
    	/*vierte Reihe rote Felder*/
    	g.fillOval(f36.x, f36.y, f36.breite, f36.hoehe);
    	/*fünfte Reihe rote Felder*/
    	g.fillOval(f39.x, f39.y, f39.breite, f39.hoehe);

    	/*sechste Reihe rote Felder*/
    	/*siebte Reihe rote Felder*/
    	g.fillOval(f46.x, f46.y, f46.breite, f46.hoehe);
    	g.fillOval(f50.x, f50.y, f50.breite, f50.hoehe);
    	/*achte Reihe rote Felder*/
    	/*neunte Reihe rote Felder*/
    	/*zehnte Reihe rote Felder*/
    	/*elfte Reihe rote Felder*/
    	g.fillOval(f72.x, f72.y, f72.breite, f72.hoehe);
    	g.fillOval(f76.x, f76.y, f76.breite, f76.hoehe);
    	g.fillOval(f80.x, f80.y, f80.breite, f80.hoehe);
    	g.fillOval(f84.x, f84.y, f84.breite, f84.hoehe);
    	g.fillOval(f88.x, f88.y, f88.breite, f88.hoehe);

    	/*zwölfte Reihe rote Felder*/
    	/*dreizehnte Reihe rote Felder*/
    	
    	/*Spielerfelder*/
    	/*roter Spieler*/
    	g.setColor(Color.RED);
    	g.fillOval(f112.x, f112.y, f112.breite, f112.hoehe);
    	g.fillOval(f113.x, f113.y, f113.breite, f113.hoehe);
    	g.fillOval(f114.x, f114.y, f114.breite, f114.hoehe);
    	g.fillOval(f115.x, f115.y, f115.breite, f115.hoehe);
    	g.fillOval(f116.x, f116.y, f116.breite, f116.hoehe);
    	
    	/*grüner Spieler*/
    	g.setColor(Color.green);
    	g.fillOval(f117.x, f117.y, f117.breite, f117.hoehe);
    	g.fillOval(f118.x, f118.y, f118.breite, f118.hoehe);
    	g.fillOval(f119.x, f119.y, f119.breite, f119.hoehe);
    	g.fillOval(f120.x, f120.y, f120.breite, f120.hoehe);
    	g.fillOval(f121.x, f121.y, f121.breite, f121.hoehe);
    	
    	/*gelber Spieler*/
    	g.setColor(Color.YELLOW);
    	g.fillOval(f122.x, f122.y, f122.breite, f122.hoehe);
    	g.fillOval(f123.x, f123.y, f123.breite, f123.hoehe);
    	g.fillOval(f124.x, f124.y, f124.breite, f124.hoehe);
    	g.fillOval(f125.x, f125.y, f125.breite, f125.hoehe);
    	g.fillOval(f126.x, f126.y, f126.breite, f126.hoehe);
    	
    	/*blauer Spieler*/
    	g.setColor(Color.BLUE);
    	g.fillOval(f127.x, f127.y, f127.breite, f127.hoehe);
    	g.fillOval(f128.x, f128.y, f128.breite, f128.hoehe);
    	g.fillOval(f129.x, f129.y, f129.breite, f129.hoehe);
    	g.fillOval(f130.x, f130.y, f130.breite, f130.hoehe);
    	g.fillOval(f131.x, f131.y, f131.breite, f131.hoehe);
    	
    	
    	

    }

//	public void paint(Graphics g)
	//{ // Methoden von g aufrufen, z.B.
	//g.drawString("Mein erster Text",0,20);
	//g.drawLine(100,5,50,200);
	//g.drawOval(200,300,10,20);
	//}
}