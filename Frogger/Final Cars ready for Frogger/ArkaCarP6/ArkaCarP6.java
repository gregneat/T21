import pkg.*;

public class ArkaCarP6 extends Car{
    
	static Rectangle r;
    static Ellipse a;
	static Ellipse e;     
    static Rectangle g;
    static Rectangle k;
	static Rectangle l;
    static Rectangle u;
	static Ellipse f;
	static Ellipse o;
	static Rectangle c;
	static Rectangle t;
    static Rectangle h;
    static Ellipse n; 
    static Rectangle m;
    static Rectangle q;
    static Ellipse j; 
    static Ellipse d;
	static Rectangle BoundBox; 
    static int xpos;
	static int ypos;
	static double scale;


	public ArkaCarP6(int X, int Y, double factor){
		scale = factor;
        r = new Rectangle (X + (125 * scale) , Y + (60*scale) , 150 * scale, 70 * scale);
        a = new Ellipse (X + (295 * scale) , Y + (110 * scale) , 50 * scale , 50 * scale);
        e = new Ellipse (X + (45 * scale) , Y + (110 * scale) , 50 * scale , 50 * scale);
        g = new Rectangle (X + (125 * scale) , Y ,10 * scale , 60 * scale);
        k = new Rectangle (X + (265 * scale) , Y , 10 * scale ,60 * scale);
        l = new Rectangle (X + (125 * scale) , Y , 150 * scale , 10 * scale);
        u = new Rectangle (X + (245 * scale), Y + (90 * scale) , 150 * scale , 40 * scale);
        f = new Ellipse (X + (245 * scale) , Y + (60 * scale) , 150 * scale , 70 * scale);
        o = new Ellipse (X + (10 * scale) , Y + (60 * scale) , 150 * scale , 70 * scale);
        c = new Rectangle (X + (10 * scale) , Y + (90 * scale) , 150 * scale , 40 * scale);
        t = new Rectangle (X + (105 * scale) , Y + (60 * scale), 20 * scale , 20 *scale);
        h = new Rectangle (X + (275 * scale) , Y + (60 * scale) , 30 * scale , 10 * scale);
        n = new Ellipse (X + (375 * scale) , Y + (80 * scale) , 30 * scale , 30 * scale);
        m = new Rectangle (X + (125 * scale) , Y + (60 * scale) , 150 * scale , 70 * scale);
        q = new Rectangle (X + (145 * scale) , Y + (75 * scale) , 30 * scale , 10 * scale);
        j = new Ellipse (X , Y + (80 * scale) , 30 * scale , 30 * scale); 
        d = new Ellipse (X + (5 * scale) , Y + (120 * scale) , 400 * scale , 50 * scale);
		xpos = X;
		ypos = Y;
		BoundBox = new Rectangle(X , Y , 405 * scale , 170 * scale);
    }
	public void fill(){
		d.setColor(Color.BLUE);
		d.draw();
	    d.fill();
		j.setColor(Color.YELLOW);
		j.draw();
	    j.fill();
		n.setColor(Color.YELLOW);
		n.draw();
	    n.fill();
		h.setColor(Color.RED);
		e.draw();
	    e.fill();
		o.setColor(Color.RED);
		o.draw();
	    o.fill();
		t.setColor(Color.RED);
		t.fill();
		c.fill();
		c.setColor(Color.RED);
		u.setColor(Color.RED);
		f.draw();
	    f.fill();
	    f.setColor(Color.RED);
		k.draw();
	    k.fill();
		l.draw();
	    l.fill();
		g.draw();
	    g.fill();
		a.draw();
		a.fill();
		r.draw();
		r.setColor(Color.RED);
		r.fill();
		u.fill();
		h.draw();
		h.fill();
		m.draw();
		q.draw();
		q.fill();
	}
	public void translate(double x , double y){
		r.translate(x , y);
		e.translate(x , y);
		a.translate(x , y);
		k.translate(x , y);
		l.translate(x , y);
	    g.translate(x , y);
		u.translate(x , y);
		f.translate(x , y);
		o.translate(x , y);
		c.translate(x , y);
		h.translate(x , y);
		t.translate(x , y);
	    n.translate(x , y);
		m.translate(x , y);
	    q.translate(x , y);
	    j.translate(x , y);
	    d.translate(x , y);
		BoundBox.translate(x , y);
		xpos += x;
		ypos += y;
	}
	public double getX(){
		return xpos;
	}
	public double getY(){
		return ypos;
	}
	public double getHeight(){
		return 170 * scale;
	}
	public double getWidth(){
		return 405 * scale;
	}
	public Rectangle getBoundBox(){
		return BoundBox;
	}
}