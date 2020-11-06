//HIDE
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public abstract class Vehicle
{
    public abstract void translate(double x, double y);
	//public abstract void draw();
	public abstract void fill();
	public abstract void drive(); 
	public abstract void setStep(double st); 
	public abstract double getX();
	public abstract double getY();
	public abstract double getHeight();
	public abstract double getWidth();
	public abstract double getStep();
	public abstract boolean contains(Vehicle a);
	public abstract String toString();
	
	
	
}
