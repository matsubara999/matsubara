import java.util.Scanner;

public class Abc087b {
	public static void main(String[] args) {
		int result = 0;
		int a;
		int b;
		int c;
		int x;
		try (Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			x = scan.nextInt();
		}

		Integer aAmount = 500 * a;
		Integer bAmount = 100 * b;
		Integer cAmount = 500 * c;
		Integer sum = aAmount + bAmount + cAmount;
		if (x > sum) {
			System.out.println(result);
			return;
		}

		for (int i = 0; i <= a; i++) {

			for (int j = 0; j <= b; j++) {

				for (int k = 0; k <= c; k++) {
					if (x - i * 500 - j * 100 == k * 50) {
						result++;
					}

				}
			}

		}

		System.out.println(result);

	}

}
