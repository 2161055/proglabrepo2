import java.util.*;

public class MaxofMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        if (k == 1) {
            System.out.print(Collections.min(list));
        }
        else if (k == 2) {
            System.out.print(Math.max(list.get(0), list.get(n-1)));
        }
        else {
            System.out.print(Collections.max(list));
        }
    }
}