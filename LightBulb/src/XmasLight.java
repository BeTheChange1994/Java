// Michael Madden, Feb 2001
// Red Christmas Tree Lights


public class XmasLight
{
  // Array of coloured lights
  private ColouredLight[] lights;

  // Constructor
  public XmasLight(int numLights)
  {
    lights = new ColouredLight[numLights];

    for (int i=0; i < numLights; i++)
    {
      lights[i] = new ColouredLight("red");
    }
  }

  // Turn on every second light
  public void twinkle()
  {
    for (int j=0; j < lights.length; j++)
    {
      if (j % 2 == 0)
        lights[j].on();
      else
        lights[j].off();
    }
  }
}

