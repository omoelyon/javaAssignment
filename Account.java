 // Account class with a double instance variable balance and a constructo
 // and deposit method that perform validation.

 public class Account {
    private String name; // instance variable
    private double balance; // instance variable

     // method that deposits (adds) only a valid amount to the balance
     public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
        balance = balance + depositAmount; // add it to the balance
        }
     }
    
     // method returns the account balance
     public double getBalance() {
            return balance;
     }
    
     // method that sets the name
        public void setName(String name) {
            this.name = name;
        }

// method that returns the name
        public String getName() {
        return name;
        }

        public void withdraw(int amount){
            if (amount <= balance){
                balance = balance - amount;
                System.out.print(balance);
            }
            if (amount > balance){
                System.out.print("insufficient balance");
            }
        }
}