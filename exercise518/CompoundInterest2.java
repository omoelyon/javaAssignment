package exercise518;

import java.util.Scanner;

public class CompoundInterest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter principal: ");
		int principal = input.nextInt();
		System.out.println("enter number of years: ");
		int years = input.nextInt();
		System.out.println("enter rate: ");
		int rate =input.nextInt();
		int amount = 0;
		int total = 0;
		
		for (int i=1; i<=years; i++) {
			amount = (int) (principal * (Math.pow(100, (1-i))) * (Math.pow((100+rate), i)));
			
			int cent = amount %100;
			int dollars = amount/100;
			
			
			System.out.println("$"+ dollars +"."+ cent +"cent" );
		}
	}

}
