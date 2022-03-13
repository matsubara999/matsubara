import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Abc081b {
	public static void main(String[] args) {
		List<Integer> evens = new ArrayList<>();
		int result = 0;
		int num;
		try (Scanner scan = new Scanner(System.in)) {
			num = scan.nextInt();
			// 標準入力nの数だけ標準入力aを取得する
			for (int i = 0; i < num; i++) {
				Integer a = scan.nextInt();
				// aの値が偶数の場合のみ処理を続ける
				if (a % 2 == 0) {
					evens.add(a);
				} else {
					System.out.println(result);
					return;
				}
			}

		}
		for (int i = 0; i < num; i++) {
			for (int x = 0; x < evens.size(); x++) {
				Integer even = evens.get(x);
				if (even % 2 == 0) {
					evens.set(x, even / 2);
				} else {
					System.out.println(result);
					return;
				}
			}
			result++;
		}
		System.out.println(result);
	}
}
