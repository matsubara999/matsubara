import java.util.Scanner;

/**
 * 文字列Sが "dream", "dreamer", "erase", "eraser"からなる文字列であるか判定する
 * 
 *
 */

public class Abc049c {
	
	final private String S; /*文字列S*/

	/**
	 * mainメソッド
	 * 実行用
	 * @param args
	 */
	public static void main(String[] args) {
		Abc049c abc049c = new Abc049c();
		abc049c.exec();
	}

	/*
	 * 値入力
	 */
	private Abc049c() {
		try (Scanner sc = new Scanner(System.in)) {
			S = sc.nextLine();
		}
	}

	/*
	 * 処理記述
	 */
	private void exec() {
		String s;
		s = S;

		while (!(s.equals(s))) {
			if (s.endsWith("dream")) {
				s = s.substring(0, s.length() - 4);
			} else if (s.endsWith("dreamer")) {
				s = s.substring(0, s.length() - 6);
			} else if (s.endsWith("erase")) {
				s = s.substring(0, s.length() - 4);
			} else if (s.endsWith("eraser")) {
				s = s.substring(0, s.length() - 5);
			} else {
				System.out.println("NG");
				return;
			}

		}

		System.out.println("YES");
	}

}