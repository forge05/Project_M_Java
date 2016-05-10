import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;



public class JSpielfeld extends JFrame{
	public static int wuerfelErg;
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
		    	  wuerfelErg = random.nextInt(6) + 1;
		    	  wuerfelErgebnis.setText("" + wuerfelErg);
		    	  //System.out.println(random.nextInt(6) + 1);
		      };
		});setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		pack();
		setSize(1000,1000);
		wuerfelButton.setSize(250, 250);
	}
}
