package com.observer.implementation;

import com.observer.core.Notifier;
import com.observer.core.Observer;
import com.observer.core.Subscription;

public class Journal implements Subscription<News> {
    private Notifier<News> notifier;
    private News news;

    public Journal() {
        this.notifier = new Notifier<>(this);
        this.news = null;
    }

    public void setNews(News news) {
        this.news = news;
        notifier.notifyObservers();
    }

    public News getNews() {
        return news;
    }

    @Override
    public News getContent() {
        return getNews();
    }

    @Override
    public void subscribe(Observer<News> observer) {
        notifier.subscribe(observer);
    }
}
