// Convert a file to uppercase
// M Madden, Jan 2004

import java.io.*;
import javax.swing.JOptionPane;

public class Upper
{
   public static void main(String[] args) throws IOException
   {
      String inName = JOptionPane.showInputDialog("Enter input file name");
      String outName = JOptionPane.showInputDialog("Enter output file name");

      int linecount = 0;
      String line;

      // Open the input file (buffered)
      BufferedReader inBuf = new BufferedReader(new FileReader(inName));

      // Open the output file for writing (with print writer)
      PrintWriter outPrint = new PrintWriter(new FileWriter(outName));

      // Read each line from the input file and print it in uppercase
      // Note: readLine() returns null when end of file reached
      while ((line = inBuf.readLine()) != null)
      {
        outPrint.println(line.toUpperCase());
        linecount++;
      }

      // Close the files
      inBuf.close();
      outPrint.close();

      JOptionPane.showMessageDialog(null, "Have written " + linecount +
         " lines to " + outName);

      System.exit(0);
   }
}