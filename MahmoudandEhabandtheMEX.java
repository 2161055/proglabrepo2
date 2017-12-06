import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int num = scan.nextInt();
		int mex = scan.nextInt();
		int ans = 0;
		for (int i=0; i<num; i++) {
			int input = scan.nextInt();
			if (input < mex) {
				ans++;
			}
			if (input == mex) {
				ans--;
			}
		}
		System.out.println(mex-ans);
	}

}
