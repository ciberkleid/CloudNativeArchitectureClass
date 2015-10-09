package io.springbox.catalog.repository;

import io.springbox.catalog.domain.Genre;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long>{
	
	Genre findByMlId(String mlId);

}
