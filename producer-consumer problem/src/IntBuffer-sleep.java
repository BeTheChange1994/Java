// Michael Madden, Jan 2005

// This version of IntBuffer DOES NOT WORK
// as threads may be interrupted at any time.

public class IntBuffer
{
  private int value;
  private boolean haveValue = false;

  public int get() {
    while (! haveValue) {  // wait a while for other thread to call put()
      System.out.println("get() sleeping ...");
      takeNap(100);
    }
    haveValue = false;
    takeNap(200); // simulate a long computation
    return value;
  }

  public void put(int i) {
    while (haveValue) {  // wait a while for other thread to call get()
      System.out.println("put(" + i + ") sleeping ...");
      takeNap(100);
    }
    value = i;
    takeNap(200); // simulate a long computation
    haveValue = true;
  }

  public void takeNap(int msecs) {
    try {
      Thread.sleep(msecs);
    }
    catch (InterruptedException e) {
      javax.swing.JOptionPane.showMessageDialog(null, "Sleep interrupted!");
    }
  }
}
