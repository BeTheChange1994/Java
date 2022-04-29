//Week 2 Assignment
//Part two
public class SophisticatedRec {

	//Instance variables
	private double length, width, perimeter, area;
	private double x1, y1, x2, y2, x3, y3, x4, y4;
	
	//Constructor
	public SophisticatedRec(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		
		//Array to hold coordinates
		double[] coordinates = {x1, y1, x2, y2, x3, y3, x4, y4};
		
		//Execute methods
		setCoordinates(coordinates);
		calLength();
		calWidth();
		calPerimeter();
		calArea();
	}
	
	//Set Coordinates 
	public void setCoordinates(double[] coord) {
		
		//Validate the coordinate values for each array element 
		for(int i = 0; i < 8; i++) {
			
			if((coord[i] > 20) || (coord[i] < 0)) {
				throw new IllegalArgumentException("Invalid input coordinates. Values should be between 0 and 20");
			}
		}
		
		//Validate the given values are a Rectangle
		//Assuming that the coordinates are a set order, checking if p1,p3 have the same x coordinates will give us our answer
		if (coord[0] != coord[4]){
			throw new IllegalArgumentException("Invalid input coordinates. Points 1,3 are not on the same longitute.");
		}

		//checking if p2,p4 have the same x coordinates
		if (coord[2] != coord[6]){
			throw new IllegalArgumentException("Invalid input coordinates. Points 2,4 are not on the same longitude.");
		}

		//checking if p1,p2 have the same y coordinates
		if (coord[1] != coord[3]){
			throw new IllegalArgumentException("Invalid input coordinates. Points 1,2 are not on the same height.");
		}

		//checking if p3,p4 have the same y coordinates
		if (coord[5] != coord[7]){
			throw new IllegalArgumentException("Invalid input coordinates. Points 3,4 are not on the same height.");
		}

		//Once validated, assign coordinates to instance variables
		this.x1 = coord[0];
		this.y1 = coord[1];
		this.x2 = coord[2];
		this.y2 = coord[3];
		this.x3 = coord[4];
		this.y3 = coord[5];
		this.x4 = coord[6];
		this.y4 = coord[7];
	}
	
	//Part Three
	
	//Calculate Length
	public void calLength() {
		
		double v1 = this.y1 - this.y3;
		double v2 = this.x1 - this.x2;
		
		if (v1 > v2){
			System.out.println("The rectangle's length is " + v1);
			this.length = v1;
		}else{
			System.out.println("The rectangle's length is " + v2);
			this.length = v2;
		}
	}
	
	//Calculate Width
	public void calWidth(){
		
		double v1 = this.y1 - this.y3;
		double v2 = this.x1 - this.x2;
		
		if (v1 > v2){
			System.out.println("The rectangle's width is " + v2);
			this.width = v2;
		}else{
			System.out.println("The rectangle's width is " + v1);
			this.width = v1;
		}
	}
	
	//Calculate Perimeter
	private void calPerimeter(){
		perimeter = ((2*this.length) + (2*this.width));
		System.out.println("The rectangle's perimeter is " + perimeter);

	}
	
	//Calculate Area
	private void calArea(){
		area = this.length * this.width;
		System.out.println("The rectangle's area is " + area);
	}

	//Evaluate is square
	public boolean isSquare(){
		
		if (this.length == this.width){
			return true;
		}
			
		return false;
		
	}
}
