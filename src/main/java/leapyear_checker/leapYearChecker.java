package leapyear_checker;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;


public class leapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int option;
        do {
            out.println("1: leap year checker");
            out.println("2: Exit");
            option = scanner.nextInt();
            if (option == 2) {
                return;
            }
            if (option > 2 || option < 0) {
                out.println("Please select from above options!");
                out.println("1: leap year checker");
                out.println("2: Exit");
                option = scanner.nextInt();
            }
            out.println("Enter the year: ");
            int year = scanner.nextInt();

            if (year % 4 == 0 && year % 400 == 0) {
                out.println("It's a leap year.");
            } else {
                out.println("It's not a leap year.");
            }
        } while (option == 1);
    }
}
