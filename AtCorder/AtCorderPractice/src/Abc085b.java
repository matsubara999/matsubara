import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Abc085b {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			List<Integer> d = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				d.add(scan.nextInt());
			}
			
			List<Integer> resultSet = new ArrayList<Integer>(new HashSet<>(d));
			System.out.println(resultSet.size());
		}
	}
}
