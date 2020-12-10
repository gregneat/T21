import pkg.*;

public class starter implements InputControl, InputKeyControl {
	
	private static Car fred;
			
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());

		fred = new bryceCar(20,30);
		fred.fill();
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here
		
	}

	
}
