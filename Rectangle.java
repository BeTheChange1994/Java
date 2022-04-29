import java.io.*;

public class Rectangle{

	private float length;
	private float width;
	private float x1, y1, x2, y2, x3, y3, x4, y4;


	public void setLength (float length){

		if ((length >= 20) || (length <= 0)){
			System.out.println("Error on the input value. Length should be a float number in between 0 and 20. You have entered "+length);
			return;
		} 

		this.length = length;
	}

	public float getLength (){
		return this.length;
	}

	public void setWidth (float width){

		if ((width >= 20) || (width <= 0)){
			System.out.println("Error on the input value. Width should be a float number in between 0 and 20. You have entered "+width);
			return;
		} 

		this.width = width;
	}

	public float getWidth (){
		return this.width;
	}
}
