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
   
    Random rand = new Random();
    int a = rand.nextInt(24);
    mole.drawButtons(a);
    date = new Date();
    
    }
    
    
      static Date date;
      JPanel p = new JPanel();
      JFrame j = new JFrame("Wack a Button");
      
 
   
    
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
    	j.add(p);
        j.setVisible(true);
        p.setVisible(true);
        j.setSize(800, 600);  
    }
    
    
    void speak(String words) {
        try {
             Runtime.getRuntime().exec("say " + words).waitFor();
        } catch (Exception e) {
             e.printStackTrace();
        }
   }
    
    
    static int count = 0;
    static int countMissed = 0;
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		
		if(buttonPressed.getText().equals("    ")) {
			countMissed++;
			//Count how many times they hit something other than the mole! button and change the "missed" comments each time (be nice)
			speak("Be nice");
			
			
		} else {
			count++;
			

		}
		
		j.dispose();
			Random rand = new Random();
		    int a = rand.nextInt(24);
		    WackAMole mole = new WackAMole();
		    mole.drawButtons(a);
		System.out.println(count);
		if(count==10) {
			endGame(date,count);
		}
		
		if(countMissed==5) {
			speak("You lost");
			endGame(date,countMissed);

		}
				
		/*
		switch(countMissed) {
		case 1:
			speak("Be Nice1");
			break;
		case 2:
			speak("Be Nice2");
			break;
		case 3:
			speak("Be Nice3");
			break;
		case 4:
			speak("Be Nice4");
			break;
		case 5:
			speak("You lose");
			break;
		
		}
		It works until you hit mole then the regular button. I do not have the knowledge to fix it. 
		*/
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
