package patterns.proxy;

public interface BookProcessor {
    Integer getQuantityOfWordsStartingWith(Character character);
    Integer getQuantityOfWordsEndingWith(Character character);
}
