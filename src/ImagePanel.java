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
          image = ImageIO.read(new File("C:\\Users\\Nikolas\\Desktop\\Bachelorzeugs\\A1OXNtNSUzL._SL1500_.jpg"));
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
        g.fillRect(635, 595, 10, 120);
        g.fillRect(835, 595, 10, 120);
        
        g.fillRect(135, 695, 10, 60);
        g.fillRect(335, 695, 10, 60);
        g.fillRect(535, 695, 10, 60);
        g.fillRect(735, 695, 10, 60);
        
        g.setColor(Color.MAGENTA);
        g.fillOval(420,20,40,40); //zielfeld
        g.setColor(Color.BLACK);
     	
        /*erste Reihe schwarze Felder*/
        g.fillOval(20,80,40,40);
    	g.fillOval(70,80,40,40);
    	g.fillOval(120,80,40,40);
    	g.fillOval(170,80,40,40);
    	g.fillOval(220,80,40,40);
    	g.fillOval(270,80,40,40);
    	g.fillOval(320,80,40,40);
    	g.fillOval(370,80,40,40);
    	g.fillOval(470,80,40,40);
    	g.fillOval(520,80,40,40);
    	g.fillOval(570,80,40,40);
    	g.fillOval(620,80,40,40);
    	g.fillOval(670,80,40,40);
    	g.fillOval(720,80,40,40);
    	g.fillOval(770,80,40,40);
    	g.fillOval(820,80,40,40);
    	
    	/*zweite Reihe schwarze Felder*/
    	g.fillOval(20,130,40,40);
    	g.fillOval(820,130,40,40);
    	
    	/*dritte Reihe schwarze Felder*/
    	g.fillOval(20,180,40,40);
    	g.fillOval(70,180,40,40);
    	g.fillOval(120,180,40,40);
    	g.fillOval(170,180,40,40);
    	g.fillOval(220,180,40,40);
    	g.fillOval(270,180,40,40);
    	g.fillOval(320,180,40,40);
    	g.fillOval(370,180,40,40);
    	g.fillOval(470,180,40,40);
    	g.fillOval(520,180,40,40);
    	g.fillOval(570,180,40,40);
    	g.fillOval(620,180,40,40);
    	g.fillOval(670,180,40,40);
    	g.fillOval(720,180,40,40);
    	g.fillOval(770,180,40,40);
    	g.fillOval(820,180,40,40);
    	
    	/*fünfte Reihe schwarze Felder*/
    	g.fillOval(320,280,40,40);
    	g.fillOval(370,280,40,40);
    	g.fillOval(470,280,40,40);
    	g.fillOval(520,280,40,40);
    	
    	/*sechste Reihe schwarze Felder*/
    	g.fillOval(320,330,40,40);
    	g.fillOval(520,330,40,40);
    	
    	/*siebte Reihe schwarze Felder*/
    	g.fillOval(220,380,40,40);
    	g.fillOval(270,380,40,40);
    	g.fillOval(370,380,40,40);
    	g.fillOval(420,380,40,40);
    	g.fillOval(470,380,40,40);
    	g.fillOval(570,380,40,40);
    	g.fillOval(620,380,40,40);
    	
    	/*achte Reihe schwarze Felder*/
    	g.fillOval(220,430,40,40);
    	g.fillOval(620,430,40,40);
    	
    	/*neunte Reihe schwarze Felder*/
    	g.fillOval(120,480,40,40);
    	g.fillOval(170,480,40,40);
    	g.fillOval(220,480,40,40);
    	g.fillOval(270,480,40,40);
    	g.fillOval(320,480,40,40);
    	g.fillOval(370,480,40,40);
    	g.fillOval(420,480,40,40);
    	g.fillOval(470,480,40,40);
    	g.fillOval(520,480,40,40);
    	g.fillOval(570,480,40,40);
    	g.fillOval(620,480,40,40);
    	g.fillOval(670,480,40,40);
    	g.fillOval(720,480,40,40);
    	
    	/*zehnte Reihe schwarze Felder*/
    	g.fillOval(120,530,40,40);
    	g.fillOval(320,530,40,40);
    	g.fillOval(520,530,40,40);
    	g.fillOval(720,530,40,40);
    	
    	/*elfte Reihe schwarze Felder*/
    	g.fillOval(70,580,40,40);
    	g.fillOval(120,580,40,40);
    	g.fillOval(170,580,40,40);
    	g.fillOval(270,580,40,40);
    	g.fillOval(320,580,40,40);
    	g.fillOval(370,580,40,40);
    	g.fillOval(470,580,40,40);
    	g.fillOval(520,580,40,40);
    	g.fillOval(570,580,40,40);
    	g.fillOval(670,580,40,40);
    	g.fillOval(720,580,40,40);
    	g.fillOval(770,580,40,40);
    	
    	/*zwölfte Reihe schwarze Felder*/
    	g.fillOval(20,630,40,40);
    	g.fillOval(220,630,40,40);
    	g.fillOval(620,630,40,40);
    	g.fillOval(820,630,40,40);
    	
     	
        /*dreizehnte Reihe schwarze Felder*/
        g.fillOval(20,680,40,40);
    	g.fillOval(70,680,40,40);
    	g.fillOval(120,680,40,40);
    	g.fillOval(170,680,40,40);
    	g.fillOval(220,680,40,40);
    	g.fillOval(270,680,40,40);
    	g.fillOval(320,680,40,40);
    	g.fillOval(370,680,40,40);
    	g.fillOval(420,680,40,40);
    	g.fillOval(470,680,40,40);
    	g.fillOval(520,680,40,40);
    	g.fillOval(570,680,40,40);
    	g.fillOval(620,680,40,40);
    	g.fillOval(670,680,40,40);
    	g.fillOval(720,680,40,40);
    	g.fillOval(770,680,40,40);
    	g.fillOval(820,680,40,40);
    	
    	
    	g.setColor(Color.WHITE);
    	/*erste Reihe rote Felder*/
    	g.fillOval(420,80,40,40);
    	/*zweite Reihe rote Felder*/
    	/*dritte Reihe rote Felder*/
    	g.fillOval(420,180,40,40);
    	/*vierte Reihe rote Felder*/
    	g.fillOval(420,230,40,40);
    	/*fünfte Reihe rote Felder*/
    	g.fillOval(420,280,40,40);

    	/*sechste Reihe rote Felder*/
    	/*siebte Reihe rote Felder*/
    	g.fillOval(320,380,40,40);
    	g.fillOval(520,380,40,40);
    	/*achte Reihe rote Felder*/
    	/*neunte Reihe rote Felder*/
    	/*zehnte Reihe rote Felder*/
    	/*elfte Reihe rote Felder*/
    	g.fillOval(20,580,40,40);
    	g.fillOval(220,580,40,40);
    	g.fillOval(420,580,40,40);
    	g.fillOval(620,580,40,40);
    	g.fillOval(820,580,40,40);

    	/*zwölfte Reihe rote Felder*/
    	/*dreizehnte Reihe rote Felder*/
    	
    	/*Spielerfelder*/
    	/*roter Spieler*/
    	g.setColor(Color.RED);
    	g.fillOval(120,730,40,40);
    	g.fillOval(75,760,40,40);
    	g.fillOval(165,760,40,40);
    	g.fillOval(95,810,40,40);
    	g.fillOval(145,810,40,40);
    	
    	/*grüner Spieler*/
    	g.setColor(Color.green);
    	g.fillOval(320,730,40,40);
    	g.fillOval(275,760,40,40);
    	g.fillOval(365,760,40,40);
    	g.fillOval(295,810,40,40);
    	g.fillOval(345,810,40,40);
    	
    	/*gelber Spieler*/
    	g.setColor(Color.YELLOW);
    	g.fillOval(520,730,40,40);
    	g.fillOval(475,760,40,40);
    	g.fillOval(565,760,40,40);
    	g.fillOval(495,810,40,40);
    	g.fillOval(545,810,40,40);
    	
    	/*blauer Spieler*/
    	g.setColor(Color.BLUE);
    	g.fillOval(720,730,40,40);
    	g.fillOval(675,760,40,40);
    	g.fillOval(765,760,40,40);
    	g.fillOval(695,810,40,40);
    	g.fillOval(745,810,40,40);
    	

    }

//	public void paint(Graphics g)
	//{ // Methoden von g aufrufen, z.B.
	//g.drawString("Mein erster Text",0,20);
	//g.drawLine(100,5,50,200);
	//g.drawOval(200,300,10,20);
	//}
}