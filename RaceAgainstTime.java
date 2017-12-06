import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int count=0;
        String out="NO";
        int h=sc.nextInt();
int m=sc.nextInt();
int s=sc.nextInt();
int t1=sc.nextInt();
int t2=sc.nextInt();
        if(t1>t2){
        int temp=t1;
        t1=t2;
        t2=temp;
        }
        if(t1<=h && h<t2) count++;
        if(t1<=(double)m/5 && (double)m/5<t2) count++;
        if(t1<(double)s/5 && (double)s/5<t2) count++;

        if(count==0 || count==3)
            out="YES";
        System.out.println(out);
    }
}
