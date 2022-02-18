package patterns.observer.implementation;

abstract class Person {
    protected final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
