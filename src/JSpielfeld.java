import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;



public class JSpielfeld extends JFrame{
	JSpielfeld(String spielfeldname){
		super(spielfeldname);
		setVisible(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel zeichenbrett = new ImagePanel();
		JPanel abc = new JPanel();
		JButton wuerfelButton = new JButton("Würfeln");
		JLabel wuerfelErgebnis = new JLabel();
		abc.add(wuerfelButton);
		abc.add(wuerfelErgebnis);
		contentPane.add(zeichenbrett, BorderLayout.CENTER);
		contentPane.add(abc, BorderLayout.SOUTH);
		//contentPane.add(wuerfelErgebnis, BorderLayout.EAST);
		wuerfelButton.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e){
		    	  Random random = new Random();
		    	  wuerfelErgebnis.setText("" + (random.nextInt(6) + 1));
		    	  //System.out.println(random.nextInt(6) + 1);
		      };
		});setVisible(true);
		pack();
		setSize(1000,1000);
		wuerfelButton.setSize(250, 250);
	}
}
