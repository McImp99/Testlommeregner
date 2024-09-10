import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    SimpleCalculator calculator = new SimpleCalculator();
    Scanner input = new Scanner(System.in);

    //Declare first number user inputs
    //Double so that the calculator can handle decimal numbers
    System.out.println("Enter the first number");
    double num1 = input.nextDouble();

    //Declare second number user inputs

    System.out.println("Enter the second number");
    double num2 = input.nextDouble();

    System.out.println("Choose an operation");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    //Choice is an integer, therefore use int
    int choice = input.nextInt();

    double result = 0;
    //Switch case used over if, elseif cause cleaner code with multiple lines
    //Calculator.?? refers to the main class called SimpleCalculator
    //Break; exits the case, if there was no break; you end up with the machine wanting to run next case
    switch (choice) {
        case 1:
            result =calculator.add(num1, num2);
            break;
        case 2:
            result =calculator.subtract(num1, num2);
            break;
        case 3:
            result =calculator.multiply(num1, num2);
            break;
        case 4:
            result =calculator.divide(num1, num2);
            break;
        default:
            System.out.println("Invalid choice!");
            break;
    }

        System.out.println("The result is: " + result);
    }
}