import pkg.*;

public class starter implements InputControl, InputKeyControl 
{
		public static AlexCarP6 car;
		public static int x;
		public static int y;

        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			lanes();
			
			x = 0;
			y = 104;
			
			car = new AlexCarP6(x, y);
			
			while(true)
			{
				car.translate(10, 0);
				x += 10;
				car.flash();
				Canvas.pause(100);
				if(x >= 1400)
				{
					car.translate(-1400, 0);
					break;
				}
			}
		}
		
		public void onMouseClick(double x, double y){
			
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
		public static void lanes()
		{
			Rectangle side1 = new Rectangle(0, 0, 1500, 100);
			side1.setColor(Color.GREEN);
			side1.fill();
			
			Rectangle lane1 = new Rectangle(0, 100, 1500, 100);
			lane1.setColor(Color.GRAY);
			lane1.fill();
			
			Rectangle side2 = new Rectangle(0, 200, 1500, 100);
			side2.setColor(Color.GREEN);
			side2.fill();
			
			Rectangle lane2 = new Rectangle(0, 300, 1500, 100);
			lane2.setColor(Color.GRAY);
			lane2.fill();
			
			Rectangle side3 = new Rectangle(0, 400, 1500, 100);
			side3.setColor(Color.GREEN);
			side3.fill();
			
			Rectangle lane3 = new Rectangle(0, 500, 1500, 100);
			lane3.setColor(Color.GRAY);
			lane3.fill();
			
			Rectangle side4 = new Rectangle(0, 600, 1500, 100);
			side4.setColor(Color.GREEN);
			side4.fill();
		}
}
