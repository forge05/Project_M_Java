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
        g.fillOval(Game.f111.x, Game.f111.y, Game.f111.breite, Game.f111.hoehe);
        g.setColor(Color.BLACK);
     	
        /*erste Reihe schwarze Felder*/
        //g.fillOval(20,80,40,40);
        g.fillOval(Game.f0.x, Game.f0.y, Game.f0.breite, Game.f0.hoehe);
    	g.fillOval(Game.f1.x, Game.f1.y, Game.f1.breite, Game.f1.hoehe);
    	g.fillOval(Game.f2.x, Game.f2.y, Game.f2.breite, Game.f2.hoehe);
    	g.fillOval(Game.f3.x, Game.f3.y, Game.f3.breite, Game.f3.hoehe);
    	g.fillOval(Game.f4.x, Game.f4.y, Game.f4.breite, Game.f4.hoehe);
    	g.fillOval(Game.f5.x, Game.f5.y, Game.f5.breite, Game.f5.hoehe);
    	g.fillOval(Game.f6.x, Game.f6.y, Game.f6.breite, Game.f6.hoehe);
    	g.fillOval(Game.f7.x, Game.f7.y, Game.f7.breite, Game.f7.hoehe);
    	g.fillOval(Game.f9.x, Game.f9.y, Game.f9.breite, Game.f9.hoehe);
    	g.fillOval(Game.f10.x, Game.f10.y, Game.f10.breite, Game.f10.hoehe);
    	g.fillOval(Game.f11.x, Game.f11.y, Game.f11.breite, Game.f11.hoehe);
    	g.fillOval(Game.f12.x, Game.f12.y, Game.f12.breite, Game.f12.hoehe);
    	g.fillOval(Game.f13.x, Game.f13.y, Game.f13.breite, Game.f13.hoehe);
    	g.fillOval(Game.f14.x, Game.f14.y, Game.f14.breite, Game.f14.hoehe);
    	g.fillOval(Game.f15.x, Game.f15.y, Game.f15.breite, Game.f15.hoehe);
    	g.fillOval(Game.f16.x, Game.f16.y, Game.f16.breite, Game.f16.hoehe);
    	
    	/*zweite Reihe schwarze Felder*/
    	g.fillOval(Game.f17.x, Game.f17.y, Game.f17.breite, Game.f17.hoehe);
    	g.fillOval(Game.f18.x, Game.f18.y, Game.f18.breite, Game.f18.hoehe);
    	
    	/*dritte Reihe schwarze Felder*/
    	g.fillOval(Game.f19.x, Game.f19.y, Game.f19.breite, Game.f19.hoehe);
    	g.fillOval(Game.f20.x, Game.f20.y, Game.f20.breite, Game.f20.hoehe);
    	g.fillOval(Game.f21.x, Game.f21.y, Game.f21.breite, Game.f21.hoehe);
    	g.fillOval(Game.f22.x, Game.f22.y, Game.f22.breite, Game.f22.hoehe);
    	g.fillOval(Game.f23.x, Game.f23.y, Game.f23.breite, Game.f23.hoehe);
    	g.fillOval(Game.f24.x, Game.f24.y, Game.f24.breite, Game.f24.hoehe);
    	g.fillOval(Game.f25.x, Game.f25.y, Game.f25.breite, Game.f25.hoehe);
    	g.fillOval(Game.f26.x, Game.f26.y, Game.f26.breite, Game.f26.hoehe);
    	g.fillOval(Game.f28.x, Game.f28.y, Game.f28.breite, Game.f28.hoehe);
    	g.fillOval(Game.f29.x, Game.f29.y, Game.f29.breite, Game.f29.hoehe);
    	g.fillOval(Game.f30.x, Game.f30.y, Game.f30.breite, Game.f30.hoehe);
    	g.fillOval(Game.f31.x, Game.f31.y, Game.f31.breite, Game.f31.hoehe);
    	g.fillOval(Game.f32.x, Game.f32.y, Game.f32.breite, Game.f32.hoehe);
    	g.fillOval(Game.f33.x, Game.f33.y, Game.f33.breite, Game.f33.hoehe);
    	g.fillOval(Game.f34.x, Game.f34.y, Game.f34.breite, Game.f34.hoehe);
    	g.fillOval(Game.f35.x, Game.f35.y, Game.f35.breite, Game.f35.hoehe);
    	
    	/*fünfte Reihe schwarze Felder*/
    	g.fillOval(Game.f37.x, Game.f37.y, Game.f37.breite, Game.f37.hoehe);
    	g.fillOval(Game.f38.x, Game.f38.y, Game.f38.breite, Game.f38.hoehe);
    	g.fillOval(Game.f40.x, Game.f40.y, Game.f40.breite, Game.f40.hoehe);
    	g.fillOval(Game.f41.x, Game.f41.y, Game.f41.breite, Game.f41.hoehe);
    	
    	/*sechste Reihe schwarze Felder*/
    	g.fillOval(Game.f42.x, Game.f42.y, Game.f42.breite, Game.f42.hoehe);
    	g.fillOval(Game.f43.x, Game.f43.y, Game.f43.breite, Game.f43.hoehe);
    	
    	/*siebte Reihe schwarze Felder*/
    	g.fillOval(Game.f44.x, Game.f44.y, Game.f44.breite, Game.f44.hoehe);
    	g.fillOval(Game.f45.x, Game.f45.y, Game.f45.breite, Game.f45.hoehe);
    	g.fillOval(Game.f47.x, Game.f47.y, Game.f47.breite, Game.f47.hoehe);
    	g.fillOval(Game.f48.x, Game.f48.y, Game.f48.breite, Game.f48.hoehe);
    	g.fillOval(Game.f49.x, Game.f49.y, Game.f49.breite, Game.f49.hoehe);
    	g.fillOval(Game.f51.x, Game.f51.y, Game.f51.breite, Game.f51.hoehe);
    	g.fillOval(Game.f52.x, Game.f52.y, Game.f52.breite, Game.f52.hoehe);
    	
    	/*achte Reihe schwarze Felder*/
    	g.fillOval(Game.f53.x, Game.f53.y, Game.f53.breite, Game.f53.hoehe);
    	g.fillOval(Game.f54.x, Game.f54.y, Game.f54.breite, Game.f54.hoehe);
    	
    	/*neunte Reihe schwarze Felder*/
    	g.fillOval(Game.f55.x, Game.f55.y, Game.f55.breite, Game.f55.hoehe);
    	g.fillOval(Game.f56.x, Game.f56.y, Game.f56.breite, Game.f56.hoehe);
    	g.fillOval(Game.f57.x, Game.f57.y, Game.f57.breite, Game.f57.hoehe);
    	g.fillOval(Game.f58.x, Game.f58.y, Game.f58.breite, Game.f58.hoehe);
    	g.fillOval(Game.f59.x, Game.f59.y, Game.f59.breite, Game.f59.hoehe);
    	g.fillOval(Game.f60.x, Game.f60.y, Game.f60.breite, Game.f60.hoehe);
    	g.fillOval(Game.f61.x, Game.f61.y, Game.f61.breite, Game.f61.hoehe);
    	g.fillOval(Game.f62.x, Game.f62.y, Game.f62.breite, Game.f62.hoehe);
    	g.fillOval(Game.f63.x, Game.f63.y, Game.f63.breite, Game.f63.hoehe);
    	g.fillOval(Game.f64.x, Game.f64.y, Game.f64.breite, Game.f64.hoehe);
    	g.fillOval(Game.f65.x, Game.f65.y, Game.f65.breite, Game.f65.hoehe);
    	g.fillOval(Game.f66.x, Game.f66.y, Game.f66.breite, Game.f66.hoehe);
    	g.fillOval(Game.f67.x, Game.f67.y, Game.f67.breite, Game.f67.hoehe);
    	
    	/*zehnte Reihe schwarze Felder*/
    	g.fillOval(Game.f68.x, Game.f68.y, Game.f68.breite, Game.f68.hoehe);
    	g.fillOval(Game.f69.x, Game.f69.y, Game.f69.breite, Game.f69.hoehe);
    	g.fillOval(Game.f70.x, Game.f70.y, Game.f70.breite, Game.f70.hoehe);
    	g.fillOval(Game.f71.x, Game.f71.y, Game.f71.breite, Game.f71.hoehe);
    	
    	/*elfte Reihe schwarze Felder*/
    	g.fillOval(Game.f73.x, Game.f73.y, Game.f73.breite, Game.f73.hoehe);
    	g.fillOval(Game.f74.x, Game.f74.y, Game.f74.breite, Game.f74.hoehe);
    	g.fillOval(Game.f75.x, Game.f75.y, Game.f75.breite, Game.f75.hoehe);
    	g.fillOval(Game.f77.x, Game.f77.y, Game.f77.breite, Game.f77.hoehe);
    	g.fillOval(Game.f78.x, Game.f78.y, Game.f78.breite, Game.f78.hoehe);
    	g.fillOval(Game.f79.x, Game.f79.y, Game.f79.breite, Game.f79.hoehe);
    	g.fillOval(Game.f81.x, Game.f81.y, Game.f81.breite, Game.f81.hoehe);
    	g.fillOval(Game.f82.x, Game.f82.y, Game.f82.breite, Game.f82.hoehe);
    	g.fillOval(Game.f83.x, Game.f83.y, Game.f83.breite, Game.f83.hoehe);
    	g.fillOval(Game.f85.x, Game.f85.y, Game.f85.breite, Game.f85.hoehe);
    	g.fillOval(Game.f86.x, Game.f86.y, Game.f86.breite, Game.f86.hoehe);
    	g.fillOval(Game.f87.x, Game.f87.y, Game.f87.breite, Game.f87.hoehe);
    	
    	/*zwölfte Reihe schwarze Felder*/
    	g.fillOval(Game.f89.x, Game.f89.y, Game.f89.breite, Game.f89.hoehe);
    	g.fillOval(Game.f90.x, Game.f90.y, Game.f90.breite, Game.f90.hoehe);
    	g.fillOval(Game.f91.x, Game.f91.y, Game.f91.breite, Game.f91.hoehe);
    	g.fillOval(Game.f92.x, Game.f92.y, Game.f92.breite, Game.f92.hoehe);
    	g.fillOval(Game.f93.x, Game.f93.y, Game.f93.breite, Game.f93.hoehe);
    	
     	
        /*dreizehnte Reihe schwarze Felder*/
    	g.fillOval(Game.f94.x, Game.f94.y, Game.f94.breite, Game.f94.hoehe);
    	g.fillOval(Game.f95.x, Game.f95.y, Game.f95.breite, Game.f95.hoehe);
    	g.fillOval(Game.f96.x, Game.f96.y, Game.f96.breite, Game.f96.hoehe);
    	g.fillOval(Game.f97.x, Game.f97.y, Game.f97.breite, Game.f97.hoehe);
    	g.fillOval(Game.f98.x, Game.f98.y, Game.f98.breite, Game.f98.hoehe);
    	g.fillOval(Game.f99.x, Game.f99.y, Game.f99.breite, Game.f99.hoehe);
    	g.fillOval(Game.f100.x, Game.f100.y, Game.f100.breite, Game.f100.hoehe);
    	g.fillOval(Game.f101.x, Game.f101.y, Game.f101.breite, Game.f101.hoehe);
    	g.fillOval(Game.f102.x, Game.f102.y, Game.f102.breite, Game.f102.hoehe);
    	g.fillOval(Game.f103.x, Game.f103.y, Game.f103.breite, Game.f103.hoehe);
    	g.fillOval(Game.f104.x, Game.f104.y, Game.f104.breite, Game.f104.hoehe);
    	g.fillOval(Game.f105.x, Game.f105.y, Game.f105.breite, Game.f105.hoehe);
    	g.fillOval(Game.f106.x, Game.f106.y, Game.f106.breite, Game.f106.hoehe);
    	g.fillOval(Game.f107.x, Game.f107.y, Game.f107.breite, Game.f107.hoehe);
    	g.fillOval(Game.f108.x, Game.f108.y, Game.f108.breite, Game.f108.hoehe);
    	g.fillOval(Game.f109.x, Game.f109.y, Game.f109.breite, Game.f109.hoehe);
    	g.fillOval(Game.f110.x, Game.f110.y, Game.f110.breite, Game.f110.hoehe);
    	
    	
    	g.setColor(Color.WHITE);
    	/*erste Reihe rote Felder*/
    	g.fillOval(Game.f8.x, Game.f8.y, Game.f8.breite, Game.f8.hoehe);
    	/*zweite Reihe rote Felder*/
    	/*dritte Reihe rote Felder*/
    	g.fillOval(Game.f27.x, Game.f27.y, Game.f27.breite, Game.f27.hoehe);
    	/*vierte Reihe rote Felder*/
    	g.fillOval(Game.f36.x, Game.f36.y, Game.f36.breite, Game.f36.hoehe);
    	/*fünfte Reihe rote Felder*/
    	g.fillOval(Game.f39.x, Game.f39.y, Game.f39.breite, Game.f39.hoehe);

    	/*sechste Reihe rote Felder*/
    	/*siebte Reihe rote Felder*/
    	g.fillOval(Game.f46.x, Game.f46.y, Game.f46.breite, Game.f46.hoehe);
    	g.fillOval(Game.f50.x, Game.f50.y, Game.f50.breite, Game.f50.hoehe);
    	/*achte Reihe rote Felder*/
    	/*neunte Reihe rote Felder*/
    	/*zehnte Reihe rote Felder*/
    	/*elfte Reihe rote Felder*/
    	g.fillOval(Game.f72.x, Game.f72.y, Game.f72.breite, Game.f72.hoehe);
    	g.fillOval(Game.f76.x, Game.f76.y, Game.f76.breite, Game.f76.hoehe);
    	g.fillOval(Game.f80.x, Game.f80.y, Game.f80.breite, Game.f80.hoehe);
    	g.fillOval(Game.f84.x, Game.f84.y, Game.f84.breite, Game.f84.hoehe);
    	g.fillOval(Game.f88.x, Game.f88.y, Game.f88.breite, Game.f88.hoehe);

    	/*zwölfte Reihe rote Felder*/
    	/*dreizehnte Reihe rote Felder*/
    	
    	/*Spielerfelder*/
    	/*roter Spieler*/
    	g.setColor(Color.RED);
    	g.fillOval(Game.f112.x, Game.f112.y, Game.f112.breite, Game.f112.hoehe);
    	g.fillOval(Game.f113.x, Game.f113.y, Game.f113.breite, Game.f113.hoehe);
    	g.fillOval(Game.f114.x, Game.f114.y, Game.f114.breite, Game.f114.hoehe);
    	g.fillOval(Game.f115.x, Game.f115.y, Game.f115.breite, Game.f115.hoehe);
    	g.fillOval(Game.f116.x, Game.f116.y, Game.f116.breite, Game.f116.hoehe);
    	
    	/*grüner Spieler*/
    	g.setColor(Color.green);
    	g.fillOval(Game.f117.x, Game.f117.y, Game.f117.breite, Game.f117.hoehe);
    	g.fillOval(Game.f118.x, Game.f118.y, Game.f118.breite, Game.f118.hoehe);
    	g.fillOval(Game.f119.x, Game.f119.y, Game.f119.breite, Game.f119.hoehe);
    	g.fillOval(Game.f120.x, Game.f120.y, Game.f120.breite, Game.f120.hoehe);
    	g.fillOval(Game.f121.x, Game.f121.y, Game.f121.breite, Game.f121.hoehe);
    	
    	/*gelber Spieler*/
    	g.setColor(Color.YELLOW);
    	g.fillOval(Game.f122.x, Game.f122.y, Game.f122.breite, Game.f122.hoehe);
    	g.fillOval(Game.f123.x, Game.f123.y, Game.f123.breite, Game.f123.hoehe);
    	g.fillOval(Game.f124.x, Game.f124.y, Game.f124.breite, Game.f124.hoehe);
    	g.fillOval(Game.f125.x, Game.f125.y, Game.f125.breite, Game.f125.hoehe);
    	g.fillOval(Game.f126.x, Game.f126.y, Game.f126.breite, Game.f126.hoehe);
    	
    	/*blauer Spieler*/
    	g.setColor(Color.BLUE);
    	g.fillOval(Game.f127.x, Game.f127.y, Game.f127.breite, Game.f127.hoehe);
    	g.fillOval(Game.f128.x, Game.f128.y, Game.f128.breite, Game.f128.hoehe);
    	g.fillOval(Game.f129.x, Game.f129.y, Game.f129.breite, Game.f129.hoehe);
    	g.fillOval(Game.f130.x, Game.f130.y, Game.f130.breite, Game.f130.hoehe);
    	g.fillOval(Game.f131.x, Game.f131.y, Game.f131.breite, Game.f131.hoehe);
    	
    	
    	

    }

//	public void paint(Graphics g)
	//{ // Methoden von g aufrufen, z.B.
	//g.drawString("Mein erster Text",0,20);
	//g.drawLine(100,5,50,200);
	//g.drawOval(200,300,10,20);
	//}
}