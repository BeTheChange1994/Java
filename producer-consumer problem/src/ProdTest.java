public class ProdTest
{
	public static void main(String[] args) 
	{
		// Create the shared storage
		IntBuffer buf = new IntBuffer();

		// Create the producer & consumer threads
		Producer prod = new Producer(buf, 1);
		Consumer cons = new Consumer(buf, 1);

		// Start the threads
		prod.start();
		cons.start();

    javax.swing.JOptionPane.showMessageDialog(null, "Threads started!");
		System.exit(0);
	}
}
