
public class fibonacci {
public static void main(String[] args)
{
	
	for(int n = 0; n<=10; n++)
	{
	int k = fib(n);
	System.out.print(k + " ");
	}
}
	public static int fib(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	   {
		  return fib(n - 1) + fib(n - 2);
		  
	   }
	      
	}
}
