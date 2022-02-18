package patterns.observer.core;

public interface Subscription<T> {
    T getContent();
    void subscribe(Observer<T> observer);
}
