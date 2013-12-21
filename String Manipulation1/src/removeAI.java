
public class removeAI {
public static void main(String[] args)
{
	String s ="AABSDHIJHISDEAALKFIJJA";
	System.out.println( s.substring(0,0));
	remoa(s);
		
}
public static void remoa(String s)
{
	for(int i =0; i<s.length(); i++)
	{
		if(s.charAt(i)=='A' || s.charAt(i)=='I')
		{
			s = s.substring(0,i)+ s.substring(i+1);
			i--;
			continue;
		}
		else
		{
			continue;
		}
	}
	System.out.println(s);
}
}
