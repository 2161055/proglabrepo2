import java.util.Scanner;
public class StrangeGameOnMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int k=s.nextInt();
		int [][] matrix=new int[n][m];
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <m; j++) {
				matrix[i][j]=s.nextInt();
			}
		}
		int score=0;
		int moves=0;
		for (int j = 0; j <m; j++) {
			int [][] column=new int[n+1][2];
			int max=1;
			for (int i = 0; i <n; i++) {
				if(matrix[i][j]==1){
					column[i+1][0]=column[i][0]+1;
					int temp=i;
					int cont=k;
					while(temp<n && cont>0){
						column[i+1][1]+=matrix[temp][j];
						temp++;
						cont--;
					}
				}
				else{
					column[i+1][0]=column[i][0];
				}
				if(column[i+1][1]>column[max][1]){
					max=i+1;
				}
			}
			moves+=column[max-1][0];
			score+=column[max][1];
		}
		System.out.println(score+" "+moves);
	}
}