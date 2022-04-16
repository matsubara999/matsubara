package atcorder;

import java.util.Scanner;

/**
 * 文字列Sが "dream", "dreamer", "erase", "eraser"からなる文字列であるか判定する
 * 
 *
 */

public class Abc049c {
	/** **/
	final private String S;

	/**
	 * mainメソッド 実行する
	 * 
	 */
	public static void main(String[] args) {
		String s;
		try (Scanner sc = new Scanner(System.in)) {
			s = sc.nextLine();
		}

		Abc049c abc049c = new Abc049c(s);
		System.out.println(abc049c.exec());

	}

	/**
	 * コンストラクタ 標準入力から初期値を設定する
	 */
	public Abc049c(String s) {
		S = s;
	}

	/*
	 * Sを後ろから見て指定の文字であるかを判定し、指定の文字であれば削除していく。 すべて削除できた場合のみYESを出力する。
	 */
	public String exec() {
		String s;
		s = S;

		while (!(s.equals(""))) {
			if (s.endsWith("dream")) {
				s = s.substring(0, s.length() - 5);
			} else if (s.endsWith("dreamer")) {
				s = s.substring(0, s.length() - 7);
			} else if (s.endsWith("erase")) {
				s = s.substring(0, s.length() - 5);
			} else if (s.endsWith("eraser")) {
				s = s.substring(0, s.length() - 6);
			} else {
				return "NO";
			}

		}

		return "YES";
	}

}