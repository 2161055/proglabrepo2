
import java.util.Scanner;
import java.util.ArrayList;


public class classroomwatch{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int temp = 0;
        int out = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i >= 0; i--) {
            temp = num - i;
            if (num - i < 0) {
                continue;
            }
            if (temp + digit_sum(temp) == num) {
                out++;
                list.add(temp);
            }
        }
        System.out.println(out);
        for (int i : list) {
            System.out.println(i);
        }
        scan.close();
    }

      public static int digit_sum(int num) {
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}