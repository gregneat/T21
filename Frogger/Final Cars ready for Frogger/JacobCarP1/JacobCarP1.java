import pkg.*;
public class JacobCarP1 extends Car
{
		private Rectangle joe;
		private Rectangle bob;
		private Rectangle guy;
		private Rectangle dude;
		private Ellipse man;
		private Ellipse person;
		private Rectangle bBox;

        public JacobCarP1(double x, double y)
		{
			
			// joe = new Rectangle(50,50,100,50);
			joe = new Rectangle(x,y,100,50);
			// joe.draw();
			// joe.fill();
			joe.setColor(Color.BLUE);
			
			// bob = new Rectangle(65,65,20,20);
			bob = new Rectangle(x+15,y+15,20,20);
			// bob.draw();
			// bob.fill();
			bob.setColor(Color.CYAN);
			
			// guy = new Rectangle(110,65,20,20);
			guy = new Rectangle(x+60,y+15,20,20);
			// guy.draw();
			// guy.fill();
			guy.setColor(Color.CYAN);
			
			// dude = new Rectangle(150,80,20,20);
			dude = new Rectangle(x+100,y+30,20,20);
			// dude.draw();
			// dude.fill();
			dude.setColor(Color.RED);
			
			// man = new Ellipse(65,90,25,25);
			man = new Ellipse(x+15,y+40,25,25);
			// man.draw();
			// man.fill();
			
			// person = new Ellipse(120,90,25,25);
			person = new Ellipse(x+70,y+40,25,25);
			// person.draw();
			// person.fill();
			bBox = new Rectangle(x,y,joe.getWidth()+dude.getWidth(),joe.getHeight()+man.getHeight()/2);
			// bBox.draw();
			
		}
		
		public void fill(){
			// and/or here
			joe.fill();
			bob.fill();
			guy.fill();
			dude.fill();
			man.fill();
			person.fill();
		}
		public void draw(){
			// and/or here
			joe.draw();
			bob.draw();
			guy.draw();
			dude.draw();
			man.draw();
			person.draw();
		}
		public void translate(double x, double y){
			// and/or here
			joe.translate(x,y);
			bob.translate(x,y);
			guy.translate(x,y);
			dude.translate(x,y);
			man.translate(x,y);
			person.translate(x,y);
			bBox.translate(x,y);
		}
		public Rectangle getBoundBox()
		{
			return bBox;
		}
		public double getX()
		{
			return joe.getX();
		}
		public double getY()
		{
			return joe.getY();
		}
		public double getHeight()
		{
			return bBox.getHeight();
		}
		public double getWidth()
		{
			return bBox.getWidth();
		}

}
