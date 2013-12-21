
public class palindrom {
public static void main(String[] args)
{
	String str1 = "abcicbbcdefggfed";
	System.out.println(isplain(str1));
}
public static boolean isplain(String str1)
{
	char[] s1 = str1.toCharArray();
	int index1 = 0;
	int index2 = 0;
	for(int i = 0; i<str1.length(); i++)
	{
		for(int j = str1.length()-1; j>i; j--)
		{
			if(s1[j] == s1[i])
			{
				index1 = i;
				index2 = j;
				if(s1[index1]==s1[index2])
				{
					index1++;
					index2--;
					if(index1 == index2)
					{
						if(s1[index1] == s1[index2])
						{
							return true;
						}
						
					}
					else if(index1>index2)
					{
						return true;
					}
				}	
				
			}
			
		}
		
	}
	return false;
}
}
