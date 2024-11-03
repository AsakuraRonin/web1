package mk.ukim.finki.wp.lab.controller;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongController {
    private final SongService songService;
    private final ArtistService artistService;

    public SongController(SongService songService, ArtistService artistService) {
        this.songService = songService;
        this.artistService = artistService;
    }

    @GetMapping("/listSongs")
    public String listSongs(Model model) {
        model.addAttribute("songs", songService.listSongs());
        return "listSongs";
    }

    @GetMapping("/artist")
    public String artistList(@RequestParam String trackId, Model model)

      @GetMapping("/artist")
    public String artistList(@RequestParam String trackId, Model model) {
        model.addAttribute("trackId", trackId);
        model.addAttribute("artists", artistService.listArtists());
        return "artistsList";
    }

    @PostMapping("/songDetails")
    public String songDetails(@RequestParam String artistId, @RequestParam String trackId, Model model) {
        Artist artist = artistService.findById(Long.parseLong(artistId));
        Song song = songService.findByTrackId(trackId);
        if (artist != null && song != null) {
            songService.addArtistToSong(artist, song);
            model.addAttribute("song", song);
            return "songDetails";
        }
        return "redirect:/listSongs"; 
    }
}
