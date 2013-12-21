
public class anagram {
public static void main(String[] args)
{
	String s1 = "abcdef";
	String s2 = "ba";
	anag(s1, s2);
}
public static void anag(String s1, String s2)
{
	int i = 0;
	boolean flag = false;
	int num = s2.length();
	int k = num-1;
	String s = "";
	if(s2.length()>s1.length())
	{
		System.out.println("false");
		
	}
	for(i = 0; i<s1.length()-k; i++)
	{
		s = s1.substring(i, i+num);
		flag = chkanag(s, s2);
		if(flag == true)
		{
		System.out.println(flag);
		return;
		}
	}
	
	
	while(i!= s1.length())
	{
		int m = s1.length()-i;
		String s3 = s1.substring(i, i+m);
		int len = s2.length() - s3.length();
		s = s3 + s1.substring(0, len);
		i++;
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
