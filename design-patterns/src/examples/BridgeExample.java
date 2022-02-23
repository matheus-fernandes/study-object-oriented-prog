package examples;

import patterns.bridge.model.Artist;
import patterns.bridge.model.Book;
import patterns.bridge.resources.ArtistResource;
import patterns.bridge.resources.BookResource;
import patterns.bridge.views.CardView;
import patterns.bridge.views.ListItemView;
import patterns.bridge.views.View;

import static java.lang.System.out;

public class BridgeExample {
    public static void main(String[] args) {
        View artistCard = new CardView(getArtistResource());
        out.println(artistCard.html());

        View bookCard = new CardView(getBookResource());
        out.println(bookCard.html());

        View artistListItem = new ListItemView(getArtistResource());
        out.println(artistListItem.html());

        View bookListItem = new ListItemView(getBookResource());
        out.println(bookListItem.html());
    }

    static BookResource getBookResource(){
        return new BookResource(new Book(
                "design-patterns-gof",
                "Design Patterns: Elements of Reusable Object-Oriented Software",
                    "Capturing a wealth of experience about the design of object-oriented software, four top-notch" +
                    "designers present a catalog of simple and succinct solutions to commonly occurring design problems." +
                    "Previously undocumented, these 23 patterns allow designers to create more flexible, elegant,"  +
                    "and ultimately reusable designs without having to rediscover the design solutions themselves."
        ));
    }

    static ArtistResource getArtistResource(){
        return new ArtistResource(new Artist(
                "slash",
                "Slash",
                "Saul Hudson (born July 23, 1965), better known as Slash," +
                    "is a British-American musician, songwriter," +
                    "and record producer from Stoke-on-Trent, England."
        ));
    }
}
