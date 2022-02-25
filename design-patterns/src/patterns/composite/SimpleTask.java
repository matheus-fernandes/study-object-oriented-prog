package patterns.composite;

public class SimpleTask implements Task {
    private final String title;

    public SimpleTask(String title){
        this.title = title;
    }

    @Override
    public String html() {
        return "<li>" + title + "</li>";
    }
}
