
public class evenrecur {
public static void main(String[] args)
{
	System.out.print(evens(8342116));
}
public static int evens(int n)
{
	if(n == 0)
	{
		return 0;
	}
	
	
	else if((n%10)%2 != 0)
	{
		return evens(n/10);			
	}
	else if(n<10 && n>=1)
	{
		return n;
	}
	else
	{
		/*if(n<0)	
		{
			return (evens(n/10) *10 + (n%10)) ;
		}*/
		
			
			return(evens(n/10) *10 + (n%10));
			
		
	}
}
}
