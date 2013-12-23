import java.util.ArrayList;


public class allnum {
	public static void main(String[] args) throws Exception
	{
		int[] a = {1,2,3,4};
		ArrayList<Integer> l = new ArrayList<Integer>();
		if(a.length == 0)
		{
			throw new Exception("nothing");
		}
		else
		{
		for(int num: a)
		{
			l.add(num);
		}
		int n = l.size();
		ArrayList<Integer> ch = new ArrayList<Integer>();
			uniqu(l,ch, n);
		}
	}
	public static void uniqu(ArrayList<Integer> l,ArrayList<Integer> ch, int n)
	{
		if(l.size() >n-3)
		{
			for(int i = 0; i<ch.size(); i++)
			{
				System.out.print(ch.get(i));
			}
			System.out.println("");
		}
		
			for(int j = 0; j<l.size(); j++)
			{
				int k = l.get(j);
				l.remove(j);
				ch.add(k);
				uniqu(l, ch, n);
				l.add(j, k);
				ch.remove(ch.size()-1);
			}
	}
}
