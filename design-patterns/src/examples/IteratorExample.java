package examples;

import patterns.iterator.RandomIterator;
import patterns.iterator.SequentialIterator;

import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class IteratorExample {
    public static void main(String[] args) {
        List number = List.of(1, 2, 3, 4, 5, 6);

        Iterator<Integer> iterator1 = new RandomIterator<>(number);
        Iterator<Integer> iterator2 = new SequentialIterator<>(number);

        out.println("Randomized:");
        while (iterator1.hasNext()){
            out.println(iterator1.next());
        }

        out.println("\nSequential:");
        while (iterator2.hasNext()){
            out.println(iterator2.next());
        }

    }
}
