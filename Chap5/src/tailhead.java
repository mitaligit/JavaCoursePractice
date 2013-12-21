import java.util.Random;


public class tailhead {
public static void main(String[] args)
{
	Random r1= new Random();
	int num;
	int count=0;
	
	while(count <3)
	{
		
	num = r1.nextInt(2)+1;
		
		if (num==2)
		{
			System.out.print("H");
			count++;
		}
		else
		{
			System.out.print("T");
			count=0;
		}
	}
	System.out.println(" ");
	System.out.println("Three heads in a row");
}
}
