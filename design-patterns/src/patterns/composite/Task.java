package patterns.composite;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public interface Task {
    String html();

    default String htmlFrom(Task... tasks){
        return Arrays.stream(tasks)
                .map(Task::html)
                .collect(joining());
    }
}
