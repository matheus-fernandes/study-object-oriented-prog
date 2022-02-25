package examples;

import patterns.composite.*;

import static java.lang.System.out;

public class CompositeExample {
    public static void main(String[] args) {
        Task myYearTask = new MainProject( "MY YEAR TASKS:",
                new SimpleTask("wash the dishes every day"),
                new SimpleTask("fold the clothes just after wake up"),
                new SimpleTask("cook the dinner in the morning"),
                new SubProject("BUILD THE GARDEN:",
                        new SimpleTask("Buy seeds"),
                        new SimpleTask("Plant the seeds")
                )
        );

        out.println(myYearTask.html());
    }
}
