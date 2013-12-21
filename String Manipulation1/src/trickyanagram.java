
public class trickyanagram {
	public static void main(String[] args)
	{
		String s1 = "abcdef";
		String s2 = "efa";
		anag(s1, s2);
	}
	public static void anag(String s1, String s2)
	{
		int i = 0;
		boolean flag = false;
		int num = s2.length();
		
		String s = "";
		int num1 = s1.length();
		if(s2.length()>s1.length())
		{
			System.out.println("false");
			
		}
		s1 += s1; 
		for(i = 0; i<num1; i++)
		{
			s = s1.substring(i, i+num);
			flag = chkanag(s, s2);
			if(flag == true)
			{
			System.out.println(flag);
			return;
			}
		}
		System.out.println(flag);
	}
	public static boolean chkanag(String s, String s2)
	{
		if(s.length() != s2.length())
		{
			return false;
		}
		for(int i=0; i<s.length(); i++)
		{
			String a = "" + s.charAt(i);
			if(s2.contains(a))
			{
				int n = s2.indexOf(a);
				s2 = s2.substring(0, n)+ s2.substring(n+1);
				continue;
				
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}
