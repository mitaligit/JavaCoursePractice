import java.util.*;
public class nonrepeat {
public static void main(String[] args)
{
	String s = "aarbiicrc";
	Set<Character> s1 = new HashSet<Character>();
	Set<Character> s2 = new HashSet<Character>();
	char[] c = s.toCharArray();
	for(char d :c)
	{
		boolean b = s1.add(d);
		if(b == false)
		{
			s2.add(d);
		}
	}
	s1.removeAll(s2);
	System.out.println(s1);
	System.out.println(nonReapeatChar(s, s1));
}
public static char  nonReapeatChar(String s, Set<Character> s1)
{
	char c = ' ';
	for(int i = 0; i<s.length(); i++)
	{ 
		if(s1.contains(s.charAt(i)))
		{
			return s.charAt(i);
		}
	}
	return c;
}
}
