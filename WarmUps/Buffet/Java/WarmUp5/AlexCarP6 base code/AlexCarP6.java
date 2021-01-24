import pkg.*;
import java.util.Timer;
public class AlexCarP6
{
		public static Rectangle[] windSheilds = new Rectangle[30];
	
		public static Rectangle bottomCar;
		public static Rectangle topCar;
		public static Rectangle border;
		
		public static Ellipse frontTire;
		public static Ellipse frontWheel;
		public static Ellipse backTire;
		public static Ellipse backWheel;
		
		public static Rectangle windShield1;
		public static Rectangle underCarriage;
		public static Rectangle underCarriageBorder;
		public static Rectangle topPart;
		public static Rectangle topPartB;
		
		public static Rectangle plus1;
		public static Rectangle plus2;
		
		public static Rectangle light;
		public static Rectangle lightBorder;
		public static Rectangle middlePart;
		
		public static Rectangle dash1;
		public static Rectangle dash2;
		public static Rectangle dash3;
		public static Rectangle dash4;
		public static Rectangle dash5;
		
		public static Ellipse logoRed;
		public static Ellipse logoCover;
		public static Ellipse seal;
		
		public static double rectW = 10;
		public static double rectY = 15;
		
		public static boolean red;
		
		static Color R;
		
        public AlexCarP6(double x, double y)
        {
			Timer timer = new Timer();
			
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			//The body of the car
			topCar = new Rectangle(x + 20, y + 10, 100, 60);
			bottomCar = new Rectangle(x + 20,y + 45, 100, 25); 
			border = new Rectangle(x + 19,y + 9, 102, 62);
			topCar.setColor(Color.WHITE);
			bottomCar.setColor(Color.RED);
			border.fill();
			topCar.fill();
			
			logoRed = new Ellipse(x + 52.5,y + 11, 35, 23);
			logoRed.setColor(Color.RED);
			logoRed.fill();
			
			logoCover = new Ellipse(x + 56.5,y + 16, 27, 13);
			logoCover.setColor(Color.WHITE);
			logoCover.fill();
			
			seal = new Ellipse(x + 65,y + 18, 10, 10);
			seal.setColor(Color.YELLOW);
			seal.fill();
			
			bottomCar.fill();
			
			middlePart = new Rectangle(x + 20,y + 35, 100, 10);
			middlePart.setColor(Color.YELLOW);
			middlePart.fill();
			
			dash1 = new Rectangle(x + 25,y + 37.5, 10, 5);
			dash1.fill();
			dash2 = new Rectangle(x + 45,y + 37.5, 10, 5);
			dash2.fill();
			dash3 = new Rectangle(x + 65,y + 37.5, 10, 5);
			dash3.fill();
			dash4 = new Rectangle(x + 85,y + 37.5, 10, 5);
			dash4.fill();
			dash5 = new Rectangle(x + 105,y + 37.5, 10, 5);
			dash5.fill();
			
			//Front of the car
			windShield1 = new Rectangle(x + 120,y + rectY, rectW, 1);
			windShield1.setColor(Color.BLUE);
			windShield1.fill();
			int temp = 0;
			while (true)
			{
				rectY += 1;
				rectW += 1;
				windSheilds[temp] = new Rectangle(x + 120,y + rectY, rectW, 1);
				windSheilds[temp].setColor(Color.BLUE);
				windSheilds[temp].fill();
				temp++;
				if(rectW >= 40)
				{
					break;
				}
			}
			underCarriageBorder = new Rectangle(x + 120,y + 45, 40, 26);
			underCarriageBorder.fill();
			
			underCarriage = new Rectangle(x + 121,y + 46, 38, 24);
			underCarriage.setColor(Color.WHITE);
			underCarriage.fill();
			
			//The wheels & tires
			//98
			frontTire = new Ellipse(x + 108,y + 60, 24, 24);
			frontTire.setColor(Color.BLACK);
			frontTire.fill();
			
			backTire = new Ellipse(x + 28,y + 60, 24, 24);
			backTire.setColor(Color.BLACK);
			backTire.fill();
			
			frontWheel = new Ellipse(x + 110,y + 62, 20, 20);
			frontWheel.setColor(Color.GRAY);
			frontWheel.fill();
			
			backWheel = new Ellipse(x + 30,y + 62, 20, 20);
			backWheel.setColor(Color.GRAY);
			backWheel.fill();
			
			topPartB = new Rectangle(x + 120,y + 9, 10, 7);
			topPartB.fill();
			
			topPart = new Rectangle(x + 121,y + 10, 8, 5);
			topPart.setColor(Color.RED);
			topPart.fill();
			
			plus1 = new Rectangle(x + 130,y + 55, 21, 6);
			plus1.setColor(Color.RED);
			plus1.fill();
			
			plus2 = new Rectangle(x + 138,y + 48, 6, 20);
			plus2.setColor(Color.RED);
			plus2.fill();
			
			lightBorder = new Rectangle(x + 69,y + 0, 10, 9);
			lightBorder.fill();
			
			light = new Rectangle(x + 70,y + 1, 8, 7);
			light.setColor(Color.RED);
			light.fill();
			
			R = Color.RED;

			//red = true;
			
			//Make a while loop to create new lines every time until it hits a certain length of line
			
		}
		public static void translate(double a, double b){
			topCar.translate(a, b);
			bottomCar.translate(a, b);
			border.translate(a, b);
			frontTire.translate(a, b);
			backTire.translate(a, b);
			frontWheel.translate(a, b);
			backWheel.translate(a, b);
			windShield1.translate(a, b);
			underCarriage.translate(a, b);
			underCarriageBorder.translate(a, b);
			topPart.translate(a, b);
			topPartB.translate(a, b);
			plus1.translate(a, b);
			plus2.translate(a, b);
			light.translate(a, b);
			lightBorder.translate(a, b);
			middlePart.translate(a, b);
			dash1.translate(a, b);
			dash2.translate(a, b);
			dash3.translate(a, b);
			dash4.translate(a, b);
			dash5.translate(a, b);
			logoCover.translate(a, b);
			logoRed.translate(a, b);
			seal.translate(a, b);
			
			int temp = 0;
			while(true)
			{
				windSheilds[temp].translate(a, b);
				temp++;
				if(temp > 29)
				{
					break;
				}
			}
			
		}
		public void flash()
		{
			if(R == Color.RED)
				{
							light.setColor(Color.WHITE);
							R = Color.WHITE;
				}
				else if(R == Color.WHITE)
				{
							light.setColor(Color.RED);
							R = Color.RED;
				}
		}
}
