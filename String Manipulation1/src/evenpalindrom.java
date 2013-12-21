
public class evenpalindrom {
	public static void main(String[] args)
	{
		String str1 = "abcicbbcdefggfed";
		System.out.println(isplain(str1));
	}
	public static int isplain(String str1)
	{
		if(str1 == null || str1.isEmpty())
		{
			return 0;
		}
		char[] s1 = str1.toCharArray();
		int count = 0;
		int j = 0;
		int k = 0;
		int maxcount = 0;
		
		for(int i = 0; i<str1.length()-1; i++)
		{
			count = 0;
			if(s1[i] == s1[i+1])
			{
				j = i;
				k = i+1;
				
				while(k<str1.length() && j>=0 && s1[j]== s1[k])
				{
					j--;
					k++;
					count = count+2;
				}
			}
			if(maxcount<count)
			{
				maxcount = count;
			}
				
			
		}
		return maxcount;
	}
}
