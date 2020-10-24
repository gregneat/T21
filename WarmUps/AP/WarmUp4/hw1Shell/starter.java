class starter {
	public static void main(String args[]) {
		EasyReader joe = new EasyReader();
		System.out.print("How long do you want your array?: ");
		int length = joe.readInt();
		
		int[] val = new int[length];
		//     include the second array if you want...
		// int[] val2 = new int[length];
		
		for(int j=0; j < val.length; j++)
		{
			val[j] = (int)(Math.random()*10);
		}
		System.out.println("\n\nHere is the \"OG\" array:\n");
		for(int k = 0; k < length; k++)
		{
			System.out.print(val[k]+" ");
		}
		//
		//
		// ONLY put your stuff here
		//
		//
		System.out.println("\n\n\nHere is the rearranged array:\n ");
		for(int k2 = 0; k2 < length; k2++)
		{
			System.out.print(val[k2]+" "); 
			//			OR
			// System.out.print(val2[k2]+" ");
		}
		System.out.print("\n\n");
		
	}
}
