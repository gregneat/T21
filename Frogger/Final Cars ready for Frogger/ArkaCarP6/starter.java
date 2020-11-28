import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		public static Car car;
	
	public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			car = new ArkaCarP6(40, 250, 1.0);
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			car.fill();
			
			
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
	       
     		car. translate(10 , 0);
		}
		
		public void keyPress(String s)
		{
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}

