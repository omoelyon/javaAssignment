import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  a number1 : ");
        int firstNumber = input.nextInt();

        System.out.print("Enter  operation : ");
        char symbol = input.next().charAt(0);
        

        System.out.print("Enter  a number2 : ");
        int secondNumber = input.nextInt();
        double answer;

        if (symbol == '+'){
            answer = firstNumber + secondNumber ;
            System.out.println( answer );
            System.out.println( firstNumber + secondNumber );
        }
        else if (symbol == '-'){
             answer = firstNumber - secondNumber ;
            System.out.println( answer );
        }
        else if (symbol == '/'){
             answer = firstNumber / secondNumber ;
            System.out.println( answer );
        }
        else if (symbol == '*'){
            answer = firstNumber * secondNumber ;
            System.out.println( answer );
        }
        else if (symbol == '%'){
            answer = firstNumber % secondNumber ;
            System.out.println( answer );
        }
        else if (symbol == '^'){
            answer= firstNumber;
                if(secondNumber == 1){
                    answer = firstNumber;
                    System.out.println(answer);
                }
                else if(secondNumber == 0) {
                    answer= 1;
                    System.out.println(answer);
                }
            else if(secondNumber>1){
                        for( int i = 2; i<=secondNumber; i++){
                            answer = answer * firstNumber ;
                        }
                        System.out.println(answer);
                    }

            }
            
        else {
            System.out.println( "something is wrong somewhere, check your operation" );
        }
    }

}