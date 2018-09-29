package cl.bci.demo.controller;

import cl.bci.demo.entity.Movie;
import cl.bci.demo.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepo movieRepo;

    @GetMapping("/list")
    public String list(Model model){
        List<Movie> list = (List<Movie>) getMovieRepo().findAll();
        model.addAttribute("movies", list);
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") int id){
        Optional<Movie> movie = movieRepo.findById(id);
        model.addAttribute("movie", movie.get());
        return "detail";
    }

    @GetMapping("/{id}")
    public String update(Model model, @PathVariable("id") int id){
        Optional<Movie> movie = movieRepo.findById(id);
        model.addAttribute("movie", movie.get());
        return "update";
    }

    @PostMapping("/{id}")
    public String update(Model model, @ModelAttribute Movie movie){
        getMovieRepo().save(movie);
        return "redirect:/movie/detail/"+movie.getId();

    }

    @GetMapping("/create")
    public String create(Model model){
        Movie movie = new Movie();
        model.addAttribute("movie",movie);
        model.addAttribute("message","");
        return "create";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute Movie movie){
        getMovieRepo().save(movie);
        return "redirect:/movie/list/";
    }



    public MovieRepo getMovieRepo() {
        return movieRepo;
    }

    public void setMovieRepo(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }
}
