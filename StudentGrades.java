import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {

    // HashMap to store student names and grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student with their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " has been removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by their name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade for " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Main method to the functionality
    public static void main(String[] args) {

        StudentGrades studentGrades = new StudentGrades();

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        studentGrades.addStudent("Alice", 90);
        studentGrades.addStudent("Bob", 85);

        studentGrades.displayGrade("Alice");
        studentGrades.displayGrade("Bob");

        studentGrades.removeStudent("Bob");

        studentGrades.displayGrade("Bob");

        studentGrades.addStudent("Charlie", 88);
        studentGrades.displayGrade("Charlie");

        // Close the scanner
        scanner.close();
    }
}
