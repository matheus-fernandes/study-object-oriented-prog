package patterns.composite;

public class SubProject extends Project{
    public SubProject(String name, Task... task) {
        super(name, task);
    }

    @Override
    public String html() {
        return  super.html() ;
    }
}
