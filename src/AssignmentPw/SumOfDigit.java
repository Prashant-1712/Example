package AssignmentPw;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int sum = 0;
			while(x > 0){
				sum = sum+x % 10;
				x = x/10;
			}
			System.out.println(sum);
		}
	}
}


