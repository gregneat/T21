import pkg.*;
public class Tractor extends Vehicle
{
	
	private Rectangle outline;
	private Rectangle roof;
	private Rectangle choose;
	private Rectangle front;
	private Rectangle fixer;
	private Ellipse wheel;
	private Ellipse wheel2;
	private Rectangle wheelHold;
	private double xx;
	public Tractor(double x,double y)
    {
					
				// int x;
				// int y;
				// x=0;
				// y=0;
				
			
				roof = new Rectangle(x+10,y-10,10,30);
				
				choose = new Rectangle(x,y,50,40);
				
				front = new Rectangle(x+45,y,6,35);
				
				
				
				fixer = new Rectangle(x+35,y-10,30,15);
				
				wheel = new Ellipse(x-10 ,y+30 ,20,20);
				
				wheel2 = new Ellipse(x+40 ,y+30 ,20,20);
				
				wheelHold = new Rectangle(x+50,y+40,40,4);
				
				
				
				outline = new Rectangle(x,y-10,90,54);
				
				
				
				
				
	}
	
			public void fill()
			{
				roof.fill();
				choose.setColor(Color.YELLOW);
				choose.fill();
				front.fill();
				front.setColor(Color.DARK_GRAY);
				fixer.setColor(Color.WHITE);
				//fixer.fill();
				wheel.fill();
				wheel2.fill();
				wheelHold.setColor(Color.DARK_GRAY);
				wheelHold.fill();
				outline.draw();
			}
			public double getX()
			{
				return outline.getX();
			}
			public double getY()
			{
				return outline.getY();
			}
			public double getWidth()
			{
				return outline.getWidth();
			}
			public double getHeight()
			{
				return outline.getHeight();
			}
			// public Rectangle getBounds()
			// {
				// return outline;
			// }
			public double getStep()
			{
				return xx;
			}
			// I added the plus to make car game work. Possible fix for future being
			// fix car game then fix this
			public void setStep(double st)
			{
				xx = st;
			}
			
			public boolean contains(Vehicle a)
			{
				if(outline.getX() < a.getX() + a.getWidth() && outline.getX() + outline.getWidth() > a.getX() && outline.getY() < a.getY() + a.getHeight() && outline.getY() + outline.getHeight() > a.getY())
				{ 
					return true;
				}
				return false;
			}
			
			
			public void translate(double xx, double yy)
			{
				roof.translate(xx,yy);
				choose.translate(xx,yy);
				front.translate(xx,yy);
				fixer.translate(xx,yy);
				wheel.translate(xx,yy);
				wheel2.translate(xx,yy);
				wheelHold.translate(xx,yy);
				outline.translate(xx,yy);
			}
			
	public void drive()
	{
		
		if(outline.getX() > 1400)
		
		{
				
				roof.translate(-1550,110);
				choose.translate(-1550,110);
				front.translate(-1550,110);
				fixer.translate(-1550,110);
				wheel.translate(-1550,110);
				wheel2.translate(-1550,110);
				wheelHold.translate(-1550,110);
				outline.translate(-1550,110);
				
		 }
		 if (outline.getY()>=550)
		 {
			roof.translate(0,-550);
				choose.translate(0,-550);
				front.translate(0,-550);
				fixer.translate(0,-550);
				wheel.translate(0,-550);
				wheel2.translate(0,-550);
				wheelHold.translate(0,-550);
				outline.translate(0,-550);
		 }
		 if (outline.getY()<0)
		 {
			roof.translate(0,550);
				choose.translate(0,550);
				front.translate(0,550);
				fixer.translate(0,550);
				wheel.translate(0,550);
				wheel2.translate(0,550);
				wheelHold.translate(0,550);
				outline.translate(0,550);
		 }
		 
		//}
		
	}
	public String toString()
	{
		return("Vehicle of type Tractor is at location (" + outline.getX() +"," + outline.getY() + ") \n");
		
	}
	 
  
}