package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {
	
public static void main(String[] args) {
	CalculatorRunner cal = new CalculatorRunner();
	cal.createUI();
	
}



	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JTextField t = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JLabel l = new JLabel();
	
	
	
public void createUI() {
	JFrame f = new JFrame();
	f.setVisible(true);
	
	JPanel p = new JPanel();
	
	f.setSize(300, 300);
	
	
	f.add(p);
	p.add(t);
	p.add(t2);
	p.add(l);
	p.add(b);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	
	b.setText("add");
	b2.setText("sub");
	b3.setText("mul");
	b4.setText("div");
	
	b.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	
	}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	Calculator cal = new Calculator();
	int a = Integer.parseInt(t.getText());
	int c = Integer.parseInt(t2.getText());
	int result = 0;
	if (buttonPressed==b) {
		
		result = cal.add(a,c);
		
	} else if (buttonPressed==b2) {
		
		result = cal.substract(a, c);
		
	} else if (buttonPressed==b3) {
		
		result = cal.multiply(a, c);
		
	} else if (buttonPressed==b4) {
		
		result = cal.divide(a, c);
	}
	
	l.setText(result + "");
}
}
