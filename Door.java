package lab3;

public class Door {
	//instance variables
	private String name;
	private float doorknob;
	private boolean state;
	
	// constructor
	public Door(boolean state, String name) {
		this.name =name;
		this.state = state;
		this.doorknob =0;
	}
	// if the door is closed, set it to open
	public void open() {
		if (state == false) {
			state = true;
		}
	}
	
	
	public void close() {
		if (state == true) {
			state = false;
		}
	}
	// accessor method
	public boolean isOpen() {
		return state;
	}
}
