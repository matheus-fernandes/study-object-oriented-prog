package patterns.facade.options;

import java.util.Map;

public interface EntryFactory<T> {
    Map.Entry<String, T> getEntry();
}