package extra;

import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	
public static void main(String[] args) {
	SlotMachine slotMachine = new SlotMachine();
	slotMachine.createUI();
	
}


public void createUI() {
	JFrame frame = new JFrame("Slot Machine");
	JPanel panel = new JPanel();
	frame.add(panel);
	
	panel.setBackground(Color.BLACK.brighter());
	frame.setVisible(true);
	
	JButton spin = new JButton();
	JLabel label = new JLabel("Spin");
	
	spin.add(label);
}
 
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
///https://cdn4.iconfinder.com/data/icons/slot-machines/512/Orange-512.png
///https://cdn4.iconfinder.com/data/icons/slot-machines/512/Cherry-512.png			 ask how to add images
///https://cdn4.iconfinder.com/data/icons/slot-machines/512/Watermelon-512.png
}
