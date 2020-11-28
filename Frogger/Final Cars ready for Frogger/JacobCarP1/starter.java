import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
		private static Car jc;
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			
			jc = new JacobCarP1(30,130);
			jc.fill();
		
		}
		
		public void onMouseClick(double x, double y)
		{
			
		}
		
		public void keyPress(String s)
		{
				
		}
}
