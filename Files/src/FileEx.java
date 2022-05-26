// File test with exception handling
// Michael Madden, March 2001

import java.io.*;
import javax.swing.JOptionPane;

public class FileEx
{
  // Note: this main() not declared to throw IOException,
  // because it is handled within the code instead
  public static void main(String[] args)
  {
    String s;
    int i = 0;

    // Try to open and display a file.
    // If things go wrong, inform the user.

    try {
      // FileInputStream constructor can throw FileNotFoundException.
      // InputStreamReader and BufferedReader constructors,
      // and BufferedReader.readLine() can all throw IOExceptions.

      FileInputStream inStream = new FileInputStream("test.txt");

      InputStreamReader inReader = new InputStreamReader(inStream);
      BufferedReader inBuf = new BufferedReader(inReader);

      while ((s = inBuf.readLine()) != null)
         System.out.println("Line " + (++i) + ": " + s);

      inBuf.close();
    }
    catch (FileNotFoundException f) {
      JOptionPane.showMessageDialog(null,
        "The file to be opened cannot be found. Details: \n" + f);
    }
    catch (IOException e) {
      JOptionPane.showMessageDialog(null,
        "An error has occurred reading the file. Details:\n" + e);
    }

    JOptionPane.showMessageDialog(null, "Finished file display.");
    System.exit(0);
  }
}

