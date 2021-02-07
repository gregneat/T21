class starter {
        public static void main(String args[])
        {
			
			System.out.println();
			LineEditor tom = new LineEditor("Computer Science");
			System.out.println(tom);
			tom.delete("Com");
			System.out.println(tom);
			System.out.println();
			
			System.out.println(tom);
			tom.delete("ter Sc");
			System.out.println(tom);
			System.out.println();
			
			System.out.println(tom);
			tom.delete("c");
			System.out.println(tom);
			System.out.println();
			
			System.out.println(tom);
			tom.delete("Java");
			System.out.println(tom);
			System.out.println();
        }
	
        
}

