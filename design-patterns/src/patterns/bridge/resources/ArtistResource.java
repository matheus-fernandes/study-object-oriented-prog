package patterns.bridge.resources;

import patterns.bridge.model.Artist;

public class ArtistResource implements Resource{
    private final Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String getTitleLabel() {
        return "Name";
    }

    @Override
    public String getTitle() {
        return artist.name();
    }

    @Override
    public String getSnippetLabel() {
        return "Biography";
    }

    @Override
    public String getSnippet() {
        return artist.bio();
    }

    @Override
    public String getImageUrl() {
        return "/images/artists/" + artist.id();
    }
}
