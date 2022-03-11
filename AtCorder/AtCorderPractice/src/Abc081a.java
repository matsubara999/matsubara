import java.util.Scanner;

public class Abc081a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		int sum = 0;
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			sum += Character.getNumericValue(chars[i]); 
		}
		
		System.out.println(sum);
	}
}