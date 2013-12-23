import java.util.*;
public class combtrial {
	public static void main(String[] args)
	{
		Set<String> all = new TreeSet<String>();
		String s = "abc";
		String chosen = "";
		int length = 2;
		combinations(s, chosen, all, length);
		for(String comb: all)
		{
			System.out.println(comb);
		}
	}
	public static void combinations(String s, String chosen, Set<String> all, int length)
	{
		if(length == 0)
		{
			all.add(chosen);
		}
		else
		{
			for(int i = 0; i<s.length(); i++) 
			{
				String tmp = s;
				String tmp1 = chosen;
				char c = s.charAt(i);
				s = s.substring(0, i) + s.substring(i+1);
				chosen += c;
				combinations(s, chosen, all, length-1);
				s = tmp;
				chosen = tmp1;
			}
		}
	}
}
