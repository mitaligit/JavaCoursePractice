
public class pow2 {
	public static void main(String[] args)
	{
		double[] testNums = { -1111111111 , -100 , -64 , -1, 0 , 1 , 2 ,32, 65, 1024*1024 };

		for ( int i=0;i< testNums.length;i++) {
			boolean result = pow(testNums[i]);
			if(result == true)
			{
				System.out.println("n " + testNums[i] + "is power of 2");
			}
			else
			{
				System.out.println("n " + testNums[i] + "is not a power of 2");
			}

		}
	}
	public static boolean pow(double n) {
		if( n<1) return false;
		boolean flag = true;
		while(n>1)
		{
			if(n%2 !=0)
			{
				flag = false;
				break;
			}
			n = n/2;
		}
		return flag;
	}
}
