import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JPanel {
	
	//variables for ball
	int x = 0, y = 0;
	int angleX = 1, angleY = 1;
	
	//Method to move ball will be called all the time by from main method
	private void move() {
		if(x + angleX < 0) {
			angleX = 1;
		}else if(x + angleX > getWidth() - 50) {
			angleX = -1;
		}else if(y + angleY < 0) {
			angleY = 1;
		}else if(y + angleY > getHeight() - 50) {
			angleY = -1;
		}
		
		x = x + angleX;
		y = y + angleY;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 50, 50); //our ball
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Ball");
		App app = new App();
		frame.add(app);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			app.move();
			app.repaint();
			Thread.sleep(10);
		}
	}

}
