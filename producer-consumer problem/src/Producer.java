public class Producer extends Thread {
    private IntBuffer buffer;
    private int number, total;

    public Producer(IntBuffer c, int num) {
    	buffer = c;
        number = num;
        total = 0;
    }

    public void run()
    {
       for (int i = 0; i < 10; i++) {
    	   buffer.put(i);
          System.out.println("Producer #" + number + " put: " + i);
          total += i;

          try {
              sleep((int)(Math.random() * 500));
          } catch (InterruptedException e) { }
       }
       System.out.println("Total put by Producer " + number + " = " + total);
     }
  }
