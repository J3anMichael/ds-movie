package com.devsuperiot.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiot.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}

