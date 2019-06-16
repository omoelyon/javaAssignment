package exercise514;
import java.util.Scanner;
public class CompoundInterest {
Scanner input = new Scanner(System.in);
	
	private int  numberOfYear;
	private double amountDeposit;

	private double principal;
	
	
	
	public  double calculateCompoundInterest() {
		
		System.out.println("Please enter your principal");
		principal = input.nextDouble();
		
		System.out.println("Please enter your annua lInterest Rate");
		double annualInterestRate = (double) input.nextInt()/100;
		
		
		System.out.println("Please enter your number of year");
		numberOfYear = input.nextInt();
		
			
		for ( int counter = 1; counter <= numberOfYear; counter++){
			
 			amountDeposit= principal * Math.pow(1.0 + annualInterestRate, counter);
 			 
 			System.out.println(counter + "\t" + "" +  "\t" + amountDeposit);
		}
			
			return  amountDeposit;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
