package atcorder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Abc088b {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(scan.nextInt());
			}

			Collections.sort(list, Collections.reverseOrder());

			int aliceSum = 0;
			for (int i = 0; i < n; i = i + 2) {
				aliceSum += list.get(i);
			}
			int bobSum = 0;
			for (int i = 1; i < n; i = i + 2) {
				bobSum += list.get(i);
			}

			System.out.println(aliceSum - bobSum);
		}
	}
}
