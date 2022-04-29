//Week 2 Assignment
//Part One
public class Rectangle {
	
	//Instance variables
	private double length;
	private double width;
	
	//Constructor
	public Rectangle() {
		
		length = 1;
		width = 1;
		
	}
	
	//Calculates perimeter
	public double Perimeter() {
		
		return (length*2) + (width*2);
		
	}
	
	//Caculates Area
	public double Area() {
		
		return length * width;
		
	}
	
	//Validate value range and set values
	public void setRec(double length, double width) {
		
		if((length > 20) || (length < 0)) {
			throw new IllegalArgumentException("Error, Length must be between 0-20");
		}
		if((width > 20) || (width < 0)) {
			throw new IllegalArgumentException("Error, Width must be between 0-20");
		}
		
		this.length = length;
		this.width = width;
		
	}
	
	//Get length
	public double getLength() {
		return length;
	}
	
	//Get Width
	public double getWidth() {
		return width;
	}

}