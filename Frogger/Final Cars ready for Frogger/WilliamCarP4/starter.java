import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		private static Car wc;
			
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		
		
			wc = new WilliamCarP4(300,30);
			wc.fill();
			
		}
		
		public void onMouseClick(double x, double y)
		{
			// and/or here
		
		}

				
		
		public void keyPress(String s)
		{
			
		}
}
