package exercise524;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter ");
		int num = input.nextInt();
		
		int spaces = num;
		int stars = 1;
		int mid = num/2;
		for(int i=1;i <= num; i++) {
			
			for(int a=spaces; a>0;a--) {
				System.out.print(" ");
			}
			for(int b=stars; b>0;b--) {
				System.out.print("*");
			}
			System.out.println();
			if(i > num/2) {
				stars-=2;
				spaces++;
			}
			else {
				stars+=2;
				spaces--;
			}
		}
	}

}
