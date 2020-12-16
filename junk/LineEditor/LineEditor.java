// mc Answers
// 1 E
// 2 A
// 3 E
// 4 C
// 5 B
// 6 C
// 7 C
// 8 B
// 9 E
// 10 A
// 11 C

public class LineEditor {
	private String myLine;
	
	public LineEditor(String temp)
	{
		myLine = temp;
	}
	
	public void insert(String str, int index)
	{
		String A;
		String B;
		A = myLine.substring(0,index);
		B = myLine.substring(index);
		myLine = A + str+ B;
	}
	public void delete(String dStr)
	{
		int where = myLine.indexOf(dStr);//1pt
		String A;
		String B;
		if(where != -1)//1pt
		{
			A = myLine.substring(0,where);//1pt
			B = myLine.substring(where + dStr.length());//1pt
			myLine = A + B;// important!!! NO RETURN, NO SOP! 1pt
		}
	}
	public void deleteAll(String dAllStr)
	{
		while(myLine.indexOf(dAllStr) != -1)//1pt
		{
			delete(dAllStr);//2pt, NO MYLINE., REWRITING CODE!
		}//2pt
	}

	public String toString()
	{
		return myLine;
	}
}
	
