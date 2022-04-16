package atcorder;
import java.util.Scanner;

/**
 * oとxのみからなる文字列Sが文字列T(oxxoxx...)の部分文字列であるかを判定する
 * 
 *
 */
public class B_triplemetal {
	final private String S;
	final private String PATTERN = "oxxoxxoxxoxx";

	/**
	 * mainメソッド 実行する
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		B_triplemetal triplemetal = new B_triplemetal();
		triplemetal.exec();

	}

	/**
	 * コンストラクタ 標準入力から初期値を設定する
	 */
	private B_triplemetal() {
		try (Scanner scan = new Scanner(System.in)) {
			S = scan.nextLine();
		}
	}

	/**
	 * PATTERNに文字列Sが含まれているかを判定し、結果を出力する
	 */
	private void exec() {
		if (PATTERN.contains(S)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
