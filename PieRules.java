import java.util.Scanner;


public class PieRules {
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int [n+1];
			int sum[] = new int[n+1];
			for(int i = 0;i<n;i++){
				a[i] = in.nextInt();
			}
			sum[n] = 0;
			int dp[] = new int [n+1];
			for(int i = n-1;i>=0;i--){
				sum[i] = sum[i+1]+a[i];
				dp[i] = Math.max(dp[i+1], sum[i+1]-dp[i+1]+a[i]);
			}
			System.out.println((sum[0]-dp[0])+" "+dp[0]);
		}
}
