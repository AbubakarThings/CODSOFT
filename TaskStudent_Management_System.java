
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class StudentClass {
    
    private String Name;
    private Integer Rollno;
    private Integer Age;
    private String Address;
private String Gender;
private String Course;
private String Grade;


public StudentClass(String Name, Integer Rollno, Integer Age, 
String Address, String Gender, String Course, String Grade){


this.Name = Name;
this.Rollno = Rollno;    
this.Age = Age;
this.Address = Address;
this.Gender = Gender;
this.Course = Course;
this.Grade = Grade;
}


public String getName(){
return Name;
}

public Integer getRollno(){
return Rollno;
}

public Integer Age(){
return Age;
}

public String getAddress(){
return Address;
}

public String getGender(){
return Gender;
}

public String getCourse(){
return Course;
}

public String getGrade(){
return Gender;

}

    @Override
    public String toString() {
        return "Name: " + Name + ", Roll_No: " + Rollno + ", Age: " 
        + Age + ",Address" + Address + ",Gender"  + Gender + ",Course" + Course + ",Grade" + Grade;
    }
}

class StudentManagementSystem {
    private static final char[] StudentClass = null;
    private List<StudentClass> students = new ArrayList<>();

    public void addStudent(StudentClass studentClass) {
        students.add(studentClass);
    }

    public void removeStudent(StudentClass studentClass) {
        students.remove(studentClass);
    }

    public List<StudentClass> searchStudent(String keyword) {
        List<StudentClass> result = new ArrayList<>();
        for (StudentClass student : students) {
            if (student.getName().contains(keyword) || Integer.toString(student.getRollno()).contains(keyword) || student.getGrade().contains(keyword)) {
                result.add(student);
            }
        }
        return result;
    }

    public void displayAllStudents() {
        for (@SuppressWarnings("unused") StudentClass studentClass : students) {
            System.out.println(StudentClass);
        }
    }
}  

public class TaskStudent_Management_System {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Display all students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll number: ");
                    int rollno = sc.nextInt();
                    sc.nextLine();  // Consume the newline character
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter Address");
                    String address = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    StudentClass newStudent = new StudentClass(name, rollno, age, address, gender, course, grade);
                    sms.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Enter the name or roll number of the student to remove: ");
                    String removeKeyword = sc.nextLine();
                    List<StudentClass> studentsToRemove = sms.searchStudent(removeKeyword);
                    if (!studentsToRemove.isEmpty()) {
                        for (StudentClass student : studentsToRemove) {
                            sms.removeStudent(student);
                            System.out.println("Removed: " + student);
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter search keyword: ");
                    String searchKeyword = sc.nextLine();
                    List<StudentClass> searchResults = sms.searchStudent(searchKeyword);
                    if (!searchResults.isEmpty()) {
                        System.out.println("Search Results:");
                        for (StudentClass student : searchResults) {
                            System.out.println(student);
                        }
                    } else {
                        System.out.println("No matching students found.");
                    }
                    break;
                case 4:
                    System.out.println("All Students:");
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting Student Management System.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
