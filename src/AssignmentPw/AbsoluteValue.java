package AssignmentPw;
import java.util.Scanner;
public class AbsoluteValue {

public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
	int num;
	System.out.print("Enter the number : ");
	num=sc.nextInt();
	if(num<0)
	{
	num=num*-1;
	}
	System.out.print("The absolute value is : " + num);
}
}
}


