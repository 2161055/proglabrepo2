//877C
import java.util.Scanner;

public class SalvaAndTanks {
	public static void main(String[] args){
		
		Scanner kbd =new Scanner(System.in);
		int i,n,u;
		
		n = kbd.nextInt();
		u = n + n/2;
		
		System.out.println(u);
		
		for ( i = 2 ; i <= n ; i += 2 )
			System.out.print( i + " " );
		for ( i = 1 ; i <= n ; i += 2 )
			System.out.print( i + " " );
		for ( i = 2 ; i <= n ; i += 2 )
			System.out.print( i + " " );
	}
}