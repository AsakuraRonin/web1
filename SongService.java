package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.model.Artist;
import java.util.List;

public interface SongService {
    List<Song> listSongs();
    Song findByTrackId(Long trackId);
    void addArtistToSong(Artist artist, Song song);
}
