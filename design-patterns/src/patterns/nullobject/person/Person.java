package patterns.nullobject.person;

import java.util.Collection;
import java.util.Iterator;

public abstract class Person implements Parent{
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
