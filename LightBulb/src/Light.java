/* Light.java: implements lightbulb class
 * Copyright M Madden, 2005.
 */

import javax.swing.JOptionPane;

public class Light
{
  private boolean isOn;
  private float   brightness; // range 0 - 1

  public Light() {
	     isOn = false;
	     brightness = 0.5F;
	     JOptionPane.showMessageDialog(null, "New Light object created.");
  }

  public void on() {
    isOn = true;
    showStatus();
  }

  public void off() {
    isOn = false;
    showStatus();
  }

  public void brighten() {
    brightness += 0.1;
    if (brightness > 1)
      brightness = 1;

    showStatus();
  }

  public void dim() {
    brightness -= 0.1;
    if (brightness < 0)
      brightness = 0;

    showStatus();
  }

  private void showStatus() {
    JOptionPane.showMessageDialog(null, toString());
  }

  public String toString()
  {
    /* toString() is a method of class Object, which is often over-ridden 
	 * to return an appropriate string representation for the specific class */
    String status;

    if (! isOn)
      status = "Light is OFF";
    else
      status = "Light is ON, brightness is " + brightness;

    return status;
  }
}
