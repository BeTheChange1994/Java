import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import javax.swing.*;

public class Question3 {

    public static void main(String[] args) {
        new Question3();
    }

    public Question3() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {


                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new Balls());
                frame.setSize(400, 250);
                frame.setVisible(true);

            }
        });
    }

    public class Balls extends JPanel {
    	
	    public static int random(int maxRange) {
	        return (int) (Math.round(Math.random() * maxRange));
	    }

        public Balls() {
            setLayout(null);
            
            Ball ball1 = new Ball(0, 10, 0);
            ball1.setLocation(0, 75);
            
            Ball ball2 = new Ball(5, -10, 0);
            ball2.setLocation(350, 75);
            
            add(ball1);
            
            add(ball2);
            
            
        }
    }

    public class Ball extends JPanel implements Runnable {

        Color color;
        int diameter;
        long delay;
        private int vx;
        private int vy;

        public Ball(int ballcolor, int xvelocity, int yvelocity) {
        	
        	switch (ballcolor) {
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
            diameter = 30;
            delay = 100;

            vx = xvelocity;
            vy = yvelocity;

            new Thread(this).start();

        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            int x = getX();
            int y = getY();

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(color);
            g.fillOval(0, 0, 30, 30); //adds color to circle
            g.setColor(Color.black);
            g2.drawOval(0, 0, 30, 30); //draws circle
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(30, 30);
        }

        public void run() {

            while (isVisible()) {
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }

                try {
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