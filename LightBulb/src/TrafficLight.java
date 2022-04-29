// Traffic Light: M Madden Nov 2005

public class TrafficLight {
	// references to individual lights
	private ColouredLight green;
	private ColouredLight amber;
	private ColouredLight red;
	
	// Need constructor to create objects for the refs
	public TrafficLight() {
		green = new ColouredLight("GREEN");
		amber = new ColouredLight("AMBER");
		red   = new ColouredLight("RED");
	}
	
	public void stop() {
		green.off();
		amber.off();
		red.on();
	}
	
	public void go() {
		green.on();
		amber.off();
		red.off();
	}
	
	public void caution() {
		green.off();
		amber.on();
		red.off();
	}
}
