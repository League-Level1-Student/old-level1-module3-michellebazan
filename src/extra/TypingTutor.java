package extra;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
public static void main(String[] args) {
	//http://level1.jointheleague.org/Mod4Recipes/TypingTutor.html
	TypingTutor tt = new TypingTutor();
	tt.start();

}

char currentLetter;


private void start() {
	currentLetter = generateRandomLetter();
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setTitle("Type or Die");
	JLabel l = new JLabel();
	//l.add(currentLetter);
}

char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}


}
