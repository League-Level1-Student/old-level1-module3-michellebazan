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
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
public static void main(String[] args) {
	
	SlotMachine slotMachine = new SlotMachine();
	slotMachine.createUI();
	
}
JPanel panel = new JPanel();
	JButton spin = new JButton();
	
	JLabel label2 = new JLabel();
	JLabel label = new JLabel("");
	JLabel label3 = new JLabel("");
	
public void createUI()  {
	JFrame frame = new JFrame("Slot Machine");
	
	
	
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
///https://cdn4.iconfinder.com/data/icons/slot-machines/512/Orange-512.png
///https://cdn4.iconfinder.com/data/icons/slot-machines/512/Cherry-512.png
///https://cdn4.iconfinder.com/data/icons/slot-machines/512/Watermelon-512.png
///http://level1.jointheleague.org/Mod4Recipes/SlotMachine.html

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	Random rand = new Random();
	
	int a = rand.nextInt(2);
	
	panel.remove(label);
	String newImage = "Watermelon-512.png";
	if (a == 0) {
		newImage = "Cherry-512.png";
	} else if (a == 1) {
		newImage = "Orange-512.png";
	} else if (a == 2) {
		newImage = "Watermelon-512.png";
	}
	
	JLabel label0 = new JLabel();
	try {
		label0 = createLabelImage(newImage);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	label0.setPreferredSize(new Dimension (100,100));
	panel.add(label0);
	
	
}
}
