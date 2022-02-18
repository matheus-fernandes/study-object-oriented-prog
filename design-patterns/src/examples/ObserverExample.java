package examples;


import patterns.observer.implementation.Journal;
import patterns.observer.implementation.News;
import patterns.observer.implementation.Reader;

import static util.Util.*;
import static java.lang.System.out;
import static java.time.LocalDate.*;

public class ObserverExample {
    public static void main(String[] args) {
        Reader matheus = new Reader("Matheus");
        Reader michelle = new Reader("Michelle");

        Journal techNews = new Journal();
        techNews.subscribe(matheus);
        techNews.subscribe(michelle);

        publishMicrosoftNews(techNews);
        publishHackingNews(techNews);
    }

    static void publishMicrosoftNews(Journal journal){
        out.println("--> Publishing Microsoft News:\n");
        sleep(1000);

        String text = "Microsoft announce the Windows Max OS";
        journal.setNews(new News(now(), text));
    }

    static void publishHackingNews(Journal journal){
        out.println("--> Publishing Hacking News:\n");
        sleep(4000);

        String text = "12 years old brazilian guy hacks his school";
        journal.setNews(new News(now(), text));
    }
}
