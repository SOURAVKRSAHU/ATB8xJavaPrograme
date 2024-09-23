package Sept.ex_09232024;
import java.util.Scanner;
public class Lab012 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display conversion options
            System.out.println("Choose a conversion option:");
            System.out.println("1. Kilometers to Meter");
            System.out.println("2. Fahrenheit to Celsius");

            // Input: user choice
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();

            // Switch statement for different conversions
            switch (choice) {
                case 1:
                    // Kilometers to meter conversion
                    System.out.print("Enter distance in kilometers: ");
                    double kilometers = scanner.nextDouble();
                    double meter = kilometers * 1000; // Conversion factor for km to meter
                    System.out.println(kilometers + " kilometers is equal to " + meter + " meter.");
                    break;

                case 2:
                    // Fahrenheit to Celsius conversion
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5/9; // Conversion formula for Fahrenheit to Celsius
                    System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please select either 1 or 2.");
                    break;
            }

            scanner.close();
        }
    }
