package Sept.ex_09232024;
import java.util.Scanner;
public class Lab011 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input: number of the month (1-12)
            System.out.print("Enter a number (1-12) to get the month: ");
            int month = scanner.nextInt();

            // Switch statement for month names
            switch (month) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Feb");
                    break;
                case 3:
                    System.out.println("Mar");
                    break;
                case 4:
                    System.out.println("Apr");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Jul");
                    break;
                case 8:
                    System.out.println("Aug");
                    break;
                case 9:
                    System.out.println("Sep");
                    break;
                case 10:
                    System.out.println("Oct");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 12.");
                    break;
            }

            scanner.close();
        }
    }


