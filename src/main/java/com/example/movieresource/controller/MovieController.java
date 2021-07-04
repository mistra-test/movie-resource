package com.example.movieresource.controller;

import com.example.movieresource.model.Movie;
import com.example.movieresource.model.MovieDTO;
import com.example.movieresource.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// class MovieListWrapper implements Serializable {
//     private List<Movie> movieList;
// }

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public Mono<Movie> findById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @GetMapping()
    public Flux<Movie> findAll() {
        return movieService.findAll();
    }

    @PostMapping()
    public Mono<Movie> save(@RequestBody MovieDTO dto) {
        return movieService.save(Movie.from(dto));
    }
}
