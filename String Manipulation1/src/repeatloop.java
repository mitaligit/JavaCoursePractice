
public class repeatloop {
	public static void main(String[] args)
	{
		String s = "arabbicc";
		System.out.println(findnonrepeat(s));
	}
	public static char findnonrepeat(String s)
	{
		char c = ' ';
		for(int i=0; i<s.length(); i++)
		{
			for(int j = 0; j<s.length(); j++)
			{
				if(i==j)
				{
					continue;
				}
				else if(s.charAt(i) == s.charAt(j))
				{
					break;
				}
				
				else if(j == s.length()-1 && s.charAt(i) != s.charAt(j)) 
				{
					return s.charAt(i);
				}
			}
		}
		return c;
	}
}
