import java.util.Scanner;

public class PolycarpLetters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		String str = sc.next();		
		int max = 0;
		int count = 0;
		int set = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLowerCase(c)) {
				if((set & (1 << (c - 'a'))) == 0) {
					count++;
					set |= 1 << (c - 'a');
					max = Math.max(max, count);
				}
			} else {
				set = 0;
				count = 0;
			}
		}
		
		System.out.println(max);
		
	}
	
}