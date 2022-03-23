import java.util.Scanner;

/*
 * 10000円札、5000円札、1000円札をN枚使用して、合計金額Y円になる組み合わせを求める
 */
public class Abc085c {

	final private int N;
	final private int Y;

	/*
	 * mainメソッド
	 * 実行用
	 */
	public static void main(String[] args) {
		Abc085c abc085c = new Abc085c();
		abc085c.exec();

	}

	/*
	 * 条件入力
	 */
	private Abc085c() {
		try (Scanner scan = new Scanner(System.in)) {
			N = scan.nextInt();
			Y = scan.nextInt();
		}
	}

	/*
	 * 処理
	 */
	private void exec() {
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;

		for (a = 0; a <= N; a++) {

			for (b = 0; b <= N; b++) {
				
				
				sum =  a * 10000 + b * 5000 + (N - (a + b)) * 1000;
				
				if (Y == sum && N == a + b + c) {
					System.out.println(a + "," + b + "," + c);
					return;
				}

			}
		}

		System.out.println(-1 + "," + -1 + "," + -1);
	}
}
