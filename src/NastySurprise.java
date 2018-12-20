

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
		NastySurprise surprise = new NastySurprise();
		
	surprise.createUI();	
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	JFrame frame2 = new JFrame();
	JButton button2 = new JButton();
	JLabel label = new JLabel(")");
	
	
	public void createUI() {
	panel.add(button2);
	panel.add(button);
	button2.setText("treat :)))");
	button.setText("trick ;)");
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	button.addActionListener(this);
	button2.addActionListener(this);
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed==button) {
			showPictureFromTheInternet("http://en.bcdn.biz/Images/2016/11/15/776342f0-86f5-4522-84c9-a02d6b11c766.jpg");
			
		}else if(buttonPressed==button2){
			
			showPictureFromTheInternet("https://imgix.ranker.com/user_node_img/50063/1001249669/original/spiders-liquefy-their-prey-photo-u1?w=650&q=50&fm=jpg&fit=crop&crop=faces");
			
		}
		
	}

	
}
