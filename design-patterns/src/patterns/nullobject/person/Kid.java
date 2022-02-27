package patterns.nullobject.person;

import patterns.nullobject.iterators.NullIterator;

import java.util.Iterator;

public class Kid extends Person {
    public Kid(String name, int age) {
        super(name, age);
    }

    @Override
    public Iterator<Person> children() {
        return new NullIterator<Person>();
    }
}
