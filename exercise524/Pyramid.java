package exercise524;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter ");
		int stars = input.nextInt();
		int spaces = stars/2;
		for(int i=0;i <= stars; i++) {
			
			for(int a=spaces; a>=i;a--) {
				System.out.print(" ");
			}
			for(int b=0; b<=2*i;b++) {
				System.out.print("*");
			}
			System.out.println();
			if(i >= stars/2) {
				stars--;
				spaces++;
			}
			else {
				stars++;
				spaces--;
			}
		}
	}

}
