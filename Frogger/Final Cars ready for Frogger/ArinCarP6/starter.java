import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
				public static Car car2;
				
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			car2 = new ArinCarP6(100 , 0 , 0.75);
			car2.fill();

		}

		public void onMouseClick(double x, double y){
			car2.translate(10 , 0);
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
