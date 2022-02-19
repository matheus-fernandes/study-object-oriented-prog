package patterns.singleton;

import java.time.LocalDateTime;

public record Message(LocalDateTime date, String author, String content) {
}
