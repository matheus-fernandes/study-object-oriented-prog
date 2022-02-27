package examples;

import patterns.nullobject.person.Adult;
import patterns.nullobject.person.Kid;
import patterns.nullobject.person.Person;

import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class NullObjectExample {
    public static void main(String[] args) {
        Person bob = new Kid("Bob", 12);
        Person jane = new Kid("Jane", 8);
        Person john = new Adult("John", 30, List.of(bob, jane));

        Person elisa = new Kid("Elisa", 7);
        Person lana = new Adult("Lana", 30, List.of(elisa));

        Person nona = new Adult("Nona", 60, List.of(john, lana));

        showFamilyOf(nona);
    }

    static void showFamilyOf(Person person){
        showFamilyOf(List.of(person).iterator(), 0);
    }

    static void showFamilyOf(Iterator<Person> people, int hierarchy){
        while (people.hasNext()){
            Person person = people.next();

            showHierarchyTabulation(hierarchy);
            showPerson(person);

            showFamilyOf(person.children(), hierarchy + 1);
        }
    }

    static void showHierarchyTabulation(int hierarchy){
        for (int i = 0; i < hierarchy * 3; i++){
            out.print(" ");
        }
        out.print("--> ");
    }

    static void showPerson(Person person) {
        out.print("Name: " + person.getName());
        out.print(" | Age: " + person.getAge());
        out.println();
    }
}
