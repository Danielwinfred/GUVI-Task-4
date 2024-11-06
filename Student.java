// Custom Exception for Age Not Within Range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Main Class: Student
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor with exception handling for age and name
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        // Check if age is between 15 and 21
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }

        // Check if name contains only letters and spaces
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name contains invalid characters. Only letters and spaces are allowed.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        try {
            // Creating a student with valid details
            Student student1 = new Student(101, "Alice", 20, "Computer Science");
            student1.display();

            // Creating a student with invalid age to trigger AgeNotWithinRangeException
            Student student2 = new Student(102, "Bob", 25, "Mechanical Engineering");
            student2.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Creating a student with invalid name to trigger NameNotValidException
            Student student3 = new Student(103, "John123", 18, "Electrical Engineering");
            student3.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

