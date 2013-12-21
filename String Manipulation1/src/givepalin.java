import java.util.*;
public class givepalin {
	public static void main(String[] args)
	{
		String str1 = "dfdfd" ; //"abcicbbcdefggfed";
		System.out.println(isplain(str1));
	}
	public static ArrayList<String> isplain(String str1)
	{
		if(str1 == null)
		{
			return null;
		}
		char[] s1 = str1.toCharArray();
		int count = 0;
		int j = 0;
		int k = 0;
		int maxcount = 0;
		String tmp = "";
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i = 0; i<str1.length()-1; i++)
		{
			count = 0;
			tmp = "";
			if(s1[i] == s1[i+1])
			{
				j = i;
				k = i+1;
				
				while(k<str1.length() && j>=0 && s1[j]== s1[k])
				{
					tmp = "" + s1[j] + tmp + s1[k];
					j--;
					k++;
					count = count+2;
				}
				l.add(tmp);
			}
			
			if(i>0 && s1[i-1] == s1[i+1])
			{
				j = i-1;
				k = i+1;
				tmp = "" + s1[i];
				
				while(k<str1.length() && j>=0 && s1[j]== s1[k])
				{
					tmp = "" + s1[j] + tmp + s1[k];
					j--;
					k++;
					count = count+2;
				}
				l.add(tmp);
			}
			if(maxcount<count)
			{
				maxcount = count;
			}
				
			
		}
		return l ;
	}
}
