
public class nonrepeatind {
public static void main(String[] args)
{
	String s = "arrabbicc iiv";
	System.out.println(findnonrepeat(s));
}
public static char findnonrepeat(String s)
{
	char c = ' ';
	for(int i = 0; i<s.length(); i++)
	{
		if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
		{
			return s.charAt(i);
		}
		else
		{
			continue;
		}
	}
	return c;
}
}
