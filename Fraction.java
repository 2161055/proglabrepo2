import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 2 == 1){
            System.out.println((num / 2) + " " + (num / 2 + 1));
        } else {
            if ((num / 2) % 2 == 1) {
                System.out.println((num / 2 - 2) + " " + (num / 2 + 2));
            } else {
                System.out.println((num / 2 - 1) + " " + (num / 2 + 1));
            }
        }
    }
}