import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {

                System.out.println("Leap Year");
            }
        } else {

            System.out.println("Not a leap year");
        }

        scanner.close();
    }
}
