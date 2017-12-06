// Problem 876A
import java.util.Scanner;

public class TripForMeal {
		
	public static void main(String[] args) {
		Scanner kbd =new Scanner (System.in);
		
		int n = kbd.nextInt()-1;
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		int c = kbd.nextInt();
		int s = Math.min(a, b);
		int r = 0;
		if( n == 0 )
			r = 0;
		else
			
		if( s <= c )
			r = n * s;
		else
			r = s+ c*( n-1 );
		
	System.out.println(r);
	}
}