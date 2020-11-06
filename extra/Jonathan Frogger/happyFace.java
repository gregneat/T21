import pkg.*;
public class happyFace
{
	private  Ellipse jo;
	private  Ellipse eyer;
	private  Ellipse eyer2;
	private  Ellipse mouth;
	private  Rectangle screen;
	private double x;
	private double y;
	private  Rectangle test;
	
	public happyFace(double x, double y)
    {
		//x=20
		//y=20
			jo = new Ellipse(x,y,50,50); 
			
			test = new Rectangle(x+5,y+5,40,40); 
			
			  
			 eyer = new Ellipse(x+7.835,y+10.5,12.5,12.5); 
			
			
			 eyer2 = new Ellipse(x+27.8335,y+10.5,12.5,12.5); 
			
			
			 mouth = new Ellipse(x+11.58335,y+15,25,25);
			
			
			 screen = new Rectangle(x+12.3335,y+15,25,12.5);
			
		
	}
	public void fill()
	{
		jo.setColor(Color.YELLOW);
			jo.fill();
			
			//test.draw();
		
		mouth.setColor(Color.WHITE);
			mouth.fill();
		screen.setColor(Color.YELLOW);
			screen.fill();
		eyer.setColor(Color.GREEN);
			eyer.fill();
		eyer2.setColor(Color.MAGENTA);
			eyer2.fill();
	}
	public int getX()
	{
		return test.getX();
	}
	
	public int getY()
	{
		return test.getY();
	}
	public int getHeight()
	{
		return test.getHeight();
	}
	
	public int getWidth()
	{
		return test.getWidth();
	}
	public void translate(double xx, double yy)
	{
		jo.translate(xx,yy);
		eyer.translate(xx,yy);
		eyer2.translate(xx,yy);
		mouth.translate(xx,yy);
		screen.translate(xx,yy);
		test.translate(xx,yy);
	}
	public void grow(double ww, double zz)
	{
		jo.grow(ww,zz);
		eyer.grow(ww,zz);
		eyer2.grow(ww,zz);
		mouth.grow(ww,zz);
		screen.grow(ww,zz);
		test.grow(ww,zz);
	}
	
	public boolean crash(Vehicle a)
	{
		if((test.getX() < a.getX() + a.getWidth()) && (test.getX()+ test.getWidth() > a.getX()) && (test.getY() < a.getY() + a.getHeight()) && (test.getY() + test.getHeight() > a.getY()))
		{ 
			return true;
		}
		return false;
	}
	
}