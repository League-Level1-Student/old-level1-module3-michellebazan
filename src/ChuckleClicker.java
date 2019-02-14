import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	
	
	
public static void main(String[] args) {
	//http://level1.jointheleague.org/Mod4Recipes/ChuckleClicker.html
		ChuckleClicker cl = new ChuckleClicker();
		cl.start();
		
		
	}
private void start() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.setTitle("Chuckle Clicker");
	panel.setVisible(true);
	JLabel label = new JLabel();
	label.setText("test");
	panel.add(label);
	JButton button = new JButton();
	panel.add(button);
	button.setText("joke");
	JButton punch = new JButton();
	panel.add(punch);
	punch.setText("Punchline");
	
	
	frame.pack();
}

}
