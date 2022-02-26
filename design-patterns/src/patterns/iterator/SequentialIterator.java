package patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class SequentialIterator <T> implements Iterator<T> {
    private int lastVisited;
    private List<T> list;

    public SequentialIterator(List<T> list){
        this.list = list;
        this.lastVisited = -1;
    }

    @Override
    public boolean hasNext() {
        return lastVisited < list.size() - 1;
    }

    @Override
    public T next() {
        return list.get(++lastVisited);
    }
}
