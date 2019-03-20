package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet {

public static void main(String[] args) {
	
	GetLatestTweet tweet = new GetLatestTweet();
	tweet.createUI();
	
}


	JButton b = new JButton();
	JTextField t = new JTextField(10);



public void createUI() {
	JFrame j = new JFrame();
	j.setVisible(true);
	JPanel p = new JPanel();
	j.add(p);
	j.setSize(400, 54);
	
	p.add(t);
	p.add(b);
	
	b.setText("Search the Twitterverse");
	///add a action listener to the search button, use calculator if you dont remember
	/// do a new method ^^^
	///http://level1.jointheleague.org/Level1%20Students%20Old.html
}
}
