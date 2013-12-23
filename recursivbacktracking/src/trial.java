
public class trial {
public static void main(String[] args)
{
	String s = "abc";
	String chosen = "";
	permute(s, chosen);
}
public static void permute(String s, String chosen)
{
	if(s.length() == 0)
	{
		System.out.println(chosen);
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
			permute(s, chosen);
			s = tmp;
			chosen = tmp1;
		}
	}
}
}
