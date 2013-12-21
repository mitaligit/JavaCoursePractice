import java.util.*;
public class perfectsqornt {
public static void main(String[] args)
{
	Scanner sn = new Scanner(System.in);
	System.out.println("enter num");
	int n = sn.nextInt();
	sqornt(n);
}
public static void sqornt(int n)
{
	int i = 1;
	int k = 3;
	while(i<=n)
	{
		if(i==n)
		{
			System.out.println("is equal" + Math.sqrt(i));
			break;
		}
		else
		{
			i = i+k;
			k = k+2;
		}
			
	}
	if(i!=n)
	{
		System.out.println("Num not equal");
	}
	
}

}
