import pkg.*;

public class DanielCarP2 extends Car {
	static Rectangle joe;
	static Rectangle raf;
	static Rectangle tun;
	static Rectangle chu;
	static Rectangle gek;
	static Ellipse don;
	static Ellipse put;
	static Ellipse cuk;
	static Ellipse kun;
	static Ellipse rut;
	static Ellipse wap;
	static Rectangle bound;
	

	public DanielCarP2()
    {
			// following line is necessary for onMouseClick, don't change
        joe = new Rectangle(30,30,100,100);
		don = new Ellipse(30,105,50,50);
		raf = new Rectangle(130,80,50,50);
		put = new Ellipse(130,105,50,50);
		tun = new Rectangle(38,35,82,36);
		cuk = new Ellipse(160,90,10,10);
		chu = new Rectangle(76,35,6,36);
		kun = new Ellipse(35,90,10,10);
		gek = new Rectangle(32,15,10,15);
		rut = new Ellipse(35,110,40,40);
		wap = new Ellipse(135,110,40,40);
		bound = new Rectangle(getX(), getY()-15, getWidth(), getHeight());
	}
	public DanielCarP2(double x, double y){
			joe = new Rectangle(x,y,100,100);
			don = new Ellipse(x,y+75,50,50);
			raf = new Rectangle(x+100,y+50,50,50);
			put = new Ellipse(x+100,y+75,50,50);
			tun = new Rectangle(x+8,y+5,82,36);
			cuk = new Ellipse(x+130,y+60,10,10);
			chu = new Rectangle(x+46,y+5,6,36);
			kun = new Ellipse(x+5,y+60,10,10);
			gek = new Rectangle(x+2,y-15,10,15);
			rut = new Ellipse(x+5,y+80,40,40);
			wap = new Ellipse(x+105,y+80,40,40);
			bound = new Rectangle(getX(), getY()-15, getWidth(), getHeight());
			
		}
		

		public void fill(){
			joe.fill();
			joe.setColor(Color.GREEN);
			don.fill();
			don.setColor(Color.BLACK);
			raf.fill();
			raf.setColor(Color.GREEN);
			put.fill();
			put.setColor(Color.BLACK);
			tun.fill();
			tun.setColor(Color.BLUE);
			cuk.fill();
			cuk.setColor(Color.YELLOW);
			chu.fill();
			chu.setColor(Color.GREEN);
			kun.fill();
			kun.setColor(Color.RED);
			gek.fill();
			gek.setColor(Color.GRAY);
			rut.fill();
			rut.setColor(Color.GRAY);
			wap.fill();
			wap.setColor(Color.GRAY);
		}

		public void translate(double x, double y){
			joe.translate(x,y);
			raf.translate(x,y);
			tun.translate(x,y);
			chu.translate(x,y);
			gek.translate(x,y);
			don.translate(x,y);
			put.translate(x,y);
			cuk.translate(x,y);
			kun.translate(x,y);
			rut.translate(x,y);
			wap.translate(x,y);
			bound.translate(x,y);
	
		}
		public void draw(){
			joe.draw();
			raf.draw();
			tun.draw();
			chu.draw();
			gek.draw();
			don.draw();
			put.draw();
			cuk.draw();
			kun.draw();
			rut.draw();
			wap.draw();
	
		}
		public double getX(){
			return joe.getX();
		}
		public double getY(){
			return joe.getY();
		}
		public double getHeight(){
			return put.getY()+50-gek.getY();
		}
		public double getWidth(){
			return raf.getX()+50 - joe.getX();
		}
		public Rectangle getBoundBox(){
			return bound;
			
		}
}