import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        // Array containing the names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day position (0-6): ");

        try {
            // Read the day index from user
            int dayIndex = scanner.nextInt();

            // Access and print the corresponding weekday
            System.out.println("The day is: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid day index
            System.out.println("Invalid day index. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle any other input errors
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            // Close the scanner object
            scanner.close();
        }
    }
}

