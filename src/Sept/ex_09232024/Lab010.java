package Sept.ex_09232024;
import java.util.Scanner;
public class Lab010 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input: numbers and operator
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Switch statement for calculator operations
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println(num1 + " % " + num2 + " = " + result);
                    } else {
                        System.out.println("Modulus by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    break;
            }

            scanner.close();
        }
    }

