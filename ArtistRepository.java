package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class ArtistRepository {
    private final List<Artist> artists = new ArrayList<>();

    public ArtistRepository() {
        artists.add(new Artist(1L, "Axl", "Rose", "Guns N' Roses frontman"));
        artists.add(new Artist(2L, "Jon", "Bon Jovi", "Lead singer of Bon Jovi"));
        artists.add(new Artist(3L, "David", "Bowie", "Legendary rock artist"));
        artists.add(new Artist(4L, "Freddie", "Mercury", "Queen vocalist"));
        artists.add(new Artist(5L, "Elton", "John", "Renowned pianist and singer"));
    }

    public List<Artist> findAll() {
        return artists;
    }

    public Optional<Artist> findById(Long id) {
        return artists.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }
}
