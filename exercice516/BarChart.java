package exercice516;
import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		for(int i =1; i<=10 ; i++) {
			System.out.println();
		System.out.println("Enter value for barchart : ");
		int num = input.nextInt();
		if (num>= 0 && num <= 100) {
			System.out.print(num);
			for (int j = 1 ; j<=num ; j++) {
				System.out.print("*");
			}
		}
		else {
			System.out.print("invalid input");
		}
		
		
//		if (num>=1 && num<=30) {
//			
//				
//			}
		}

	}

}
