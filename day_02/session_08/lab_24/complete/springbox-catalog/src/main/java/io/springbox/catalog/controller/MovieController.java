package io.springbox.catalog.controller;

import io.springbox.catalog.domain.Movie;
import io.springbox.catalog.repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@RequestMapping(value="/movies", method=RequestMethod.GET)
	public Iterable<Movie> findAll() {
		return movieRepository.findAll();
	}

	@RequestMapping(value="/movies/{mlId}", method=RequestMethod.GET)
	public Movie findByMlId(@PathVariable String mlId) {
		return movieRepository.findByMlId(mlId);
	}

}
