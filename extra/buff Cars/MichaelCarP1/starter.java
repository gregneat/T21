import pkg.*;

public class starter implements InputControl, InputKeyControl {
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		// enter code here
		MichaelMCarP1 bob;
		bob = new MichaelMCarP1(20, 100);
		bob.fill();
		
	}

	public void onMouseClick(double x, double y) {
		
	}

	public void keyPress(String s) {
		// enter code here
	}
}
