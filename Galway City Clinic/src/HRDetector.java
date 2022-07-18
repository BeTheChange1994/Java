import java.io.*;

//HRDetector class
public class HRDetector {
	
	//initialize variables
	private static int maxNum;
	private static int intArray[];
	private static int i = 0;
	private static boolean flag = false;
	
	//constructor take max range of array
	public HRDetector(int maxNum){
		
		this.maxNum = maxNum;
		
		intArray = new int[this.maxNum];//create new array
	}
	
	//add to array until full
	public static boolean addX(int hrReadings) {
		
		if(i <= maxNum) {//add to array at i position
			intArray[i] = hrReadings;
			
			i++;//increment i
		}else {
			flag = true;
		}
		
		return flag;//return true if array is full
		
	}
	
	//get index of array element given
	public int getIndex(int index) {
		
		return intArray[index];
	}
	
	//sum array
	public int sum() {
		
		int sum = 0;
		
		for(int j = 0; j < maxNum; j++) {
			sum = sum + intArray[j]; 
		}
		
		return sum;
	}
	
	//compare two arrays
	public boolean pass(int[] array) {
		
		boolean flag = true;//flag to catch false compares
		
		if(array.length == intArray.length) {//check if arrays are the same length 
			
			for(int i = 0; i <= array.length; i++) {//loop through array
				
				if(intArray[i] <= array[i]) {//check if each element is less then or equal to given array
					flag = true;//flag true if good compare
				}else {
					flag = false;//flag false if bad compare
				}
				
			}
			
		}else {
			return false;//if not equal length
		}
		
		return flag;
	}
	
	//write array to file given as argument
	public void recordHRStats(String inputFile) throws IOException {
		
		//buffer reader object
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(inputFile));
		
		//loop through array
		for(int y = 0; y < intArray.length; y++) {
		  
			outputWriter.write(intArray[y] + " ");//write to file with space
			
		}
		
		outputWriter.close();//close the buffer file reader
		
	}
	
	public void loadHRStats(String inputFile) {
		
	}
	
	//toString method returns array
	@Override
	public String toString() {
		
		for(int x = 0; x < maxNum; x++) {
			String.format("\nValue at index: %d is %d", x, intArray[x]);
		}
		
		return String.format("\nArray printed\n");
	}
}
