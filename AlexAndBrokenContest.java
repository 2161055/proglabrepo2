import java.util.Scanner;

public class AlexAndbrokencontest {

	// 18:55-
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] ss = {"Danil", "Olya", "Slava", "Ann", "Nikita"};
		int hits = 0;
		for (int i=0 ; i<=4 ; i++){
			String name=ss[i];
			int pos = 0;
			while ((pos = s.indexOf(name, pos)) != -1) {
				hits++;
				pos++;
			}
		}

		System.out.println(hits == 1 ? "YES" : "NO");
	}
}