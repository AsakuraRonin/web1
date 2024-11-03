package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.model.Artist;
import java.util.List;
import java.util.ArrayList;

public class SongRepository {
    private final List<Song> songs = new ArrayList<>();

    public SongRepository() {
        songs.add(new Song("1", "Sweet Child O' Mine", "Rock", 1987));
        songs.add(new Song("2", "Livin' on a Prayer", "Rock", 1986));
        songs.add(new Song("3", "Space Oddity", "Rock", 1969));
        songs.add(new Song("4", "Bohemian Rhapsody", "Rock", 1975));
        songs.add(new Song("5", "Rocket Man", "Pop", 1972));
    }

    public List<Song> findAll() {
        return songs;
    }

    public Song findByTrackId(String trackId) {
        return songs.stream().filter(song -> song.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Artist artist, Song song) {
        song.addPerformer(artist);
        return artist;
    }
}
