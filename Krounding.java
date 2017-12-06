import java.util.Scanner;

public class Krounding {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextInt();
        long t = 1;
        for (int i =0;i < k;i++){
            t= t* 10;
        }
        System.out.print(n*t/gcd(t,n));
    }
    public static long gcd(long a, long b){
        while (a != 0 && b!= 0 ){
            if (a >b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        return a+b;
    }
}