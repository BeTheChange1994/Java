import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		//Part One
		//Create Rectangle object
		Rectangle Rec1 = new Rectangle();
		
		System.out.print("Initial Rectangle values: ");
		System.out.printf("%n%nThe perimeter of the rectangle: %.2f", Rec1.Perimeter());
		System.out.printf("%nThe Area of the Rectangle: %.2f", Rec1.Area());
		
		//Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Take length and width from user
		System.out.printf("%n%nEnter the Length of the Rectangle: ");
		double recLength = input.nextDouble();
		System.out.printf("%nEnter the Width of the Rectangle: ");
		double recWidth = input.nextDouble();
		
		//Set Rectangle method with values
		Rec1.setRec(recLength, recWidth);
		
		//Print values
		System.out.printf("%nRectangle entered %n");
		System.out.printf("%nRectangle Length: %.2f", Rec1.getLength());
		System.out.printf("%nRectangle Width: %.2f", Rec1.getWidth());
		System.out.printf("%nPerimeter of the Rectangle: %.2f", Rec1.Perimeter());
		System.out.printf("%nArea of the Rectangel: %.2f", Rec1.Area());
		
		System.out.printf("%n%n");//spacing
		
		//Part 2 and 3
		System.out.printf("%nSecond Rectangle: %n");
		SophisticatedRec Rec2 = new SophisticatedRec(4, 4, 1, 4, 4, 1, 1, 1);//Create Rectangle object with values (This is a square)
		System.out.println(Rec2.isSquare()? "Is a square":"Is not a square");
		System.out.printf("%nThird Rectangle: %n");
		SophisticatedRec Rec3 = new SophisticatedRec(15, 6, 4, 6, 15, 0, 4, 0);//Create another Rectangle with values (This is not a square)
		System.out.println(Rec3.isSquare()? "Is a square":"Is not a square");
		//SophisticatedRec Rec4 = new SophisticatedRec(24, 0, 16, 2, 3, 2, 6, 7); //Should be caught by out of range
		//SophisticatedRec Rec5 = new SophisticatedRec(16, 2, 7, 3, 4, 5, 7, 8);////Should be caught by not Rectangle
		
		
		
		
		
		

	}

}
