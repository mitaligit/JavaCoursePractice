import java.util.*;
public class randomline {
public static void main(String[] args)
{
	Random r = new Random();
	//int line =0;
	int num = 0;
	
	while(num <= 16)
	{
		num = r.nextInt(15) + 5;
		System.out.print(num);
		for(int i=0; i<=num; i++)
		{
			System.out.print("x");
		}
		/*if ( num == 16) {
			return;
		}*/
		System.out.println("");
		
	}
	
}
}
