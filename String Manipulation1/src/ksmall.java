
public class ksmall {
public static void main(String[] args)
{
	int[] [] arr = {{2, 5, 8, 10}, 
					{4, 7, 9, 12}, 
					{6, 15, 20, 22}};
	int m = arr.length;
	int n = arr[0].length;
	int count = 0;
	int k = 11;
	//System.out.println(m);
	//System.out.println(n);
	for(int i = 0; i<m; i++)
	{
		for(int j = 0; j<n; j++)
		{
			if(k == count)
			{
				System.out.println(arr[i][j]);
				return;
			}
			else
			{
				count++;
			}
		}
		
	}
}
}
