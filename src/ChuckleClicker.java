//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	
public static void main(String[] args) {
	//http://level1.jointheleague.org/Mod4Recipes/ChuckleClicker.html
		ChuckleClicker cl = new ChuckleClicker();
		
		cl.makeButtons();
		
	}
JButton joke = new JButton();
JButton punch = new JButton();
private void makeButtons() {
	//JOptionPane.showMessageDialog(null,"makeButtons");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.setTitle("Chuckle Clicker");
	panel.setVisible(true);
	
	
	panel.add(joke);
	joke.setText("joke");
	
	panel.add(punch);
	punch.setText("Punchline");
	
punch.addActionListener(this);
	joke.addActionListener(this);
	
	frame.pack();
}





public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");
	JButton buttonPressed1 = (JButton) e.getSource();
	if (buttonPressed1==joke) {
		System.out.println("What kind of shoes do ninjas wear?");
		
	} else if (buttonPressed1==punch) {
		System.out.println("sneakers");
	}
}

}
