/* LightTest.java: tests the Light class
 * M Madden, Oct 2000.
 */

public class LightTest
{
  public static void main(String[] args)
  {
    Light myLt = new Light();
    
    myLt.on();
    myLt.brighten();
    myLt.off();
    myLt.on();
    myLt.dim();
    myLt.dim();
    
    Light lt2 = new Light();
    lt2.on();
    
    // test that the brightness cannot exceed 1
    for(int i=0; i<9; i++)
      lt2.brighten();
    
    System.exit(0);
  }
}
