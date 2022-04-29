/* CLTest.java: tests the ColouredLight and Light classes
 * Copyright M Madden, 2005.
 */

import javax.swing.JOptionPane;


public class CLTest
{
  public static void main(String args[])
  {
    JOptionPane.showMessageDialog(null, "Testing an ordinary Light object ...");
    Light myLt = new Light();
    myLt.on();
    myLt.brighten();
    myLt.off();

    JOptionPane.showMessageDialog(null, "Testing a Blue ColouredLight object ...");
    ColouredLight myCL = new ColouredLight("BLUE");
    myCL.on();
    myCL.brighten();
    myCL.off();

    System.exit(0);
  }
}
