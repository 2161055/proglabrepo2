import java.util.Scanner;
public class chores{ 

public static void main(String args[]){
	int i,sum=0;
	Scanner s=new Scanner(System.in);
  	int n=s.nextInt();
   	int k=s.nextInt();
  	int x=s.nextInt();
	if (n==0)
	System.out.println(0);
	else{  
	   for(i=0; i<n-k; i++)
	   sum=sum+s.nextInt();
	  sum=sum+(k*x);
	  System.out.println(sum);
}
}
}