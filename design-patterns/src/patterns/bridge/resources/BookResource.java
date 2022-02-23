package patterns.bridge.resources;

import patterns.bridge.model.Book;

public class BookResource implements Resource{
    private final Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getTitleLabel() {
        return "Title";
    }

    @Override
    public String getTitle() {
        return book.title();
    }

    @Override
    public String getSnippet() {
        return book.cover();

    }

    @Override
    public String getSnippetLabel() {
        return "Cover";
    }

    @Override
    public String getImageUrl() {
        return "/images/books/" + book.id();
    }
}
