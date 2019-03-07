package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner {
public static void main(String[] args) {
	CalculatorRunner cal = new CalculatorRunner();
	cal.createUI();
}
public void createUI() {
	JFrame f = new JFrame();
	f.setVisible(true);
	JPanel p = new JPanel();
	
	JTextField t = new JTextField();
	JTextField t2 = new JTextField();
	
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	
	JLabel l = new JLabel();
	
	
	f.add(p);
	p.add(t);
	p.add(t2);
	p.add(b);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	
	b.setText("add");
	b2.setText("sub");
	b3.setText("mul");
	b4.setText("div");
	
	
	
	}
}
