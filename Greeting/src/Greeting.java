import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Greeting extends JFrame{
	public Greeting() {
		setTitle("ภฮป็");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		this.setLayout(new FlowLayout());
		JLabel label = new JLabel("");
		if(hour < 12) {
			label.setText("Good Morning");
		}
		else if (hour>=12 & hour<=18) {
			label.setText("Good Afternoon");
			}
		else if (hour>=18) {
			label.setText("Good Evening");
		}
		else {
			label.setText("Good Night");
		}
	
		this.add(label);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Greeting();
	}
}