//HIDE
package pkg;

/**
 * example code creates a car that is filled blue 
 * takes in the x array which is the x cordinate of the points 
 * takes in the y array which is the y cordinate of the points 
 * takes in nsides which is the number of sides that the polygon 
 * has cannot be bigger then the side of the array 
 * int[] x = { -10, -6, -3, 3, 6, 9, 9, 5, 4, 2, -2, -4, -5, -10 };
 * int[] y = { -6, -6, -9, -9, -6, -6, -2, -2, 0, -2, -2, 0, -2, -2 };
 * int sides= 14
 * Polygon p = new Polygon(x, y, 14);
 * p.setColor(Color.BLUE);
 * p.draw();
 * p.fill();
 * also incluses 
 * contains(Rectangle r);
 * translate(dx,dy);
 * 
 * 
 * 
 */
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Polygon implements Shape {
    private Color color = Color.BLACK;
    private boolean filled = false;

    private java.awt.Polygon poly;

    /**
     * Constructs an empty Polygon.
     */
    public Polygon() {

        poly = new java.awt.Polygon();
    }

    /**
     * Constructs a Polygon.
     * 
     * @param xPoints the xPoints of the poly gon
     * @param yPoints the yPoints of the polygon
     * @param nSides  the sides of the polygon
     */
    public Polygon(int[] xPoints, int[] yPoints, int nSides) {

        poly = new java.awt.Polygon(xPoints, yPoints, nSides);

    }

    /**
     * Gets the leftmost x-position of this rectangle.
     * 
     * @return the leftmost x-position
     */
    public int getX() {

        return (int) poly.getBounds().getX();
    }

    /**
     * Gets the topmost y-position of this rectangle.
     * 
     * @return the topmost y-position
     */
    public int getY() {
        return (int) poly.getBounds().getY();
    }

    /**
     * Gets the width of this rectangle.
     * 
     * @return the width
     */
    public int getWidth() {
        return (int) poly.getBounds().getWidth();
    }

    /**
     * Gets the height of this rectangle.
     * 
     * @return the height
     */
    public int getHeight() {
        return (int) poly.getBounds().getHeight();
    }

    /**
     * Moves this rectangle by a given amount.
     * 
     * @param dx the amount by which to move in x-direction
     * @param dy the amount by which to move in y-direction
     */
    public void translate(double dx, double dy) {
        poly.translate((int) dx, (int) dy);

        Canvas.getInstance().repaint();
    }

    /**
     * Resizes this rectangle both horizontally and vertically.
     * 
     * @param dw the amount by which to resize the width on each side
     * @param dw the amount by which to resize the height on each side
     */
    public void grow(double dw, double dh) {
        // not applicable
    }

    /**
     * Sets the color of this rectangle.
     * 
     * @param newColor the new color
     */
    public void setColor(Color newColor) {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    /**
     * Draws this rectangle.
     */
    public void draw() {
        filled = false;
        Canvas.getInstance().show(this);
    }

    /**
     * Fills this rectangle.
     */
    public void fill() {
        filled = true;
        Canvas.getInstance().show(this);
    }

    public String toString() {
        return poly.toString();
    }

    public void paintShape(Graphics2D g2) {

        g2.setColor(new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue()));
        if (filled) {
            g2.fill(poly);
        } else {
            g2.draw(poly);
        }
    }
    // added by Neato 10/21/18

    public boolean contains(Rectangle a) {
        return poly.contains(new java.awt.geom.Rectangle2D.Double(a.getX(), a.getY(), a.getWidth(), a.getHeight()));
    }
}
