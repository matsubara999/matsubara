import java.util.Scanner;

/**
 * 
 * 文字列O,Eを一文字ずつ連結する。Oは奇数番目の文字、Eは偶数番目の文字。
 *
 */
public class B_password {
	final private String O;
	final private String E;

	/**
	 * mainメソッド 実行する
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		B_password bpass = new B_password();
		bpass.exec();
	}

	/**
	 * コンストラクタ 標準入力から初期値を設定する。
	 */
	private B_password() {
		try (Scanner scan = new Scanner(System.in)) {
			O = scan.nextLine();
			E = scan.nextLine();
		}
	}

	/**
	 * 文字列O,Eから1文字ずつ取り出し、結合したものを出力する。
	 */
	private void exec() {
		String result = "";

		for (int i = 0; i < O.length(); i++) {
			result = result + String.valueOf(O.charAt(i));

			if (i < E.length()) {
				result = result + String.valueOf(E.charAt(i));
			}

		}
		System.out.println(result);

	}

}
