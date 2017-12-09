import java.util.Scanner;
public class FairGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	int num=scan.nextInt();
	int c=0;
	int[] A = new int[101];
	int[] C = new int[num];
	for(int i=0;i<num;i++){
	   int a=scan.nextInt();
	   if(A[a]==0) C[c++]=a;
	   A[a]++;
	}
	if(c==2&&C[0]!=C[1]&&A[C[0]]==num/2&&A[C[1]]==num/2){
	   System.out.println("YES");
	   System.out.println(C[0]+" "+C[1]);
	}else {
	System.out.println("NO");
	}
    }
}