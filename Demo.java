
// File: Main.java
import java.util.*;

class Course {
    String courseName;
    int marks;

    Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    List<Course> courses;

    Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }

    void printLowMarks() {
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println(name + " scored " + c.marks + " in " + c.courseName);
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Aarav", "BCA", 4);
        s1.addCourse(new Course("Java", 78));
        s1.addCourse(new Course("Math", 32));

        Student s2 = new Student("Meera", "BCA", 4);
        s2.addCourse(new Course("Java", 35));
        s2.addCourse(new Course("Math", 80));

        List<Student> students = Arrays.asList(s1, s2);

        for (Student s : students) {
            s.printDetails();
            System.out.println();
        }

        System.out.println("Students scoring less than 40:");
        for (Student s : students) {
            s.printLowMarks();
        }
    }
}
