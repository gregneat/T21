import pkg.*;
public class starter implements InputControl, InputKeyControl 
{
		
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			// put code here
			
			Rectangle r;
			r = new Rectangle(50,50,50,100);
			r.draw();
			
			while(true)
			{
				r.translate(1,0);
				Canvas.pause(10);
				if(r.getX() > 500)
				{
					r.translate(-500,0);
				}
			}
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			
			
	
		}
		
		public void keyPress(String s)
		{
			
	
		}

}
