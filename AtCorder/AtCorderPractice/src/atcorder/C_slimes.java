package atcorder;
import java.util.Scanner;

/**
 * 文字列Sを隣接する同じ文字は一つにまとめた文字数を出力する
 * 
 *
 */
public class C_slimes {
	final private int N;
	final private String S;

	public static void main(String[] args) {
		C_slimes slimes = new C_slimes();
		slimes.exec();
	}

	/**
	 * 標準入力から初期値を設定する
	 */
	private C_slimes() {
		try (Scanner scan = new Scanner(System.in)) {
			N = scan.nextInt();

			S = scan.next();

		}
	}

	/**
	 * 文字列Sを1文字ずつ取得して、ひとつ前の文字と異なる場合はカウントする。
	 */
	private void exec() {
		String preS = "";
		int result = 0;

		for (int i = 0; i < N; i++) {

			String currentS = String.valueOf(S.charAt(i));
			if (!(preS.equals(currentS))) {
				result++;
			}

			preS = currentS;

		}

		System.out.println(result);
	}
}
