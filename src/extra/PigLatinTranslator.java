package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	
	public static void main(String[] args) {
		
	PigLatinTranslator pig = new PigLatinTranslator();
	pig.createUI();

	
	}
	
	PigLatinTranslatorOther pi = new PigLatinTranslatorOther();
	
	JTextField t = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JButton b = new JButton("translate");
	
	public void createUI() {
		
		JFrame j = new JFrame("Pig Latin Translator");
		JPanel p = new JPanel();
		
		j.setVisible(true);
		j.setSize(400, 100);
		j.add(p);
		
		p.add(t);
		p.add(b);
		p.add(t2);
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		t2.setText(pi.translate(t.getText()));
		
		
	}
     
     //http://level1.jointheleague.org/Mod4Recipes/PigLatin.html
     
}
