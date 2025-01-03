import java.util.ArrayList;   // Import the ArrayList class to store a list of students
import java.util.Scanner;     // Import the Scanner class to read user input from the console

// Student class represents the details of a student
class Student {
    String studentID;         // Student ID (e.g., "1001")
    String name;              // Student's name (e.g., "Dhrubo")
    String grade;             // Student's grade (e.g., "B-")
    float GPA;                // Student's Grade Point Average (GPA) (e.g., 2.5)

    // Constructor to create a new Student object with ID, name, grade, and GPA
    Student(String studentID, String name, String grade, float GPA) {
        this.studentID = studentID;    // Set student ID
        this.name = name;              // Set student name
        this.grade = grade;            // Set student grade
        this.GPA = GPA;                // Set student GPA
    }

    // Setter methods to modify the student's details
    void setStudentID(String ID) {
        this.studentID = ID;          // Set a new student ID
    }
    void setName(String name) {
        this.name = name;             // Set a new name
    }
    void setGrade(String grade) {
        this.grade = grade;           // Set a new grade
    }
    void setGPA(float GPA) {
        this.GPA = GPA;               // Set a new GPA
    }

    // Getter methods to retrieve the student's details
    String getStudentID() {
        return this.studentID;         // Return the student ID
    }
    String getName() {
        return this.name;              // Return the student name
    }
    String getGrade() {
        return this.grade;             // Return the student grade
    }
    float getGPA() {
        return this.GPA;               // Return the student GPA
    }

    // Method to display the student's information (ID, name, grade, GPA)
    void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
        System.out.println("GPA: " + this.GPA + "\n");
    }
}

// StudentDatabase class is used to manage a list of students
class StudentDatabase {
    // Create an ArrayList to store multiple students
    ArrayList<Student> students = new ArrayList<Student>();

    // Method to add a new student to the database
    void addStudent(Student student) {
        students.add(student);  // Add the student to the list
    }

    // Method to display all students in the database
    void displayAllStudents() {
        // Loop through each student in the list and display their information
        for (Student student : students) {
            student.displayStudentInfo();  // Call the method to display each student's info
        }
    }

    // Method to search for a student by their ID
    void searchStudent(String studentID) {
        boolean isFound = false;  // Flag to check if the student was found
        // Loop through each student in the list
        for (Student student : students) {
            // If the student's ID matches the search ID
            if (student.getStudentID().equals(studentID)) {
                student.displayStudentInfo();  // Display the student's information
                isFound = true;  // Set the flag to true indicating the student was found
            }
        }
        if (!isFound) {
            // If no student was found, print "Not found"
            System.out.println("Not found");
        }
    }
}

// Main class that controls the flow of the program
public class StudentInfoMangementSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read user input

        // Create new student objects with initial information
        Student s1 = new Student("1001", "Dhrubo", "B-", 2.5f);  // Create student 1
        Student s2 = new Student("1002", "Roy", "F", 0.0f);      // Create student 2
        Student s3 = new Student("1003", "Partho", "C", 2.25f);  // Create student 3

        // Create a StudentDatabase object to manage students
        StudentDatabase studentDatabase = new StudentDatabase();
        
        // Add the created students to the student database
        studentDatabase.addStudent(s1);
        studentDatabase.addStudent(s2);
        studentDatabase.addStudent(s3);

        // Display all students' information
        System.out.println("All students info");
        studentDatabase.displayAllStudents();  // Call the method to display all students

        // Prompt the user to enter a student ID for searching
        System.out.println("Enter a student ID for search: ");
        String sID = sc.nextLine();  // Read the student ID entered by the user

        // Search for the student in the database by the entered ID
        studentDatabase.searchStudent(sID);  // Call the search method

        sc.close();  // Close the scanner to free up resources
    }
}








// import java.util.ArrayList;
// import java.util.Scanner;

// class Student{
//     String studentID;
//     String name;
//     String grade;
//     float GPA;

//     Student(String studentID, String name, String grade, float GPA){
//         this.studentID = studentID;
//         this.name = name;
//         this.grade = grade;
//         this.GPA = GPA;
//     }

//     void setStudentID(String ID){
//         this.studentID = ID;
//     }
//     void setName(String name){
//         this.name = name;
//     }
//     void setGrade(String grade){
//         this.grade = grade;
//     }
//     void setGPA(float GPA){
//         this.GPA = GPA;
//     }

//     String getStudentID(){
//         return this.studentID;
//     }
//     String getName(){
//         return this.name;
//     }
//     String getGrade(){
//         return this.grade;
//     }
//     float getGPA(){
//         return GPA;
//     }

//     void displayStudentInfo(){
//         System.out.println("Student ID: " + this.studentID);
//         System.out.println("Name: " + this.name);
//         System.out.println("Grade: " + this.grade);
//         System.out.println("GPA: " + this.GPA + "\n");
//     }
// }

// class StudentDatabase{
//     ArrayList<Student> students = new ArrayList<Student>();

//     void addStudent(Student student){
//         students.add(student);
//     }

//     void displayAllStudents() {
//         for(Student student:students){
//             student.displayStudentInfo();
//         }
//     }

//     void searchStudent(String studentID) {
//         boolean isFound = false;
//         for(Student student:students){
//             if(student.getStudentID().equals(studentID)){
//                 student.displayStudentInfo();
//                 isFound = true;
//             }
//         }
//         if(!isFound) System.out.println("Not found");
//     }
// }

// public class StudentInfoMangementSimple {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Student s1 = new Student("1001", "Dhrubo", "B-", 2.5f);
//         Student s2 = new Student("1002", "Roy", "F", 0.0f);
//         Student s3 = new Student("1003", "Partho", "C", 2.25f);
        
//         StudentDatabase studentDatabase = new StudentDatabase();
//         studentDatabase.addStudent(s1);
//         studentDatabase.addStudent(s2);
//         studentDatabase.addStudent(s3);

//         System.out.println("All students info");
//         studentDatabase.displayAllStudents();

//         System.out.println("Enter a student ID for search: ");
//         String sID = sc.nextLine();

//         studentDatabase.searchStudent(sID);

//         sc.close();
//     }
// }
