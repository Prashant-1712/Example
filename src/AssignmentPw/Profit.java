package AssignmentPw;

import java.util.Scanner;
public class Profit{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Cost Price : ");
			int costprice=sc.nextInt();
			System.out.print("Enter the Selling Price : ");
			int sellingprice=sc.nextInt();
			int amt;
			if(costprice>sellingprice)
			{
				amt=costprice-sellingprice;
				System.out.print("The loss is : "+amt);
			}else if(costprice<sellingprice)
			{
				amt=sellingprice-costprice;
				System.out.print("The profit is : "+amt);
			}else{
				System.out.print("No Profit No Loss");
			}
		}
	}
}