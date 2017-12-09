import java.util.Scanner;

public class TimeRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		if(t1>t2) {
			int temp=t1; t1=t2; t2=temp; 
		}
		int ctr=0;
		if(t1<=h && h<t2) {
			ctr++;
		}
		if(t1<=(double)m/5 && (double)m/5<t2){
			ctr++;
		}
		if(t1<(double)s/5 && (double)s/5<t2){
			ctr++;
		}
		if(ctr==0 || ctr==3){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

	}
}