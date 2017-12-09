import java.util.ArrayList;
import java.util.Scanner;

public class DivisiblityOfDifferences{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++)a[i]=in.nextInt();
		int[] b = new int[100000];
		int stop = 0;
		for(int i = 0;i<n;i++){
			b[a[i]%m]++;
			if(b[a[i]%m]==k){
				break;
			}
			stop=i;
		}
		if(stop==n-1){
			System.out.println("No");
			System.exit(0);
		}
		System.out.println("Yes");
		int s = 0;
		for(int i = 0;i<n;i++){
			if(a[i]%m==a[stop+1]%m&&s<k){
				s++;
				System.out.print(a[i]+" ");
			}
		}
	}
}