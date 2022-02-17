package com.observer.implementation;

import com.observer.core.Observer;
import com.observer.core.Subscription;

import static java.lang.System.*;

public class Reader extends Person implements Observer<News> {

    public Reader(String name) {
        super(name);
    }

    private void read(News news){
        out.println("Hi I'm " + name + " and I have almost read this news: ");
        out.println(news);
        out.println();
    }

    @Override
    public void lookTo(Subscription<News> subscription) {
        read(subscription.getContent());
    }
}
