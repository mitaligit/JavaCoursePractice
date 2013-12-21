import java.util.*;
public class phonin {
public static void main(String args[])
{
	
	String str = "1-800-COM-CAST";
	String s = "";
	Map<Character, Integer> mp = new HashMap<Character, Integer>();
	
	mp.put('A', 2);
	mp.put('B', 2);
	mp.put('C', 2);
	mp.put('O', 6);
	mp.put('M', 6);
	mp.put('S', 7);
	mp.put('T', 8);
	for(int i = 0; i<str.length(); i++)
	{
		if(Character.isLetter(str.charAt(i)))
		{
			char s1 = str.charAt(i);
			int n = mp.get(s1);
			s = s+n;
		}
		else if(str.charAt(i)=='-')
		{
			continue;
		}
		else
		{
			s = s+str.charAt(i);
		}
	}
		
	System.out.println(s);	
	}
}

