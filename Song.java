package mk.ukim.finki.wp.lab.model;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Artist> performers = new ArrayList<>();

    public Song(String trackId, String title, String genre, int releaseYear) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTrackId() { return trackId; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }
    public List<Artist> getPerformers() { return performers; }

    public void addPerformer(Artist artist) {
        this.performers.add(artist);
    }
}
