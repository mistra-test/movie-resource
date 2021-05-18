package com.example.movieresource.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    public static Movie from(Long id, String name, String description) {
        var movie = new Movie();
        movie.id = id;
        movie.name = name;
        movie.description = description;
        return movie;
    }

    public static Movie from(MovieDTO dto) {
        var movie = new Movie();
        movie.id = dto.getId();
        movie.name = dto.getName();
        movie.description = dto.getDescription();
        return movie;
    }
}
