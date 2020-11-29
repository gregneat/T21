import pkg.*;
public class starter {
	
	// write the necessary methods to make this psvm work.
	// DON'T change the psvm!
	
	public static void main(String args[])
	{
		
		int[] group;
		EasyReader in = new EasyReader();
		int num;
		int counter = 1;
		System.out.print("How many elements do you want: ");
		num = in.readInt();
		group = biden(num);
		while(!warren(group))
		{
			counter++;
			group = biden(num);
			mayorPete(group);
		}
		System.out.println("it took: "+counter);
		mayorPete(group);
	}
	

// How many elements do you want: 5
// 0 6 24 49 47
// 41 7 34 11 12
// 14 47 20 26 14
// 29 48 7 15 42
// 26 28 18 18 27
// it took: 6
// 26 28 18 18 27



// How many elements do you want: 4
// 40 47 11 34
// 32 43 6 24
// 33 36 30 45
// 1 48 22 43
// 18 28 33 16
// 45 5 1 46
// 30 30 34 25
// it took: 8
// 30 30 34 25



		
}

