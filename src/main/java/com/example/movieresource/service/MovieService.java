package com.example.movieresource.service;

import com.example.movieresource.model.Movie;
import com.example.movieresource.repository.MovieRepository;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class MovieService {
    private MovieRepository movieRepo;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        log.debug("MovieService construction");
        movieRepo = movieRepository;
    }

    public Optional<Movie> findById(Long id) {
        return movieRepo.findById(id);
    }

    public List<Movie> findAll() {
        return movieRepo.findAll();
    }

    public Movie save(Movie movie) {
        return movieRepo.save(movie);
    }
}
