package patterns.observer.core;

import java.util.ArrayList;
import java.util.List;

public class Notifier<T> {
    private List<Observer<T>> observers;
    private Subscription<T> subscription;

    public Notifier(Subscription<T> subscription){
        this.observers = new ArrayList<>();
        this.subscription = subscription;
    }

    public void unsubscribe(Observer<T> observer){
        this.observers.remove(observer);
    }

    public void subscribe(Observer<T> observer){
        this.observers.add(observer);
    }

    public void notifyObservers(){
        for (Observer<T> observer : observers){
            observer.lookTo(subscription);
        }
    }
}
