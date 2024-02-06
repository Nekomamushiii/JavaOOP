package InheritanseAbstractionLab.SayHello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Bulgarian("Peter"));
        people.add(new European("Peter"));
        people.add(new Chinese("Peter"));
        for (Person p:people)
            print(p);
    }

    public static void print(Person person){
        System.out.println(person.sayHello());
    }
}
