import pkg.*;
public class starter 
{
        public static void main(String args[])
        {
			EasyReader in = new EasyReader();
			System.out.print("please enter a file name: ");
			String fn = in.readWord();
			Pal joe = new Pal(fn);
			System.out.println("There were "+joe.howManyPals() + " palindromes in the file");
		}
		
}
