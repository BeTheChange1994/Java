// Michael Madden, Jan 2005

// This version of IntBuffer WORKS 
// as it synchronizes get() and put() and uses 
// wait() and notify() to pause executing the threads.

public class IntBuffer
{
  private int value;
  private boolean haveValue = false;

  public synchronized int get() {
   if (! haveValue) {
      try {
        System.out.println("get() waiting ... ");
        wait();  // release lock until notify from another thread
      }
      catch (InterruptedException e) { } ;
    }
    haveValue = false;
    takeNap(200); // simulate a long computation
    notifyAll();  // notify any threads waiting on this one to wake up
    return value;
  }

  public synchronized void put(int i) {
   if (haveValue) {
      try {
        System.out.println("put(" + i + ") waiting ... ");
        wait();
      }
      catch (InterruptedException e) { }
    }
    value = i;
    takeNap(200); // simulate a long computation
    haveValue = true;
    notifyAll();
  }

  public void takeNap(int msecs) {
    try {
      Thread.currentThread().sleep(msecs);
    }
    catch (InterruptedException e) {
      javax.swing.JOptionPane.showMessageDialog(null, "Sleep interrupted!");
    }
  }
}
