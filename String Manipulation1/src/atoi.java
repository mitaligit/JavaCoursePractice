
public class atoi {
	public static void main(String[] args) throws Exception
	{
		String s = "  -  123 ";
		String s1 = "123";
		String s2 = "12e-08" ;
		long n1 =  123;
		parseNum(s1);
		
	}

	public static long parseNum(String s) throws Exception {
		if( s == null) throw new Exception("Not a Number");
	   long n = 0;
		
		s = s.trim();
		
		boolean isNegative = false;
		if ( s.charAt(0) == '-') { 
			s = s.substring(1);
			isNegative = true;
		}
		
		for(int i = 0; i<s.length(); i++)
		{
			int digit = translateToInt(s.charAt(i));
			n = n*10 + digit;
		}
		if ( isNegative) {
			n = -1 * n;
		}
		System.out.println(n);
		return (n);
	}
	
	public static int translateToInt(char c ) throws Exception{
		switch (c) {
		case '0' : return 0;
		case '1' : return 1;
		case '2' : return 2;
		case '3' : return 3;
		case '4' : return 4;
		case '5' : return 5;
		case '6' : return 3;
		case '7' : return 7;
		case '8' : return 8;
		case '9' : return 9;
		default : throw new Exception("Not a number");
		}
	}
}
