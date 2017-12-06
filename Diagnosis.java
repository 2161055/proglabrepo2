// Problem 879A
import java.util.*;
public class Diagnosis{
	
	public static void main(String args[])	{
		
		Scanner kbd = new Scanner(System.in);
		int output = 0;
	
		int c = kbd.nextInt();
		
		while(c>0)	{
		c--;

		int a = kbd.nextInt();
		int b = kbd.nextInt();
		
		if( a > output ){
			output = a;
			continue;
		}
			int k = 1;
			while( a + k * b <= output)
			k++;
			output = a + k * b;
		}
		System.out.println(output);
	}
}