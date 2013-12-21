import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class revquick {
public static void main(String[] args)
{
	String s = "quick brown fox";
	System.out.println(s);
	rev(s);
}
public static void rev(String s)
{
	String[] arr = s.split(" ");
	String n = "";
	for(int i = 0; i<arr.length; i++)
	{
		String tmp = "";
		String wd = arr[i];
		//StringBuilder str = new StringBuilder(arr[i]);
		//arr[i] = str.reverse().toString();
		for(int j = wd.length()-1; j>=0; j--)
		{
			tmp = tmp+wd.charAt(j);
		}
		arr[i] = tmp;
		n = n+tmp+ " ";
	}
	
	System.out.println(n);
	System.out.print(Arrays.toString(arr));
}
}
