//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Coordinate {
	public double dx;
	public double dy;
	
	public int ix;
	public int iy;
	
	
	// Doubles
	public Coordinate(double x, double y) {
		dx = x;
		dy = y;
	}
	
	public double doubleX() {
		return dx;
	}
	
	public double doubleY() {
		return dy;
	}
	
	
	// Ints
	public Coordinate(int x, int y) {
		ix = x;
		iy = y;
	}
	
	public int intX() {
		return ix;
	}
	
	public int intY() {
		return iy;
	}
	
	public void print() {
		System.out.println("(" + intX() + ", " + intY() + ")");
	}
		
}