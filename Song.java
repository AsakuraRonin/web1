package mk.ukim.finki.wp.lab.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;

    @ManyToOne
    private Album album;

    @ManyToMany
    private List<Artist> performers;

    public Song() { }

    public Song(Long id, String title, String genre, int releaseYear, Album album, List<Artist> performers) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.album = album;
        this.performers = performers;
    }
}
