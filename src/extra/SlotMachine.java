package extra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
public static void main(String[] args) {
	
	SlotMachine slotMachine = new SlotMachine();
	slotMachine.createUI();
	
}
JPanel panel = new JPanel();
	JButton spin = new JButton();
	
	JLabel label2 = new JLabel();
	JLabel label = new JLabel();
	JLabel label3 = new JLabel();
	JFrame frame = new JFrame("Slot Machine");
	
public void createUI()  {
	
	panel.setBackground(Color.BLACK.brighter());
	frame.setVisible(true);
	
	spin.setText("Spin");
	panel.add(spin);
		
	try {
		label = createLabelImage("Cherry-512.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	try {
		label2 = createLabelImage("Orange-512.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		label3 = createLabelImage("Watermelon-512.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	spin.addActionListener(this);
		
	label.setPreferredSize(new Dimension (400,400));
	label2.setPreferredSize(new Dimension(400,400));
	label3.setPreferredSize(new Dimension(400,400));
	
	panel.add(label);
	panel.add(label2);
	panel.add(label3);
	frame.add(panel);
	frame.pack();
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
static int wins = 0;
/**
 * https://cdn4.iconfinder.com/data/icons/slot-machines/512/Orange-512.png
 * https://cdn4.iconfinder.com/data/icons/slot-machines/512/Cherry-512.png
 * https://cdn4.iconfinder.com/data/icons/slot-machines/512/Watermelon-512.png
 * http://level1.jointheleague.org/Mod4Recipes/SlotMachine.html
**/
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	Random rand = new Random();
	
	int a = rand.nextInt(3);
	int b = rand.nextInt(3);
	int c = rand.nextInt(3);
	
	panel.remove(label);
	panel.remove(label2);
	panel.remove(label3);
	
	String newImage = "Watermelon-512.png";
	String newImage2 = "Cherry-512.png";
	String newImage3 = "Orange-512.png";
	if (a == 0) {
		newImage = "Cherry-512.png";
	} else if (a == 1) {
		newImage = "Orange-512.png";
	} else if (a == 2) {
		newImage = "Watermelon-512.png";
	}
	
	if (b == 0) {
		newImage2 = "Cherry-512.png";
	} else if (b == 1) {
		newImage2 = "Orange-512.png";
	} else if (b == 2) {
		newImage2 = "Watermelon-512.png";
	}
	
	if (c == 0) {
		newImage3 = "Cherry-512.png";
	} else if (c == 1) {
		newImage3 = "Orange-512.png";
	} else if (c == 2) {
		newImage3 = "Watermelon-512.png";
	}
	
	try {
		label = createLabelImage(newImage);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		label2 = createLabelImage(newImage2);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		label3 = createLabelImage(newImage3);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	label.setPreferredSize(new Dimension (400,400));
	panel.add(label);
	label2.setPreferredSize(new Dimension (400,400));
	panel.add(label2);
	label3.setPreferredSize(new Dimension (400,400));
	panel.add(label3);
	frame.pack();
	
	
	if(newImage.equals(newImage3) && newImage3.equals(newImage2)) {
		wins++;
		JOptionPane.showMessageDialog(panel, "YOU WIN! " + "Your total amount of wins is " + wins);
	}
	
}
}
