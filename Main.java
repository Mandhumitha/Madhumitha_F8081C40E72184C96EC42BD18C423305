import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student
{
    String name;
    String rollNumber;
    double cgpa;

    public Student(String name, String rollNumber, double cgpa)     {
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
    }
}

public class Main
{
    static class CGPAComparator implements Comparator<Student>
    {
        public int compare(Student student1, Student student2)
        {
            return Double.compare(student2.cgpa, student1.cgpa);
        }
    }
    static void sortStudents(List<Student> students)
    {
        Collections.sort(students, new CGPAComparator());
    }
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Gokul", "A12", 3.8));
        students.add(new Student("Dhush", "B456", 3.5));
        students.add(new Student("Kamal", "C789", 3.9));
        students.add(new Student("krishna", "D101", 3.2));
        students.add(new Student("Imla", "E202", 4.0));
        sortStudents(students);
        System.out.println("Sorted List of Students by CGPA (Descending Order):");
        for (Student student : students)
        {
            System.out.println("Name: " + student.name + ", Roll Number: " + student.rollNumber + ", CGPA: " + student.cgpa);
        }
    }
}
