package mk.ukim.finki.wp.lab.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "album")
    private List<Song> songs;

    public Album() { }

    public Album(Long id, String name, List<Song> songs) {
        this.id = id;
        this.name = name;
        this.songs = songs;
    }
}
