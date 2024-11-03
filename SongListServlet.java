package mk.ukim.finki.wp.lab.web;

import mk.ukim.finki.wp.lab.service.SongService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "songList", urlPatterns = "/listSongs")
public class SongListServlet extends HttpServlet {
    private final SongService songService;

    public SongListServlet(SongService songService) {
        this.songService = songService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("songs", songService.listSongs());
        req.getRequestDispatcher("/templates/listSongs.html").forward(req, resp);
    }
}
