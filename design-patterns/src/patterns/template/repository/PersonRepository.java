package patterns.template.repository;

import patterns.template.model.Person;
import patterns.template.validation.NotValid;

import java.util.ArrayList;
import java.util.Collection;

public class PersonRepository extends Repository<Person> {
    @Override
    protected Collection<NotValid> findNotValid(Person person) {
        Collection<NotValid> notValid = new ArrayList<>();

        if (person.name().length() < 2){
            notValid.add(() -> (
                "The expected size of name at least 2 but got " +
                person.name().length() + " in '" + person.name() + "'"
            ));
        }

        if (person.age() < 0){
            notValid.add(() -> (
                "The age can not be less than 0 but got " + person.age()
            ));
        }

        return notValid;
    }

    @Override
    protected void prepare(Person register) {
        System.out.println("Preparing save of " + register);
    }

    @Override
    protected void flush(Person register) {
        System.out.println("Register: " + register + " was saved.");
    }
}
