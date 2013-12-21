import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class bigtextfile 
{
public static void main(String[] args) throws FileNotFoundException
{
	Scanner input = new Scanner(new File("tas.txt"));
	distinct(input);
}
public static void distinct(Scanner input)
{
	String s;
	int n;
	int num;
		Map<String, Integer> mp1 = new TreeMap<String, Integer>();
		ArrayList<bigtest> a1 = new ArrayList<bigtest>();
		ArrayList<bigtest> a2 = new ArrayList<bigtest>();
		Map<String, Integer> mp2 = new TreeMap<String, Integer>();
		while(input.hasNext())
		{
			s = input.next();
			n = input.nextInt();
			//System.out.println(s);
			//System.out.println(n);
			mp1.put(s, n);
			a1.add(new bigtest(s,n));
		}
		Collections.sort(a1);
		for(int i= a1.size()-1; i> a1.size()-11; i--)
		{
			System.out.println(a1.get(i));
		}
		//System.out.println(a1);
		System.out.println(mp1);
		/*for(String s1: mp1.keySet())
		{
			char[] c = s1.toCharArray();
			for(int i =0; i<s1.length(); i++)
			{
				String s2 = "" + c[i];
				if(!mp2.containsKey(s2))
				{
					mp2.put(s2, 1);
				}
				else
				{
					int oldvalue = mp2.get(s2);
					mp2.put(s2, oldvalue+1);
				}
				
			}
			
		}
		System.out.println(mp2);*/
		for(String s1: mp1.keySet())
		{
			char[] c = s1.toCharArray();
			num = mp1.get(s1);
			for(int i =0; i<s1.length(); i++)
			{
				String s2 = "" + c[i];
				if(!mp2.containsKey(s2))
				{
					mp2.put(s2, num);
				}
				else
				{
					int oldvalue = mp2.get(s2);
					mp2.put(s2, oldvalue+num);
				}
				
			}
			
		}
		System.out.println(mp2);
		for(String s1: mp2.keySet())
		{
			String s2 = s1;
			int num2 = mp2.get(s2);
			a2.add(new bigtest(s2,num2));
		}
		Collections.sort(a2);
		for(int j= a2.size()-1; j> a2.size()-11; j--)
		{
			System.out.println(a2.get(j));
		}
}

}
