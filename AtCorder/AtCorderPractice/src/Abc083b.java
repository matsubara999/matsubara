
import java.util.Scanner;

public class Abc083b {

	public static void main(String[] args) {
		int n;
		int a;
		int b;
		int result = 0;

		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			a = scan.nextInt();
			b = scan.nextInt();
		}

		for (Integer i = a; i <= n; i++) {
			String str = i.toString();
			String[] strArray = str.split("");
			int sum = 0;
			for (String s : strArray) {
				sum += Integer.parseInt(s);
			}
			if (a <= sum && sum <= b) {
				result += i;
			}

		}
		System.out.println(result);
	}
}
