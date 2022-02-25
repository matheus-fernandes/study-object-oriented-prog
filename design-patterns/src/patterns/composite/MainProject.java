package patterns.composite;

public class MainProject extends Project{
    public MainProject(String name, Task... tasks) {
        super(name, tasks);
    }

    @Override
    public String html() {
        return "<ul>" + super.html() + "</ul>";
    }
}
