//Week 4 Assignment test

public class PartsWorkerTest {

	public static void main(String[] args) {
		
		//Created Objects
		PartsWorker partsWorker1 = new PartsWorker("Colm", "O'Neill", "555-55-5555", 16.50, 75);
		PartsWorker partsWorker2 = new PartsWorker("Denise", "Kindergan", "666-66-6666", 16, 35);
		PartsWorker partsWorker3 = new PartsWorker("Reg", "Pollock", "777-77-7777", 10, -12);//test for negaive catch
		
		System.out.println("Parts Worker Employees:");//header
		
		//print combined toStrings and earnings
	    System.out.printf( "\n%s\n%s: €%,.2f\n\n", partsWorker1, "earned", partsWorker1.earnings() );
	    System.out.printf( "\n%s\n%s: €%,.2f\n\n", partsWorker2, "earned", partsWorker2.earnings() );
	    System.out.printf( "\n%s\n%s: €%,.2f\n\n", partsWorker3, "earned", partsWorker3.earnings() );

	}

}
