import java.util.*;
public class vowel {
	public static void main(String[] args)
	{
		String s = "i think, therefore i am";
		int[] result = vowelCount(s);
		System.out.println(Arrays.toString(result));
	}
public static int[] vowelCount(String s)
{
	int[] a1 = new int[5];
	int counta =0;
	int counte =0;
	int counti =0;
	int counto =0;
	int countu =0;
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i) == 'a')
		{
			counta++;
		a1[0]= counta;
		}
		else if(s.charAt(i) == 'e')
		{
			counte++;
		a1[1]= counte;
		}
		else if(s.charAt(i) == 'i')
		{
			counti++;
		a1[2]= counti;
		}
		else if(s.charAt(i) == 'o')
		{
			counto++;
		a1[3]= counto;
		}
		else if(s.charAt(i) == 'u')
		{
			countu++;
		a1[4]= countu;
		}
	}
	return a1;
	
}
}

