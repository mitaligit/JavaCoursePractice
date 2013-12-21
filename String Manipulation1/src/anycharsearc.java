
public class anycharsearc {
public static void main(String[] args)
{
	String[] st = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", "tim"};
	String s = "tim";
	System.out.println(charsearc(st, s));
}
public static String charsearc(String[] st, String s)
{
	int min = 0;
	int max = st.length - 1;
	while(min<=max)
	{
		int mid = (min+max)/2;
		if(st[mid].compareTo("")==0)
		{
			while(st[mid].compareTo("")==0 && mid>min)
			{
				mid = mid - 1;
			}
			if(st[mid].compareTo("")==0)
			{
				while(st[mid].compareTo("")==0 && mid<max)
				{
					mid = mid+1;
				}
			}
		}
		if(st[mid].compareTo(s) <0)
		{
			min = mid+1;
		}
		else if(st[mid].compareTo(s) >0)
		{
			max = mid-1;
		}
		else
		{
			return st[mid];
		}
	}
	return null;
}
}
