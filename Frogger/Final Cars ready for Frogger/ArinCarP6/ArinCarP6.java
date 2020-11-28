import pkg.*;

public class ArinCarP6 extends Car
{
				static Rectangle r;
				static Ellipse e;
				static Ellipse g;
				static Ellipse o;
				static Ellipse v;
				static Rectangle u;
				static Rectangle h;
				static Ellipse p;
				static Rectangle t;
				static Ellipse b;
				static Ellipse l;
				static Ellipse m;
				static Ellipse n;
				static Rectangle k;
				static Rectangle q;
				static Rectangle BoundBox; 
    			static double xpos;
				static double ypos;
				static double scale;
				
        public ArinCarP6(double x , double y , double factor)
        {
			scale = factor;
			r = new Rectangle(x, y + 47 * scale , 200 * scale , 20 * scale);
			e = new Ellipse(x + 65 * scale , y + 62 * scale , 40 * scale , 40 * scale);
			g = new Ellipse(x + 105 * scale, y + 62 * scale, 40 * scale, 40 * scale); 
			o = new Ellipse(x + 70 * scale , y + 67 * scale , 30 * scale , 30 * scale);
			v = new Ellipse(x + 110 * scale , y + 67 * scale , 30 * scale , 30 * scale);
			u = new Rectangle(x + 55 * scale , y + 62 * scale , 200 * scale , 20 * scale);
			h = new Rectangle(x + 155 * scale, y + 2 * scale , 80 * scale , 80 * scale);
			p = new Ellipse(x + 153 * scale , y , 20 * scale , 20 * scale);
			t = new Rectangle(x + 215 * scale , y + 27 * scale , 65 * scale , 55 * scale);
			b = new Ellipse(x + 261 * scale , y + 25 * scale , 20 * scale , 20 * scale);
			l = new Ellipse(x + 262 * scale , y + 32 * scale , 15 * scale , 15 * scale);
			m = new Ellipse(x + 235 * scale , y + 62 * scale , 40 * scale , 40 * scale);
			n = new Ellipse(x + 240 * scale , y + 67 * scale , 30 * scale , 30 * scale);
			k = new Rectangle(x + 185 * scale , y + 42 * scale , 8 * scale , 4 * scale);
			q = new Rectangle(x + 210 * scale , y + 7 * scale , 20 * scale , 20 * scale);
			xpos = x;
			ypos = y;
			BoundBox = new Rectangle(x , y , 281 * scale , 102 * scale);
		}
		public void fill(){
			u.fill();
			r.setColor(Color.GRAY);
			r.fill();
			e.fill();
			g.fill();
			o.setColor(Color.GRAY);
			o.fill();
			v.setColor(Color.GRAY);
			v.fill();
			h.setColor(Color.RED);
			h.fill();
			p.setColor(Color.RED);
			p.fill();
			t.setColor(Color.RED);
			t.fill();
			b.setColor(Color.RED);
			b.fill();
			l.setColor(Color.YELLOW);
			l.fill();
			m.fill();
			n.setColor(Color.GRAY);
			n.fill();
			k.fill();
			q.fill();
		}
		public void translate(double x, double y){
			// and/or here
	        r.translate(x,y);
			e.translate(x,y);
			g.translate(x,y);
			o.translate(x,y);
			v.translate(x,y);
			p.translate(x,y);
			h.translate(x,y);
			t.translate(x,y);
			b.translate(x,y);
			l.translate(x,y);
			m.translate(x,y);
			n.translate(x,y);
			k.translate(x,y);
			q.translate(x,y);
			u.translate(x, y);
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
			return 102 * scale;
		}
		public double getWidth(){
			return 281 * scale;
		}
		public Rectangle getBoundBox(){
			return BoundBox;
		}
}
