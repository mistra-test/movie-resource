package com.example.movieresource.repository;

import com.example.movieresource.model.Movie;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MovieRepository extends ReactiveCrudRepository<Movie, Long> {}
