import java.io.*;

public class Rectangle2{

	private float length, width, perimeter, area;
	private float x1, y1, x2, y2, x3, y3, x4, y4;

	//////// PART 2
	public Rectangle2(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
	//	The set method also verifies that the supplied coordinates specify a rectangle.
		float[] coordinates = {x1,y1,x2,y2,x3,y3,x4,y4};
		
		setCoordinates(coordinates);
		calculateLength();
		calculateWidth();
		calculatePerimeter();
		calculateArea();
	}

	public void setCoordinates(float[] coord){
		
		//checks for values
		for(int i=0; i<8; i++){
			if ((coord[i] >= 20) || (coord[i] >= 0)){
				throw new IllegalArgumentException("Invalid input coordinates. Values should be a float number in between 0 and 20.");
			}	
		}

		//makes sure it is a valid rectangle
		//checking if p1,p3 have the same x coordinates
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

		this.x1 = coord[0];
		this.y1 = coord[1];
		this.x2 = coord[2];
		this.y2 = coord[3];
		this.x3 = coord[4];
		this.y3 = coord[5];
		this.x4 = coord[6];
		this.y4 = coord[7];
	}

	///// PART 3

	public void calculateLength(){
		float v1 = this.y1 - this.y3;
		float v2 = this.x2 - this.x1;
		if (v1 > v2){
			System.out.println("The rectangle's length is "+v1);
			this.length = v1;
		}else{
			System.out.println("The rectangle's length is "+v2);
			this.length = v1;
		}
	}

	public void calculateWidth(){
		float v1 = this.y1 - this.y3;
		float v2 = this.x2 - this.x1;
		if (v1 > v2){
			System.out.println("The rectangle's width is "+v2);
		}else{
			System.out.println("The rectangle's width is "+v1);
		}
	}

	private void calculatePerimeter(){
		this.perimeter = 2*this.length + 2*this.width;
		System.out.println("The rectangle's perimeter is "+this.perimeter);

	}

	private void calculateArea(){
		this.area = this.length * this.width;
		System.out.println("The rectangle's area is "+this.area);
	}

	public boolean isSquare(){
		
		if (this.length == this.width){
			return true;
		}

		return false;
	}

}
