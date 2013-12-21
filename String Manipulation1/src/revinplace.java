
public class revinplace {
public static void main(String[] args)
{
	String s = "the  quick     brown    mitali fox";
	rev(s);
}
public static void rev(String s)
{
	
	String s1 = "";
	String s2 = "";
	for(int i =0; i<s.length(); i++)
	{
		if(Character.isLetterOrDigit(s.charAt(i)))
		{
				s1 = s1+s.charAt(i);
		}
		if(s.charAt(i) == ' ' || i == s.length()-1)
		{
			
			for(int j = s1.length()-1; j>=0; j--)
			{
				s2 = s2+ s1.charAt(j);
			}
			if(i != s.length()-1)
			{
			s2 += s.charAt(i);
			s1 = "";
			}
		}
	}
	System.out.print(s2);
}
}
