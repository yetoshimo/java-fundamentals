package FB_objectsAndClasses_Exercise;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ": " + new DecimalFormat("0.00").format(this.grade);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        List<Student> allStudents = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] nextLine = scan.nextLine().split(" ");
            allStudents.add(new Student(nextLine[0], nextLine[1], Double.parseDouble(nextLine[2])));
        }
        allStudents.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student s: allStudents) {
            System.out.println(s);
        }
    }
}
