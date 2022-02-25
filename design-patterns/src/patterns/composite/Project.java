package patterns.composite;

public class Project implements Task {
    private final Task[] tasks;
    private final String name;

    public Project(String name, Task... tasks){
        this.name = name;
        this.tasks = tasks;
    }
    
    @Override
    public String html() {
        return  "<li>" + name + "</li>" + "<ul>" + htmlFrom(tasks) + "</ul>" ;
    }
}
