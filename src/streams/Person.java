package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 17));
        persons.add(new Person("Charlie", 30));
        persons.add(new Person("Diana", 15));
        persons.add(new Person("Edward", 40));
        persons.add(new Person("Fiona", 22));
        persons.add(new Person("George", 19));
        persons.add(new Person("Hannah", 16));
        persons.add(new Person("Isaac", 27));
        persons.add(new Person("Julia", 35));
        System.out.println(persons);

        List<String> listOfnames=persons.stream()
                .filter(n->n.getAge()>=18)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(listOfnames);
    }
}
