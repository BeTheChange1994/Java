// Number convert & divide with exception handling
// Michael Madden, March 2005

import javax.swing.JOptionPane;

public class DivZero
{
  public static void main(String[] args)
  {
    int x, y;

    // Get the user to enter two numbers (as strings)
    // Convert to ints, calculate x/y
    // Runtime exceptions if inputs are not actually ints, or y=0
    try {
      x = Integer.parseInt(JOptionPane.showInputDialog("Enter x (integer)"));
      y = Integer.parseInt(JOptionPane.showInputDialog("Enter y (integer)"));

      JOptionPane.showMessageDialog(null, "x/y = " + x/y);
    }
    catch (NumberFormatException e1)  {
      JOptionPane.showMessageDialog(null, "Number format error: Both numbers must be ints!");
    }
    catch (ArithmeticException e2)  {
      JOptionPane.showMessageDialog(null, "Arithmetic error: y must not be zero!");
    }
   
    System.exit(0);
  }
}

