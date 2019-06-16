package exercise517;
import java.util.Scanner;

public class CalculatingSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double amount = 0;
		int productNumber = 0;
		
		while(productNumber != -1) {			
			System.out.println("enter product number : ");
			productNumber = input.nextInt() ;
			System.out.println("enter product quantity : ");
			int quantity = input.nextInt();
			switch(productNumber) {
			case 1 :
				amount = amount + (quantity * 2.98);
				break;
			case 2 :
				amount = amount + (quantity * 4.50);
				break;
			case 3 :
				amount = amount + (quantity * 9.98);
				break;
			case 4 :
				amount = amount + (quantity * 4.49);
				break;
			case 5 :
				amount = amount + (quantity * 6.87);
				break;
			default:
				System.out.println("invalid input");
				break;
			}	
		}
		System.out.println(amount);

	}

}
