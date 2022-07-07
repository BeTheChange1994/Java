import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question1 extends JFrame {

	private static final long serialVersionUID = 1L; //ID for serialization
	private Ball panel;//Ball object for JFrame
	
	
	//Constructor
	public Question1() {
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
		panel = new Ball();//Ball Object
		add(panel);//Add ball object to JFrame
		panel.start();//Start ball thread
		
	}
	
	public static void main(String[] args) {
		Question1 application = new Question1();//Create JFrame Object
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//Ball class with runnable thread and JPanel with ball 
	private class Ball extends JPanel implements Runnable{
		private static final long serialVersionUID = 1L;//ID for serialization
		Thread thread = null;//Thread Object 		

		//Method for randomized number generation
	    public static int random(int maxRange) {
	        return (int) (Math.random() * maxRange);
	    }
		
		//variables for ball
		int x = random(350), y = random(350);//Randomized ball location
		int angleX = random(4), angleY = random(4);//Randomized ball direction
		
		//Method to move ball will be called all the time by from main method
		private void move() {
			
			//Check if ball has reached edge and bounce
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
		
		//Start thread 
		public void start() {
			if(thread == null) {
				thread = new Thread(this);
				thread.start();
			}
		}
		
		//Run infinite loop to keep ball moving and repainting
		public void run() {	
			while(true) {
				move();
				repaint();
				try {
					Thread.sleep(5);//Thread sleep can control the ball's velocity
				}catch(InterruptedException e) {
					return;
				}
				
			}
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.fillOval(x, y, 50, 50); //our ball
		}
	}

}