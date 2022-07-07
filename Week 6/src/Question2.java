import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import javax.swing.*;

public class Question2 {
	
	private static int input;//input for circles

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);//scanner object
		System.out.print("Enter number of circles to generate: ");  
		input = sc.nextInt();//take input
    	
        new Question2();//Run JFrame
    }

    public Question2() {
        EventQueue.invokeLater(new Runnable() {//responsive event handler and run object for JFrame
            @Override
            public void run() {

            	//run jframe
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new Balls());//Ball object added to jframe
                frame.setSize(400, 400);//Frame size
                frame.setVisible(true);
            }
        });
    }

    //Ball JPanel
    public class Balls extends JPanel {
    	
    	//Random method
	    public static int random(int maxRange) {
	        return (int) (Math.round(Math.random() * maxRange));
	    }

	    //Constructor creates ball object * input 
        public Balls() {
            setLayout(null);
            // Randomize the speed and direction...
            for(int i=0; i<input; i++) {
            	add(new Ball(random(9), random(4), random(4)));
            }
        }
    }

    //Ball Class
    public class Ball extends JPanel implements Runnable {

    	//variables for balls
        Color color;
        int diameter;
        long delay;
        private int vx;
        private int vy;

        //constructor takes randomized colour, direction X and direction Y
        public Ball(int ballcolor, int xvelocity, int yvelocity) {
        	
        	switch (ballcolor) {//switch for circle colour selection
			  case 0:
				color = Color.red;
			    break;
			  case 1:
				color = Color.white;
			    break;
			  case 2:
				color = Color.black;
			    break;
			  case 3:
				color = Color.orange;
			    break;
			  case 4:
				color = Color.green;
			    break;
			  case 5:
				color = Color.blue;  
			    break;
			  case 6:
				color = Color.yellow; 
			    break;
			  case 7:
				color = Color.cyan;    
				break;
			  case 8:
				color = Color.pink;   
				break;
			  case 9:
				color = Color.magenta;    
				break;
			}
            diameter = 30;//Ball diameter
            delay = 10;//We can handle speed of balls with this

            vx = xvelocity;//set x direction
            vy = yvelocity;//set y direction

            new Thread(this).start();//start individual thread

        }

        //method to create ball
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int x = getX();
            int y = getY();

            g.setColor(color);
            g.fillOval(0, 0, 30, 30); //adds color to circle
            g.setColor(Color.black);//circle boarder
        }

        //set ball dimensions
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(30, 30);
        }

        //run circle location, movement and thread sleep time
        public void run() {

            try {
                // Randamize the location...
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {
                        int x = (int) (Math.round(Math.random() * getParent().getWidth()));
                        int y = (int) (Math.round(Math.random() * getParent().getHeight()));

                        setLocation(x, y);
                    }
                });
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            } catch (InvocationTargetException exp) {
                exp.printStackTrace();
            }

            while (isVisible()) {
                try {
                    Thread.sleep(delay);//thread sleep (controls ball speed)
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }

                try {
                	//run ball movement and repaint circle
                    SwingUtilities.invokeAndWait(new Runnable() {
                        @Override
                        public void run() {
                            move();
                            repaint();
                        }
                    });
                } catch (InterruptedException exp) {
                    exp.printStackTrace();
                } catch (InvocationTargetException exp) {
                    exp.printStackTrace();
                }
            }
        }

        //move method
        public void move() {

            int x = getX();
            int y = getY();

            if (x + vx < 0 || x + diameter + vx > getParent().getWidth()) {
                vx *= -1;
            }
            if (y + vy < 0 || y + diameter + vy > getParent().getHeight()) {
                vy *= -1;
            }
            x += vx;
            y += vy;

            // Update the size and location...
            setSize(getPreferredSize());
            setLocation(x, y);

        }
    }
}