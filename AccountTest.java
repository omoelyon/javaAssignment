// creating and manipulating an account object
import java.util.Scanner ;

public class AccountTest {
	public static void main(String[] args){
	// create a scanner object to obtain input from the window
	Scanner input = new Scanner(System.in);
	
	//Create an account object and assign it to myAccount
	Account myAccount = new Account();
	
	// display initial value of name (null)
	// System.out.printf("Initial name id: %s%n%n", myAccount.getName());

	// prompt for and read name
	System.out.println("Please enter the name:"); 
	String theName = input.nextLine(); // read a line of text
	myAccount.setName(theName); //putthe name in myAccount
	System.out.println(); // output a blank line

	// dsplay the name stored in object myAccount
	System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
	}
   }