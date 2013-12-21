
public class zigrev {
	public static void main(String[] args)
	{
		String str = "Mitali is a software programmer";
		String s = "";
		String s3 = "";


		for(int i = str.length() - 1; i>=0; i--)
		{
			s = s+str.charAt(i); 

		}
		System.out.println(s);
		String[] s1 = s.split(" ");
		for(int k = 0; k<s1.length; k++) {
			if(k%2 == 0)
			{
				String wd = s1[k];
				for(int m = wd.length()-1; m>=0; m--)
				{
					s3 = s3+wd.charAt(m);
				}
				s3 = s3 + " ";
			}
			else
			{
				s3 = s3+s1[k]+ " ";
			}

		}
		System.out.println(s3);
	}
}

