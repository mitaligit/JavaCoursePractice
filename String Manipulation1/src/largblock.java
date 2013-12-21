
public class largblock {
public static void main(String[] args)
{
	String s = "vfdaaafgggbbb";
	startblock(s);
}
public static void startblock(String s)
{
	int count = 1;
	int maxcount = 1;
	int startindex = 0;
	int i = 0;
	for (i = 0; i < s.length() - 1; i++) {
			if (maxcount < count) {
				maxcount = count;
				startindex = i - count + 1;
			}
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				count = 1;
			}
		}
	/*if(maxcount<count)
	{
		maxcount = count;
		startindex = i-count;
		count = 0;
	}*/
	System.out.println(startindex);
}
}
