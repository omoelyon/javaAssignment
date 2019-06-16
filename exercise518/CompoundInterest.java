package exercise518;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter principal: ");
		int principal = input.nextInt() * 100;
		System.out.println("enter number of years: ");
		int years = input.nextInt();
		System.out.println("enter rate: ");
		double rate = input.nextDouble()/100;
		
		int amount = 0;
		for (int i = 1; i<=years; i++) {
			amount = (int) (principal * Math.pow((1+rate), i));
			int cents = amount % 100;
			int dollars = amount /100;
			System.out.println(dollars+"."+cents);
			
		}
	}

}
