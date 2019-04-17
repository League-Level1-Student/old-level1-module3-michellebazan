package extra;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackAMole implements ActionListener {
    
    public static void main(String[] args) {
    
    WackAMole mole = new WackAMole();
    mole.createUI();
    
    Random rand = new Random();
    int a = rand.nextInt(24);
    mole.drawButtons(a);
    
    
    }
    
    
    Date date;
      JPanel p = new JPanel();
 JFrame j = new JFrame("Wack a Button");
        
 
    public void createUI () {
        j.add(p);
        j.setVisible(true);
        p.setVisible(true);
        j.setSize(800, 600);    
    }
    
    
    JButton b;
    
    
    public void drawButtons(int number) {
    	date = new Date();
    	for(int i = 0; i < 24; i++) {
    	b = new JButton();
    	b.setSize(40,40);
    	b.setText("    ");
    	b.addActionListener(this);
    	if (i==number) {
    		b.setText("mole");
    	}
    	p.add(b);
       }
    }
    
    
    void speak(String words) {
        try {
             Runtime.getRuntime().exec("say " + words).waitFor();
        } catch (Exception e) {
             e.printStackTrace();
        }
   }
    
    
    int count = 0;
    int countMissed = 0;
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed.getText().equals("    ")) {
			countMissed++;
			//Count how many times they hit something other than the mole! button and change the "missed" comments each time (be nice)
			speak("Be nice");
			j.dispose();
			Random rand = new Random();
		    int a = rand.nextInt(24);
			drawButtons(a);
		} else {
			count++;
			
//			Random rand = new Random();
//		    int a = rand.nextInt(24);
//			drawButtons(a);
		}
		
		if(count==10) {
			endGame(date,count);
		}
		
		if(countMissed==5) {
			speak("You lost");
			endGame(date,countMissed);
		}
		
	}
	
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
    //http://level1.jointheleague.org/Mod4Recipes/WhackAMole.html
}
