import java.io.*;
import java.util.Scanner;

public class Part3 {


	public static void main(String[] args) {
		
		//initialize variables and scanner object
		String inputFile;
	    Scanner in = new Scanner( System.in ); 
		
		String data;
	    int lineCount = 0;
	    int characters = 0;
	
	    
	    System.out.println("Input file name: ");
	    inputFile = in.nextLine().trim();//take input, trim trailing spaces

	    try {
	      // create a new file object with user input
	      File file = new File(inputFile);

	      // create an object of Scanner
	      // associated with the file
	      Scanner sc = new Scanner(file);
	      
	      
	      //create buffer stream to count characters
	      FileInputStream fileStream = new FileInputStream(file);
	      InputStreamReader input = new InputStreamReader(fileStream);
	      BufferedReader inBuf = new BufferedReader(input);

	      // read each line and
	      // count number of lines
	      while(sc.hasNextLine()) {
	        sc.nextLine();
	        lineCount++;
	      }
	      
	      //read each line and count characters
	      while((data = inBuf.readLine()) != null) {
	    	  characters += data.replace(" ", "").length();
	      }
	      
	      //print both counts
	      System.out.println("Total Number of Lines: " + lineCount);
	      System.out.println("Total Numebr of characters:" + characters);

	      // close scanners and stream
	      in.close();
	      sc.close();
	      inBuf.close();
	    } 
	    catch (Exception e) {//catch 
	      System.err.println("Error, no file found");
	      System.exit(1);
	    }
	    
	    System.exit(0);//close system successfully 
	}

}
