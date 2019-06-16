package factorials;
import java.util.Scanner;

public class Factorials {

	public long displayFactorial(int  number) {
		System.out.print("n \t n! \n");
		long factorial = 1;
		for (int counter = 1; counter <= number; counter++) {
			factorial *= counter;
			System.out.printf("%d\t%s%n", counter, factorial);
		}
		return factorial;
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Factorials obj = new Factorials();
		obj.displayFactorial(20);
		
		

	}

}
