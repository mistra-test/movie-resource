package com.example.movieresource.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.movieresource.model.Movie;
import com.example.movieresource.repository.MovieRepository;
import com.example.movieresource.service.MovieService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;

@SpringBootTest
class MovieResourceTests {

    private MovieService movieService;
    private MovieRepository repo;

    MovieResourceTests() {
        repo = Mockito.mock(MovieRepository.class);
        movieService = new MovieService(repo);
    }

    @Test
    void findAll() {
        var lotr = new Movie(1L, "Lord of the rings", "Frodo and Sam are on holiday");
        var ironMan = new Movie(2L, "Iron Man", "W Tony Stark");

        Mockito.when(repo.findAll()).thenReturn(Flux.just(lotr, ironMan));

        assertTrue(movieService.findAll().collectList().block().contains(lotr));
    }
}
