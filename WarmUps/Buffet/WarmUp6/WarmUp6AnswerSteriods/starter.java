import pkg.*;

public class starter implements InputControl, InputKeyControl {
	static int ex;
	static int why;
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Text mess = new Text(20,20,"Click the mouse repeatedly");
		mess.grow(10,10);
		mess.draw();
		ex = 0;
		why = 0;
		// enter code here

	}

	public void onMouseClick(double x, double y) {
		// enter code here
		int oGX;
		int oGY;
		oGX = 3;
		oGY = -202;
		for(int i=0; i < 10; i++)
		{
			ex = (int)(Math.random()*700);
			why = (int)(Math.random()*700); 
			int gX1 = oGX+ex;
			int gY1 = oGY+why;
			int gX2 = oGX-100 + ex;
			int gY2 = oGY+200 + why;
			int yellX1 = oGX+100 + ex;
			int yellY1 = oGY+200 + why;
			Line green = new Line(gX1,gY1,gX2,gY2);
			green.draw();
			green.setColor(Color.GREEN);
			Line yell = new Line(gX1,gY1,yellX1,yellY1);
			yell.draw();
			yell.setColor(Color.YELLOW);
			Line blu = new Line(gX2,gY2,yellX1,yellY1);
			blu.draw();
			blu.setColor(Color.BLUE);
		}
	}

	public void keyPress(String s) {
		// enter code here

	}
}
