package extra;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
public static void main(String[] args) {
	//http://level1.jointheleague.org/Mod4Recipes/TypingTutor.html
	TypingTutor tt = new TypingTutor();
	tt.start();
	
}

char currentLetter;
JFrame f = new JFrame();
JLabel la = new JLabel();
JPanel p = new JPanel();

private void start() {
	currentLetter = generateRandomLetter();
	
	f.setVisible(true);
	f.setTitle("Type or Die");
	f.setSize(500,500);
	
	p.setVisible(true);
	
	f.add(p);
	
	
	la.setVisible(true);
	p.add(la);
	la.setText(currentLetter + "");
	la.setFont(la.getFont().deriveFont(28.0f));
	la.setHorizontalAlignment(JLabel.CENTER);
	la.setVerticalAlignment(JLabel.CENTER);
	
	f.addKeyListener(this);
	
	
}



char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if (e.getKeyChar() == currentLetter) {
		System.out.println("correct");
		p.setBackground(Color.green);
	} else {
		p.setBackground(Color.red);
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	
	la.setText(currentLetter + "");
	
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}
