package io.springbox.catalog.repository;

import io.springbox.catalog.domain.Movie;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>{
	
	Movie findByMlId(String mlId);

}
