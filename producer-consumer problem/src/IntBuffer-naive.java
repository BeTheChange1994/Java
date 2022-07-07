// Michael Madden, Jan 2005

// This version of IntBuffer DOES NOT WORK 
// as it does not synchronize between get() and put()

public class IntBuffer
{
  private int value;

  public int get() {
   return value;
  }

  public void put(int i) {
    value = i;
  }
}
