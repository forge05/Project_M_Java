import javax.swing.*;
import java.awt.*;



public class JSpielfeld extends JFrame{
	JSpielfeld(String spielfeldname){
		super(spielfeldname);
		setVisible(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel zeichenbrett = new ImagePanel();
		JButton wuerfelButton = new JButton("Würfeln");
		contentPane.add(zeichenbrett, BorderLayout.CENTER);
		contentPane.add(wuerfelButton, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		setSize(1000,1000);
		wuerfelButton.setSize(250, 250);
	}
}
