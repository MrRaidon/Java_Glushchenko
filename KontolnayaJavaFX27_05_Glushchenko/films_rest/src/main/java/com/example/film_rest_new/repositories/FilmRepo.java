package com.example.film_rest_new.repositories;

import com.example.film_rest_new.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Film, Integer> {
}
