import java.awt.*;
import javax.swing.*;

public class Animate extends JFrame {
	private static final long serialVersionUID = 1L;
	private MessagePanel panel;
	// constructor code
	public Animate() {
		setPreferredSize(new Dimension(600, 200));
		setLocationRelativeTo(null);
		setVisible(true);
		panel = new MessagePanel(this.getPreferredSize());
		add(panel);
		pack();
		panel.start();
	}
	
	public static void main(String args[]) {
		Animate application = new Animate();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	} // end main
	
	private class MessagePanel extends JPanel implements Runnable {
		private static final long serialVersionUID = 1L;
		Thread messageThread = null;
		String message = "I hate Frappuccinos but I LOVE Java!";
		Font font = new Font("TimesRoman", Font.BOLD, 24);
		int x, y;
		Dimension size; 
		
		public MessagePanel(Dimension size) {
			x = size.width; 		// initial x position = right side of display
			y = size.height / 2;	// y position = middle of display
			this.size = size;
		}
						
		// Create and start the animating thread.
		public void start() {
			if (messageThread == null) {
				messageThread = new Thread(this);
				messageThread.start();
			}
		}
		
		// Specify actual processing the thread will perform
		public void run() {
			while (true) {	// infinite loop
				// move the horizontal start position
				x = x-5;
				if (x == 0)
					x = this.size.width;
				repaint();
				
				try {
					Thread.sleep(100);
				}
				catch (InterruptedException e) {
					return; // silently exit
				}
			}
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(font);
			g.drawString(message, x, y);
		}
	}
}