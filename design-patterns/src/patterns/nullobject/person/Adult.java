package patterns.nullobject.person;

import java.util.Collection;
import java.util.Iterator;

public class Adult extends Person {
    Collection<Person> myChildren;

    public Adult(String name, int age, Collection myChildren){
        super(name, age);
        this.myChildren = myChildren;
    }

    @Override
    public Iterator<Person> children() {
        return myChildren.iterator();
    }
}
