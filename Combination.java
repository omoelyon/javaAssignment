import java.util.Scanner;

public class Combination{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  first number (N) : ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter  second number (R) : ");
        int secondNumber = input.nextInt();
        

        // public long factorial(int number){

            int f = 1;
            for (int counter = firstNumber ; counter >= 1; counter-- ){
                f *= counter;
            }

            int g =1;
            int diff = firstNumber-secondNumber;
            for (int counter = diff; counter >= 1; counter--){
                g *= counter;
            }

            int h =1;
            for (int counter = secondNumber; counter >= 1; counter--){
                h *= counter;
            }

            double permutation = f/(g*h) ;
            
            System.out.println(permutation);

        /*public int permutation(int firstNumber, int secondNumber ) {
            long answer;
            System.out.println(factorial(2));
            long numerator = factorial(firstNumber);
            long denominator = factorial(firstNumber-secondNumber);
            answer = numerator/denominator;
            System.out.println(answer);
            
            
        }
        */
     }
}