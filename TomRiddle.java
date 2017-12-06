/*
    @author LOPEZ, Kimberly T.
    855A - Tom Riddle's Diary
 */
package TomRiddle;
import java.util.Scanner;
public class TomRiddle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("");
        int num = scan.nextInt();
        scan.nextLine();
        String[] word = new String[num];
        String[] ans = new String[num];
        for(int i = 0; i < word.length; i++){
            String l = scan.nextLine();
            word[i] = l;
        }

        for(int i = word.length-1; i >= 0; i--){
            int value = 0;
            if(i == 0){
                ans[i] = "NO";
                break;
            }
            for(int j = i-1; j >= 0; j--){
                if(word[i].equals(word[j])){
                    value = 0;
                    break;
                }else value = 1;
            }
            if(value == 1){
                ans[i] = "NO";
            }else ans[i] = "YES";
        }
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

    }


}
