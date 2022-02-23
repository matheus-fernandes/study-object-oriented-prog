package examples;

import patterns.template.model.Person;
import patterns.template.repository.PersonRepository;
import patterns.template.repository.Repository;

import static java.lang.System.*;

public class TemplateExample {
    public static void main(String[] args) {
        Repository<Person> repository = new PersonRepository();

        logThatIsSaving("Matheus");
        repository.save(new Person("Matheus", 18));

        logThatIsSaving("J");
        repository.save(new Person("J", 18));

        logThatIsSaving("Jane");
        repository.save(new Person("Jane", -1));

        logThatIsSaving("Bob");
        repository.save(new Person("Bob", 18));
    }

    static void logThatIsSaving(String identifier){
        out.println("\n--> Saving " + identifier);
    }
}
