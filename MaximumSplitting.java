import java.io.*;
import java.util.*;

public class MaximumSplitting {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int q = input.nextInt();
		
		for (int i = 0; i < q; i++) {
            int num = input.nextInt();
            if (num<=3 || num==5 || num==7 || num==11) {
                System.out.println(-1);
            } else {
                int ans = 0;
                if (num % 2 == 1) {
                    num -= 9;
                    ans++;
                }
                if (num % 4 == 2) {
                    num -= 6;
                    ans++;
                }
                ans += num / 4;
                System.out.println(ans);
            }
        }
    }
}