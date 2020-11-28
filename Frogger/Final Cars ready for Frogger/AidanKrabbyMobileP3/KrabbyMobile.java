import pkg.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
public class KrabbyMobile extends Car
{
	private Picture spongeBob;
	private Picture patrick;
	private Rectangle lettuce;
	private Ellipse tomato;
	private Ellipse onion;
	private Ellipse onionlayer;
	private Ellipse oL2;
	private Rectangle cheese;
	private Rectangle cL;
	private Ellipse patty;
	private Ellipse bun;
	
	//Sesame seeds
	private Ellipse seed1;
	private Ellipse seed1L;
	private Ellipse seed2;
	private Ellipse seed2L;
	private Ellipse seed3;
	private Ellipse seed3L;
	private Ellipse seed4;
	private Ellipse seed4L;
	private Ellipse seed5;
	private Ellipse seed5L;
	private Ellipse seed6;
	private Ellipse seed6L;
	private Ellipse seed7;
	private Ellipse seed7L;
	private Ellipse seed8;
	private Ellipse seed8L;
	
	//wheels
	private Ellipse w1;
	private Ellipse w1L;
	private Ellipse w2;
	private Ellipse w2L;
	
	//colors of the pieces of the burger
	private Color BROWN;
	private Color SEED;
	private Color PURPLE;
	
	//dimensions of krabby mobile
	private double xx;
	private double yy;
	private double w;
	private double h;
	private Rectangle bound;
	
	public KrabbyMobile(double x, double y, double f){
		  //x starts at 100 goes off of the bun
		  //y starts at 100
		  
		  xx = x;
		  yy = y;
		  
		  w = 400;
		  h = 250;
		  
		  bound = new Rectangle(xx*f,yy*f,w*f,(h+40)*f);
		  // bound.draw();
		  
		  
		  
		  
		  lettuce = new Rectangle((xx-25)*f,(yy+75)*f,(w+50)*f,(h-235)*f);
		
		  tomato = new Ellipse((xx-25)*f,(yy+90)*f,(w+50)*f,(h-225)*f);
		
		  onion = new Ellipse((xx-25)*f,(yy+115)*f,(w+50)*f,(h-225)*f);
		  onionlayer = new Ellipse((xx-25)*f,(yy+115)*f,(w+50)*f,(h-225)*f);
		  oL2 = new Ellipse((xx-50)*f,(yy+115)*f,(w+30)*f,(h-225)*f);
		
		  cheese = new Rectangle((xx-25)*f,(yy+140)*f,(w+50)*f,(h-240)*f);
		  cL = new Rectangle((xx-25)*f,(yy+140)*f,(w+50)*f,(h-2240)*f);
		
		  patty = new Ellipse((xx-25)*f,(yy+150)*f,(w+50)*f,(h-200)*f);
		
		  bun = new Ellipse(xx*f,yy*f,w*f,h*f);
		
		  seed1 = new Ellipse((xx+95)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed1L = new Ellipse((xx+95)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed2 = new Ellipse((xx+125)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed2L = new Ellipse((xx+125)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed3 = new Ellipse((xx+155)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed3L = new Ellipse((xx+155)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed4 = new Ellipse((xx+185)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed4L = new Ellipse((xx+185)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed5 = new Ellipse((xx+205)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed5L = new Ellipse((xx+205)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed6 = new Ellipse((xx+235)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed6L = new Ellipse((xx+235)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed7 = new Ellipse((xx+265)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed7L = new Ellipse((xx+265)*f,(yy+25)*f,(w-390)*f,(h-243)*f);
		  seed8 = new Ellipse((xx+295)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		  seed8L = new Ellipse((xx+295)*f,(yy+35)*f,(w-390)*f,(h-243)*f);
		
		  w1 = new Ellipse((xx+230)*f,(yy+240)*f,(w-350)*f,(h-200)*f);
		  w1L= new Ellipse((xx+230)*f,(yy+240)*f,(w-350)*f,(h-200)*f);
		  w2 = new Ellipse((xx+120)*f,(yy+240)*f,(w-350)*f,(h-200)*f);
		  w2L = new Ellipse((xx+120)*f,(yy+240)*f,(w-350)*f,(h-200)*f);
		 
		 BROWN = new Color(117, 64, 18);
		 SEED = new Color(255, 246, 161);
		 PURPLE = new Color(222, 168, 247);
	}
	
	public double getX(){
		return bound.getX();
	}
	
	public double getY(){
		return bound.getY();
	}
	
	public double getWidth(){
		return bound.getWidth();
	}
	
	public double getHeight(){
		return bound.getHeight();
	}
		
	
	public void translate(double xxx, double yyy){
		  bound.translate(xxx,yyy);
		  lettuce.translate(xxx,yyy);
		  tomato.translate(xxx,yyy);
		  onion.translate(xxx,yyy);
		  onionlayer.translate(xxx,yyy);
		  oL2.translate(xxx,yyy);
		  cheese.translate(xxx,yyy);
		  cL.translate(xxx,yyy);
		  patty.translate(xxx,yyy);
		  bun.translate(xxx,yyy);
		  seed1.translate(xxx,yyy);
		  seed1L.translate(xxx,yyy);
		  seed2.translate(xxx,yyy);
		  seed2L.translate(xxx,yyy);
		  seed3.translate(xxx,yyy);
		  seed3L.translate(xxx,yyy);
		  seed4.translate(xxx,yyy);
		  seed4L.translate(xxx,yyy);
		  seed5.translate(xxx,yyy);
		  seed5L.translate(xxx,yyy);
		  seed6.translate(xxx,yyy);
		  seed6L.translate(xxx,yyy);
		  seed7.translate(xxx,yyy);
		  seed7L.translate(xxx,yyy);
		  seed8.translate(xxx,yyy);
		  seed8L.translate(xxx,yyy);
		  w1.translate(xxx,yyy);
		  w1L.translate(xxx,yyy);
		  w2.translate(xxx,yyy);
		  w2L.translate(xxx,yyy);
	}

	public void fill(){
		bun.fill();
		bun.setColor(Color.ORANGE);
		seed1.fill();
		seed1.setColor(SEED);
		seed1L.draw();
		seed2.fill();
		seed2.setColor(SEED);
		seed2L.draw();
		seed3.fill();
		seed3.setColor(SEED);
		seed3L.draw();
		seed4.fill();
		seed4.setColor(SEED);
		seed4L.draw();
		seed5.fill();
		seed5.setColor(SEED);
		seed5L.draw();
		seed6.fill();
		seed6.setColor(SEED);
		seed6L.draw();
		seed7.fill();
		seed7.setColor(SEED);
		seed7L.draw();
		seed8.fill();
		seed8.setColor(SEED);
		seed8L.draw();
		lettuce.fill();
		lettuce.setColor(Color.GREEN);
		tomato.fill();
		tomato.setColor(Color.RED);
		onion.fill();
		onion.setColor(PURPLE);
		onionlayer.draw();
		oL2.setColor(PURPLE);
		cheese.fill();
		cheese.setColor(Color.YELLOW);
		cL.draw();
		patty.fill();
		patty.setColor(BROWN);
		w1.fill();
		w1.setColor(Color.GREEN);
		w1L.draw();
		w2.fill();
		w2.setColor(Color.GREEN);
		w2L.draw();
	}
	
	public void draw(){
		bun.draw();
		patty.draw();
		seed1L.draw();
		seed2L.draw();
		seed3L.draw();
		seed4L.draw();
		seed5L.draw();
		seed6L.draw();
		seed7L.draw();
		seed8L.draw();
		onionlayer.draw();
		oL2.setColor(PURPLE);
		cL.draw();
		w1L.draw();
		w2L.draw();
	}
	
	public Rectangle getBoundBox(){
		return bound;
	}
		
	public boolean contains(Rectangle o){
		if ((o.getX()-w < bound.getX()+400 && o.getX()>bound.getX()) 
					&& o.getY()-h < bound.getY()+400 && o.getY()>bound.getY()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean contains(Ellipse o){
		if ((o.getX()-w < bound.getX()+400 && o.getX()>bound.getX()) 
					&& o.getY()-h < bound.getY()+400 && o.getY()>bound.getY()){
			return true;
		}
		else{
			return false;
		}
	}
		
}
