// creating and manipulating an account object
import java.util.Scanner ;

public class AccountTest {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	Account myAccount = new Account();

	System.out.println("Please enter amount:"); 
	int amount = input.nextInt();
	myAccount.withdraw(amount);

	System.out.println();

	
	}
   }