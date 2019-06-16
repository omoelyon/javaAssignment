package example1;
import java.util.Scanner;

public class CompoundInterest {
	private int principal;
	private double rate;
	private int years;

	public double power( double rate, int years) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter rate: ");
		rate =(double) input.nextDouble()/100;
		System.out.print("enter years: ");
		int years = input.nextInt();
		System.out.print("enter principal: ");
		int principal = input.nextInt();
		
		
		int answer = 1;
		for(int i = 1; i<= years; i++) {
			answer *= (1+(rate/100));
		}
		return answer;
	}
	
	public double interest(double principal) {
		double interest = power(1 ,1) * principal;	
		return interest;
	}
}
