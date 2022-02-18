package patterns.observer.core;

public interface Observer <T>{
    void lookTo(Subscription<T> subscription);
}
