package AssignmentPw;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int length;
			System.out.print("Enter the length : ");
			length=sc.nextInt();
			int breadth;
			System.out.print("Enter the breadth : ");
			breadth=sc.nextInt();
			if(length==breadth)
			{
				System.out.print("It is a square");
			}else{
				System.out.print("It is not a square");
			}
		}
	}
}


