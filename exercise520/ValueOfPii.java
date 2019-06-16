package exercise520;
import java.util.Scanner;
public class ValueOfPii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter nth values: ");
		int n =input.nextInt();
		double pii = 4;
		double test = 4;
		for (int i=7; i>n; i++) {
			System.out.println("i = "+i);

			int power = (int) (Math.pow((-1), i));
			int arit = (2*i+1);
			double divide =(double) 4.0/arit;

			
			test =  test + (power * divide);
			System.out.println("test = "+test);
			if(test == 3.142857142857143) {
				break;
			}
			
			System.out.println();
		}
		double tac = 22.000/7.000;
		System.out.println(tac);
//		System.out.println(pii);
		
	}

}
