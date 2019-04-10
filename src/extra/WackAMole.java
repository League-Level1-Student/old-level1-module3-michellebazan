package extra;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WackAMole {
    
    public static void main(String[] args) {
    
    WackAMole mole = new WackAMole();
    mole.createUI();
    mole.drawButtons();
    
    }
    
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JButton b10 = new JButton();
    JButton b11 = new JButton();
    JButton b12 = new JButton();
    JButton b13 = new JButton();
    JButton b14 = new JButton();
    JButton b15 = new JButton();
    JButton b16 = new JButton();
    JButton b17 = new JButton();
    JButton b18 = new JButton();
    JButton b19 = new JButton();
    JButton b20 = new JButton();
    JButton b21 = new JButton();
    JButton b22 = new JButton();
    JButton b23 = new JButton();
    JButton b24 = new JButton();
    
    public void createUI () {
        JFrame j = new JFrame("Wack a Button");
        JPanel p = new JPanel();
        j.add(p);
        j.setVisible(true);
        p.setVisible(true);
        j.setSize(120, 125);
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
        p.add(b21);
        p.add(b22);
        p.add(b23);
        p.add(b24);
    }
    
    public void drawButtons() {
    	Random rand = new Random();
    	//http://level1.jointheleague.org/Mod4Recipes/WhackAMole.html
    }
}
