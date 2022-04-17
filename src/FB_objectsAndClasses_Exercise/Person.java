package FB_objectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        List<Person> allPeople = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            String nextLine = scan.nextLine();
            String givenName = nextLine.split(" ")[0];
            Integer givenAge = Integer.parseInt(nextLine.split(" ")[1]);
            Person nextPerson = new Person(givenName, givenAge);
            allPeople.add(nextPerson);
        }

        allPeople.sort(Comparator.comparing(Person::getName));

        for (Person p: allPeople) {
            if (p.getAge() > 30) {
                System.out.println(p);
            }
        }
    }
}
