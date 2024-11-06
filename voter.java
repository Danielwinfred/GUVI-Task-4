// Exception for voters under 18
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Voter class with attributes and age check
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Constructor that checks if age is 18 or older
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Method to print voter details
    public void display() {
        System.out.println("Voter ID: " + voterId + ", Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        try {
            // Creating a voter who is old enough
            Voter voter1 = new Voter(1, "Alice", 25);
            voter1.display();

            // Creating a voter under 18 to test the exception
            Voter voter2 = new Voter(2, "Bob", 16);
            voter2.display();
        } catch (InvalidVoterAgeException e) {
            System.out.println(e.getMessage());  // Print error message if exception is thrown
        }
    }
}

