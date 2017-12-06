import java.util.Scanner;
public class MergeSort { 
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		if(k%2==0 || k>=2*n){
			System.out.println("-1");
		}
		else{
			if(n==1){
				System.out.println("1");
			}
			else{
				int []array=new int[n];
				merge(0,n,k,array,1);
				System.out.print(array[0]);	
				for (int i =1; i <n; i++) {
					System.out.print(" "+array[i]);	
				}
				
			}
		}
	}
	
	public static void merge(int start,int end,int k,int[]a,int num){
		if(k==1){
			for (int i =start; i <end; i++) {
				a[i]=num;
				num++;
			}
		}
		else{
			if(k>1 && start<end){
				k--;
				int temp1=k/2;
				int temp2=k-temp1;
				if(temp1%2==0){
					temp1--;
					temp2++;
				}
				int middle=(start+end)/2;
				merge(middle,end,temp2,a,num);
				merge(start,middle,temp1,a,num+end-middle);
			}
		}
	}
}