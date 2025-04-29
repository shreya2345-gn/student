public class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private char grade;
    private double marks;
    private String phoneNumber;
    private String location;

    // Constructor
    public Student(String name, int rollNumber, char grade, double marks, String phoneNumber, String location) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.marks = marks;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    // Method to calculate percentage (assuming total marks = 500)
    public double calculatePercentage() {
        return (marks / 500) * 100;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Location: " + location);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a student object with phone number & location
        Student student1 = new Student("Raj", 101, 'A', 450, "9876543210", "Bengaluru");

        // Displaying student details
        student1.displayInfo();
    }
}