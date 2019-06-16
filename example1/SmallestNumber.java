package example1;
import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number = 0;
		int smallest = 2147483647;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integers you want to compare: ");
		int amount = input.nextInt();
		
		for(int i =0; i< amount; i++) {
			System.out.println("Enter numbers to compare: ");
			int number = input.nextInt();
			if(smallest == 0){
				
			}
			
			if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("smallest number is "+ smallest);

	}

}
