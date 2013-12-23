
public class binarycount {
public static void main(String[] args)
{
	int n = 3;
	String s = "";
	countBinary(s, n);
}
public static void countBinary(String s, int n)
{
	//String s1 = "0";
	//String s2 = "1";
	if(n ==1)
	{
		System.out.println(s + "0");
		System.out.println(s + "1");
	}
	else
	{
		//s1 = "0" +s;
		//s2 = 
		countBinary(s+"0", n-1);
		countBinary(s+"1", n-1);
		//System.out.println("1" + countBinary(n-1));
	}
}
}

/*
public class binarycount {
public static void main(String[] args)
{
	int n = 4;
	StringBuffer s = new StringBuffer();
	countBinary(s, n);
}
public static void countBinary(StringBuffer s, int n)
{
	//String s1 = "0";
	//String s2 = "1";
	
	if(n ==1)
	{
		System.out.println(s +"0");
		System.out.println(s + "1");
	}
	else
	{
		//s1 = "0" +s;
		//s2 = 
		StringBuffer sb = new StringBuffer();
		sb = sb.append(s);
		countBinary(s.append("0"), n-1);
		countBinary(sb.append("1"), n-1);
		//System.out.println("1" + countBinary(n-1));
	}
}
}*/
