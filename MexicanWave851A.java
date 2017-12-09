import java.util.*;
public class MexicanWave851A {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int n = kbd.nextInt();
        int k = kbd.nextInt();
        int t = kbd.nextInt();

        if (t <= k) {
            System.out.print(t);
        } else if (t > k && t <= n) {
            System.out.print(k);
        } else System.out.print(n + k - t);
    }
}
