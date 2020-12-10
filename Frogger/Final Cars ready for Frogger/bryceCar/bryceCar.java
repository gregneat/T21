import pkg.*;

public class bryceCar extends Car
{
	private Rectangle Robbie;
	private Rectangle Impa;
	private Ellipse Paya;
	private Ellipse Purah;
	private Text Skool;
	private Rectangle outline;

	public  bryceCar(double x, double y)
	{
		Robbie= new Rectangle(50,30,150,90);
		Impa= new Rectangle (x+150, y+30,60,60);
		Paya = new Ellipse(x+30,y+65,40,40);
		Purah = new Ellipse(x+160,y+65,40,40);
		Skool= new Text(x+80,y+25,"Skool");
		outline = new Rectangle(x, y, 150, 105);
		
	}

	public void draw()
	{
		Robbie.draw();
		Impa.draw();
		Paya.draw();
		Purah.draw();
		Skool.draw();
		Skool.grow(40,22);
	}

	public void fill()
	{
		Robbie.setColor(Color.YELLOW);
		Robbie.fill();
		Impa.fill();
		Impa.setColor(Color.YELLOW);
		Paya.fill();
		Purah.fill();
		Skool.draw();
		Skool.setColor(Color.WHITE);
		Skool.grow(40,22);
	}
	
	public void translate(double x, double y)
	{
		Robbie.translate(x, y);
		Impa.translate(x, y);
		Paya.translate(x, y);
		Purah.translate(x, y);
		Skool.translate(x, y);
		outline.translate(x, y);
	}
	
	public double getX()
	{
		return outline.getX();
	}
	
	public double getY()
	{
		return outline.getY();
	}
	
	public double getHeight()
	{
		return outline.getHeight();
	}
	
	public double getWidth()
	{
		return outline.getWidth();
	}
	
	public Rectangle getBoundBox()
	{
		return outline;
	}
	
	public boolean getCrash(Rectangle m)
	{
		if(m.contains(outline)||m.contains(Impa))
		{
			return false;
		}
		
		else
		{
			return true;
		}
	}
	
}