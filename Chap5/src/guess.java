import java.util.Random;
public class guess {
	public static void main(String[] args)
	{
	Random r = new Random();
	int gueses = 0;
	int count=0;
	
	while(gueses <= 48)
	{
		gueses = r.nextInt(50) + 1;
		System.out.print("guess=" + gueses);
		
			
		
		if ( gueses == 48) {
			return;
		}
		System.out.println("");
		count++;
		
	}
}
}
