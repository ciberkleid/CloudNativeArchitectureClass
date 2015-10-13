package io.springbox.integration.domain;

import java.util.List;

public class MovieDetails {
	private Movie movie;
	private List<Review> reviews;
	private List<Movie> recommendations;
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public List<Movie> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Movie> recommendations) {
		this.recommendations = recommendations;
	}
}

