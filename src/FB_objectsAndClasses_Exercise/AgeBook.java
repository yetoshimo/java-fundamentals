package FB_objectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AgeBook {
    private String name;
    private String ID;
    private int age;

    public AgeBook(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " with ID: " + this.ID + " is " + this.age + " years old.";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        List<AgeBook> allPeople = new ArrayList<>();

        while (!nextLine.equals("End")) {
            String[] personInformation = nextLine.split(" ");
            allPeople.add(new AgeBook(personInformation[0], personInformation[1], Integer.parseInt(personInformation[2])));

            nextLine = scan.nextLine();
        }

        allPeople.sort(Comparator.comparing(AgeBook::getAge));

        for (AgeBook a: allPeople) {
            System.out.println(a);
        }
    }
}
