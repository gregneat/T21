import pkg.*;
import java.util.ArrayList;
import java.util.List;
public class starter implements InputControl, InputKeyControl 
{
		
		static List<Vehicle> jefz;
		static List<Integer> holder;
		static happyFace joe;
		static Rectangle button;
		static Rectangle mouser;
		static boolean piggy;
		static double faceSpeed =8;
		static double diagmove = 0.5*Math.sqrt(2);
        public static void main(String args[])
        {
		
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			jefz = new ArrayList<Vehicle>();
			holder = new ArrayList<Integer>();
			
			
		
			
			Text bob = new Text(700,332.5,"Click Here To Begin!");
			bob.setColor(Color.WHITE);
			bob.grow(155,75); 
			button = new Rectangle(500,275,450,150);
			button.setColor(Color.RED);
			
			Text bobt = new Text(700,332.5,"You Win! Click To Begin Level !");
						bobt.setColor(Color.BLUE);
						bobt.grow(255,75); 
			
			Text bobto = new Text(700,332.5,"You Lose! :( Try Not to Suck!");
			bobto.setColor(Color.BLUE);
			bobto.grow(255,75); 
			
			EasyReader joer = new EasyReader("High_Score.txt");
			int score = joer.readInt();
			Text sup = new Text(70,10,"High Score: Level "+score);
			//19
			sup.setColor(Color.RED);
			sup.grow(55,20); 
			sup.draw();
			
			Text sup2 = new Text(1110,10,"Your Current Score: Level 1");
			//27
			sup2.setColor(Color.BLUE);
			sup2.grow(78,20); 
			sup2.draw();
			int y =0;
			
			int nene = 1;
			
			
			//button = new Rectangle(500,275,450,150);
			//button.setColor(Color.WHITE);
			 
			
			Color nk = new Color(82,190,128);
			for (int xe=0; xe<=5; xe++)
			{
				Rectangle Jeff = new Rectangle(-1,110*xe,1404,110);
				Jeff.fill();
				if (xe%2 == 0)
				{
					Jeff.setColor(Color.BLACK);
					Jeff.draw();
				}
				else
				{
					
					Jeff.setColor(nk);
				}
			}
			joe = new happyFace(660,561);
			joe.fill();
			
			//jefz = new Car[14];
			//int x = 0;
			double iy = 2.0;
			int scorer = 1;
			int tt=1;
			boolean jok = true;
			int qq=0;
			
			int size = 8;
			int carsize = size;
			//// to do list change array into arraylist
			//// so the contains thing will work and general betterness 4/1/2020
			//// I have no recollection of writing ^^this^^ or fixing this 11/5/2020
			
			for(int i = 0; i<size; i++)
			{
				int p = (Canvas.rand(1350)-375);
				//int d =Canvas.rand(600);
				int pr = Canvas.rand(5);
				int d =Canvas.rand(255);
				int dt =Canvas.rand(255);
				int dty =Canvas.rand(255);
				Color ni = new Color(d,dt,dty);
				//int dr =Canvas.rand(6);
				//x = x+10;
				
				if(Canvas.rand(5) == 1)
				{
					jefz.add(new Tractor(p,(pr*110)+13.25));
					jefz.get(i).setStep(iy+0.25);
					holder.add(i);
					jefz.get(i).fill();
				}
				else{
					jefz.add(new Car(p,(pr*110)+13.25, "vroom", ni));
					jefz.get(i).setStep(iy);
					jefz.get(i).fill();
				}
				
				
				for(int t = 0; t<jefz.size()-1;t++)
				{
					if(jefz.get(i).contains(jefz.get(t)))
					{
						jefz.get(i).translate(Canvas.rand(200)-100,Canvas.rand(5)*110);
					}
				}
			}
			
			
			System.out.println(jefz);
			System.out.println("\n" +holder );
			button.fill(); bob.draw();
			while(!piggy)
			{
				
				Canvas.pause(1);
			}
			button.translate(-1500,-1500);
			bob.translate(-1500,-1500);
			piggy = false;
			while(true)
			{
				
				for(int lo =0; lo<jefz.size(); lo++)
				{
					
					Canvas.pause(1);
					jefz.get(lo).translate(jefz.get(lo).getStep(),0);
					jefz.get(lo).drive();
					
					if(joe.getX() > 1350)
					{
						joe.translate(-1400,0);
					}
					else if(joe.getX() < -50)
					{
						joe.translate(1400,0);  
					}
					
					for(int i=0; i<holder.size();i++)
					{
						for(int b=0; b<jefz.size()-1;b++)
						{
							if(holder.get(i)==b)
							{
								b++;
							}
							//System.out.println(jefz.get(holder.get(i))+"  "+jefz.get(b));
							if(jefz.get(holder.get(i)).contains(jefz.get(b)))
							{
								if(Canvas.rand(2) ==1)
								{
									for(int a = 0; a<20; a++)
									{
										jefz.get(b).translate(0,5.5);
										System.out.println("A tractor bumped a " + jefz.get(b));
									
									}
									//System.out.println("Hit with Tractor " + i + " and Car " + b);
									//System.out.println(jefz.get(holder.get(i))+"  "+jefz.get(b));
								}
								else
								{
									for(int a = 0; a<20; a++)
									{
										jefz.get(b).translate(0,-5.5);
										System.out.println("A tractor bumped a " + jefz.get(b));
									}
								}
							}
						}
					}
					
					
					if (joe.crash(jefz.get(lo)))
					{
						for(int ppp=0;ppp<jefz.size();ppp++)
						{
							jefz.get(ppp).setStep(0);
						}
						while (true)
						{
							//int pl= 0;
							
							
							bobto.draw();
							bobto.setColor(new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255)));
							//bobto.grow(8*pl,8*pl); 
							//pl++;
							
							joe.grow(.5,0.5);
							if(((scorer > score)&&jok ))
							{
								EasyWriter bobo = new EasyWriter("High_Score.txt");
								EasyWriter bobo2 = new EasyWriter("High_Score.txt");
								bobo2.print(scorer);
								bobo2.close();
								
								jok = false;
								
							}
							
							
							
						}
						// if((scorer > score)&&jok)
						// {
							// EasyWriter bobo = new EasyWriter("High_Score.txt");
							// EasyWriter bobo2 = new EasyWriter("High_Score.txt");
							// bobo2.print(scorer);
							// bobo2.close();
						
							// while (true)
							// {
								// int pl= 0;
								
								// int du =Canvas.rand(255);
								// int dtu =Canvas.rand(255);
								// int dtyu =Canvas.rand(255);
								// Color siz = new Color(du,dtu,dtyu);
								// bobto.draw();
								// bobto.setColor(siz);
								// bobto.grow(8*pl,8*pl); 
								// pl++;
								// qq++;
								// joe.grow(.5*qq,0.5*qq);
								
							// }
							
							
						// }
					}
					
					
					if(joe.getY() < -50)
					{
						if (tt==1)
						{
							nene++;
							tt=2;
							button = new Rectangle(425,275,600,150);
							 bobt = new Text(700,332.5,"Click Here To Begin!");
							bobt.setColor(Color.BLUE);
							bobt.grow(250,75); 
						}
						
						
						//button.setColor(Color.WHITE);  
						button.fill();
						bobt.setText("You Win! Click To Begin Level "+ nene +" !");
						bobt.draw();
						jefz.get(lo).setStep(0);
						if (piggy)
						{
							if(Canvas.rand(4) == 1)
							{
								jefz.add(new Tractor((Canvas.rand(350)-475),(Canvas.rand(5)*110)+13.25));
								jefz.get(jefz.size()-1).fill();
								holder.add(jefz.size()-1);
								System.out.println("A " + jefz.get(jefz.size()-1) + " has been added");
							}
							else
							{
								jefz.add(new Car((Canvas.rand(350)-475),(Canvas.rand(5)*110)+13.25, "vroom", new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255))));
								jefz.get(jefz.size()-1).fill();
								System.out.println("A " + jefz.get(jefz.size()-1) + " has been added");
							}
							for(int t = 0; t<jefz.size()-1;t++)
								{
									if(jefz.get(jefz.size()-1).contains(jefz.get(t)))
									{
										jefz.get(jefz.size()-1).translate(Canvas.rand(200)-100,Canvas.rand(5)*110);
									}
								}
							
							for(int uy=0;uy<jefz.size();uy++)
							{
								if(jefz.get(uy).getHeight() < 60)
								{
									jefz.get(uy).setStep(iy+(0.125*iy));
								}
								else if(jefz.get(uy).getHeight() > 60)
								{
									jefz.get(uy).setStep(iy);
								}
							}
							System.out.println(jefz + "\n");
							if (tt==2)
							{
								iy =iy+1.15;
								faceSpeed += 1.075;
								scorer ++;
								
								
								tt=1;
								System.out.println(joe.getY());
								joe.translate(0,700+ (-1* joe.getY()));
								System.out.println(joe.getY());
								button.translate(1550,1550);
								bobt.translate(1550,1550);
								//break;
								piggy=false;
								sup2.setText("Your Current Score: Level " + scorer);
							}
						}
					}
				}
			
				
			}
		
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			mouser = new Rectangle(x-12.5,y-35,10,10); //mouser.draw();
			if (button.contains(mouser))
			{
				piggy = true;
			}
			else
			{
				piggy = false;
			}
	
		}
		
		public void keyPress(String s)
		{
			
			if(s.equals("e"))
			{
				joe.translate(diagmove*faceSpeed,- diagmove*faceSpeed);
			}
			
			if(s.equals("q"))
			{
				joe.translate(- diagmove*faceSpeed,- diagmove*faceSpeed);
			}
			
			if(s.equals("c"))
			{
				joe.translate(diagmove*faceSpeed,diagmove*faceSpeed);
			}
			if(s.equals("z"))
			{
				joe.translate(- diagmove*faceSpeed,diagmove*faceSpeed);
			}
			
			if(s.equals("w"))
			{
				joe.translate(0,-faceSpeed);
			}
			
			if(s.equals("a"))
			{
				joe.translate(-faceSpeed,0);
			}
			if(s.equals("s"))
			{
				joe.translate(0,faceSpeed);
			}
			if(s.equals("d"))
			{
				joe.translate(faceSpeed,0);
			}
			
			
			// temp holds the enter character
			
			char done = (char)10;
			String temp = Character.toString(done);
			
		}
}
