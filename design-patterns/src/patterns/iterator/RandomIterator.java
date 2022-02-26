package patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomIterator <T> implements Iterator<T> {
    private Random random;
    private List<T> list;
    private List<Integer> visited;

    public RandomIterator(List<T> list){
        this.list = list;
        this.visited = new ArrayList<>();
        this.random = new Random();
    }

    @Override
    public boolean hasNext() {
        return visited.size() < list.size();
    }

    @Override
    public T next() {
        int pos = getNextPosition();
        T ret = list.get(pos);
        visited.add(pos);

        return ret;
    }

    private int getNextPosition(){
        int pos = 0;

        boolean nextWasFound = false;
        while(!nextWasFound){
            pos = random.nextInt(0, list.size());
            nextWasFound = !visited.contains(pos);
        }

        return Integer.valueOf(pos);
    }
}
