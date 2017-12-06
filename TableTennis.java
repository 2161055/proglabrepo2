// Problem 879B
import java.util.Scanner;

public class TableTennis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		long k = sc.nextLong();
		int p = sc.nextInt();
		long c = 0;
		
		for(int i = 1; i < n; i++) {
			int r = sc.nextInt();
			if(r > p) {
				c = 1;
				p = r;
			} else {
				c++;
			}
			if(c >= k) {
				break;
			}
		}
		System.out.println(p);
		
	}
}