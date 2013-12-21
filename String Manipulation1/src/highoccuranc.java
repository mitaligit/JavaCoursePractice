import java.util.*;
public class highoccuranc {
public static void main(String[] args)
{
	String s = "AJDHURNANDANDJNAUYTRAYAUIA";
	//high(s);
	hashigh(s);
}
public static void high(String s)
{
	char[] c = s.toCharArray();
	int count = 0;
	int maxcount = 0;
	String result = "";
	for(int i=0; i<s.length(); i++)
	{
		count = 0;
		for(int j=i+1; j<s.length(); j++)
		{
			if(c[i] == c[j])
			{
				count++;
			}
		}
		if(maxcount<count)
		{
			maxcount = count;
			result = null;
			result = "" + c[i];
		}
	}
	System.out.println(result);
}

public static void hashigh(String s)
{
	Map<String, Integer> mp = new HashMap<String, Integer>();
	String s2 = "";
	String result = "";
	int maxcount = 0;
	//char[] c = s.toCharArray();
	for(int i =0; i<s.length(); i++)
	{
		s2= ""+ s.charAt(i);
		if(!mp.containsKey(s2))
		{
			
			mp.put(s2, 1);
			
		}
		else
		{
			
			int num = mp.get(s2);
			mp.put(s2, num+1);
			
		}
	}
	System.out.println(mp);
	for(String s3: mp.keySet())
	{
		int count = mp.get(s3);
		if(maxcount<count)
		{
			maxcount = count;
			result = null;
			result = "" + s3;
		}
	}
	System.out.println(mp);
	System.out.println(result);
}

}
