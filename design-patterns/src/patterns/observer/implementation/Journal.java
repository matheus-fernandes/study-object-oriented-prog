package patterns.observer.implementation;

import patterns.observer.core.Notifier;
import patterns.observer.core.Observer;
import patterns.observer.core.Subscription;

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
