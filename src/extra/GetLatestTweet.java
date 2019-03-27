package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TweetEntity;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {

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
	
	b.addActionListener(this);
	b.setText("Search the Twitterverse");
	
	
	
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	JButton buttonPressed = (JButton) arg0.getSource();
	 if (buttonPressed==b) {
		 
		 System.out.println(getLatestTweet(t.getText()));
	 }
	
}

 private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
          System.err.print(e.getMessage());
          return "What the heck is that?";
    }
}

}
