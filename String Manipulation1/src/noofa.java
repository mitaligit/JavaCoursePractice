
public class noofa {
public static void main(String[] args)
{
	String s = "I found an apple a in a tree";
	worda(s);
}
public static void worda(String s)
{
	String[] s1 = s.split(" ");
	String s3 = "";
	int count = 0;
	for(int i =0; i<s1.length; i++)
	{
		s3 = s1[i];
		/*for(int k = 0; k<s3.length(); k++)
		{
			if(s3.charAt(k) !='a')
			{
				break;
			}
			else if(k == s3.length()-1 && s3.charAt(k)== 'a')
			{
				count++;
			}
		}*/
		if(s3.length() == 1 && s3.charAt(0) == 'a')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
