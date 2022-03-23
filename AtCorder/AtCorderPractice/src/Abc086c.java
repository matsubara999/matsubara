import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1以上N以下の各点が与えられる。各点ごとに時刻t,座標(x,y)が存在する。
 * 時刻が1過ぎるごとに、xまたはyを1移動しなければいけない。
 * 各座標をt時点で訪れるか判定する。
 */
public class Abc086c {

	final private int N;
	final private List<Integer> T;
	final private List<Integer> X;
	final private List<Integer> Y;

	/*
	 * mainメソッド
	 * 実行用
	 */
	public static void main(String[] args) {
		Abc086c abc086c = new Abc086c();
		abc086c.exec();

	}

	/*
	 * 条件入力
	 */
	private Abc086c() {

		try (Scanner scan = new Scanner(System.in)) {
			N = scan.nextInt();
			T = new ArrayList<>();
			X = new ArrayList<>();
			Y = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				T.add(scan.nextInt());
				X.add(scan.nextInt());
				Y.add(scan.nextInt());
			}
		}
	}

	/*
	 * 処理
	 */
	private void exec() {
		int pTime = 0;
		int time = 0;
		int pX = 0;
		int pY = 0;
		int distance = 0;

		for (int i = 0; i < N; i++) {
			int t = T.get(i);
			int x = X.get(i);
			int y = Y.get(i);

			time = t - pTime;
			distance = Math.abs(x - pX) + Math.abs(y - pY);

			if (time < Math.abs(distance)) {
				System.out.println("NG");
				return;
			}

			if (time % 2 == 0 && distance % 2 == 0) {
				pTime = t;
				pX = x;
				pY = y;
				continue;
			} else if (time % 2 == 1 && distance % 2 == 1) {
				pTime = t;
				pX = x;
				pY = y;
				continue;
			} else {
				System.out.println("NG");
				return;
			}

		}

		System.out.println("OK");
	}

}
