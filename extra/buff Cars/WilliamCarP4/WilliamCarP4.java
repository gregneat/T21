import pkg.*;
// helped by Neato 9/20/19
public class WilliamCarP4 extends Car
{
		private Rectangle Cab = new Rectangle(200,50,50,100);
		private Rectangle Box = new Rectangle(10,50,180,100);
		private Rectangle Rod = new Rectangle(180,125,30,10);
		private Rectangle Eng = new Rectangle(250,100,50,50);
		private Ellipse Mwhl = new Ellipse(130, 130 ,50, 50);
		private Ellipse Rwhl = new Ellipse(20, 130 ,50, 50);
		private Ellipse Fwhl = new Ellipse(230, 130 ,50, 50);
		private Ellipse Win = new Ellipse(200, 55, 75, 90);
		private Ellipse Dot1 = new Ellipse(30, 140 ,30, 30);
		private Ellipse Dot2 = new Ellipse(140, 140 ,30, 30);
		private Ellipse Dot3 = new Ellipse(240, 140 ,30, 30);
		private Rectangle Gril = new Rectangle(285,110,15,30);
		private Ellipse Lit = new Ellipse(270, 105 ,25, 10);
		private Rectangle bBox;
		private int move;
		private int lil=2;
		
        public WilliamCarP4(double x, double y)
        {
		
			
			// Cab = new Rectangle(200,50,50,100);
			Cab = new Rectangle(x,y,50,100);
			// Box = new Rectangle(10,50,180,100);
			Box = new Rectangle(x-190,y,180,100);
			// Rod = new Rectangle(180,125,30,10);
			Rod = new Rectangle(x-20,y+75,30,10);
			// Eng = new Rectangle(250,100,50,50);
			Eng = new Rectangle(x+50,y+50,50,50);
			// Mwhl = new Ellipse(130, 130 ,50, 50);
			Mwhl = new Ellipse(x-70, y+80 ,50, 50);
			// Rwhl = new Ellipse(20, 130 ,50, 50);
			Rwhl = new Ellipse(x-180, y+80 ,50, 50);
			// Fwhl = new Ellipse(230, 130 ,50, 50);
			Fwhl = new Ellipse(x+30, y+80,50, 50);
			// Win = new Ellipse(200, 55, 75, 90);
			Win = new Ellipse(x, y+5, 75, 90);
			// Dot1 = new Ellipse(30, 140 ,30, 30);
			Dot1 = new Ellipse(x-170, y+90 ,30, 30);
			// Dot2 = new Ellipse(140, 140 ,30, 30);
			Dot2 = new Ellipse(x-60, y+90 ,30, 30);
			// Dot3 = new Ellipse(240, 140 ,30, 30);
			Dot3 = new Ellipse(x+40, y+90 ,30, 30);
			// Gril = new Rectangle(285,110,15,30);
			Gril = new Rectangle(x+85,y+60,15,30);
			// Lit = new Ellipse(270, 105 ,25, 10);
			Lit = new Ellipse(x+70, y+55 ,25, 10);
			
			bBox = new Rectangle(Box.getX(),Box.getY(),Box.getWidth()+Rod.getWidth()/3+Cab.getWidth()+Eng.getWidth(),Box.getHeight()+Rwhl.getHeight()/2);
			// bBox.draw();
			
		Rod.setColor(Color.BLACK);
		
		Win.setColor(Color.BLACK);
		
		Cab.setColor(Color.ORANGE);
		
		Box.setColor(Color.GRAY);
		
		Eng.setColor(Color.ORANGE);
		
		Gril.setColor(Color.DARK_GRAY);
		
		Mwhl.setColor(Color.BLACK);
		
		Rwhl.setColor(Color.BLACK);
		
		Fwhl.setColor(Color.BLACK);
		
		Dot1.setColor(Color.GRAY);
		
		Dot2.setColor(Color.GRAY);
		
		Dot3.setColor(Color.GRAY);
		
		Lit.setColor(Color.YELLOW);
		
		
		}
		
		public void fill()
		{
			Rod.fill();
			Win.fill();
			Cab.fill();
			Box.fill();
			Eng.fill();
			Gril.fill();
			Mwhl.fill();
			Rwhl.fill();
			Fwhl.fill();
			Dot1.fill();
			Dot2.fill();
			Dot3.fill();
			Lit.fill();
		}
			
		public void draw()
		{
			Rod.draw();
			Win.draw();
			Cab.draw();
			Box.draw();
			Eng.draw();
			Gril.draw();
			Mwhl.draw();
			Rwhl.draw();
			Fwhl.draw();
			Dot1.draw();
			Dot2.draw();
			Dot3.draw();
			Lit.draw();
		}
		public void translate(double xx, double yy)
		{
			Rod.translate(xx,yy);
			Win.translate(xx,yy);
			Cab.translate(xx,yy);
			Box.translate(xx,yy);
			Eng.translate(xx,yy);
			Gril.translate(xx,yy);
			Mwhl.translate(xx,yy);
			Rwhl.translate(xx,yy);
			Fwhl.translate(xx,yy);
			Dot1.translate(xx,yy);
			Dot2.translate(xx,yy);
			Dot3.translate(xx,yy);
			Lit.translate(xx,yy);
			bBox.translate(xx,yy);
		}
		public Rectangle getBoundBox()
		{
			return bBox;
		}
		public double getX()
		{
			return bBox.getX();
		}
		public double getY()
		{
			return bBox.getY();
		}
		public double getWidth()
		{
			return bBox.getWidth();
		}
		public double getHeight()
		{
			return bBox.getHeight();
		}
}
