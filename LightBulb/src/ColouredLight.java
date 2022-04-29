
public class ColouredLight extends Light {
	
	private String colour;
	
	public ColouredLight(String o) {
		
		colour = o;
		
	}
	
	public String toString() {
		return "Colour is " + colour + ", " + super.toString();
	}

}
