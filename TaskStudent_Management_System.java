import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class StudentClass {
    private String name;
    private Integer rollno;
    private Integer age;
    private String address;
    private String gender;
    private String course;
    private String grade;

    public StudentClass(String name, Integer rollno, Integer age, String address, String gender, String course, String grade) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll_No: " + rollno + ", Age: " + age + ", Address: " + address + ", Gender: " + gender + ", Course: " + course + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
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
        if (students.isEmpty()) {
            System.out.println("No student records found in the database.");
        } else {
            for (StudentClass studentClass : students) {
                System.out.println(studentClass);
            }
        }
    }
}

public class TaskStudent_Management_System {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System Menu:");
            System.out.println("1. Add a New Student");
            System.out.println("2. Remove a Student");
            System.out.println("3. Search for a Student");
            System.out.println("4. Display All Students");
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
                    sc.nextLine();  
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Address: ");
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
                    // end{code}
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
