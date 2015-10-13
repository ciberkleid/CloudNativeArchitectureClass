package io.springbox.integration;

import io.springbox.integration.domain.MovieDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import rx.Observable;

@RestController
public class MovieDetailsController {

	@Autowired
	CatalogIntegrationService catalogIntegrationService;

	@Autowired
	RecommendationsIntegrationService recommendationsIntegrationService;

	@Autowired
	ReviewsIntegrationService reviewsIntegrationService;

	@RequestMapping("/movie/{mlId}")
	public DeferredResult<MovieDetails> movieDetails(@PathVariable String mlId) {
		Observable<MovieDetails> details = Observable.zip(
				catalogIntegrationService.getMovie(mlId),
				reviewsIntegrationService.reviewsFor(mlId),
				recommendationsIntegrationService.getRecommendations(mlId), (
						movie, reviews, recommendations) -> {
					MovieDetails movieDetails = new MovieDetails();
					movieDetails.setMovie(movie);
					movieDetails.setReviews(reviews);
					movieDetails.setRecommendations(recommendations);
					return movieDetails;
				});
		DeferredResult<MovieDetails> deferredResult = new DeferredResult<MovieDetails>();
		details.subscribe(movieInfo -> {
		      System.out.println(movieInfo);
		      deferredResult.setResult(movieInfo);
		    },
		    throwable -> {throwable.printStackTrace();
		  });
		return deferredResult;
	}

	// @Autowired
	// private DiscoveryClient discoveryClient;

	// @Autowired
	// private LoadBalancerClient loadBalancerClient;

	// @Autowired
	// private RestTemplate restTemplate;

	// @RequestMapping(value = "/", produces = "application/json")
	// String consume() {
	// InstanceInfo instance =
	// discoveryClient.getNextServerFromEureka("PRODUCER", false);
	//
	// RestTemplate restTemplate = new RestTemplate();
	// ProducerResponse response =
	// restTemplate.getForObject(instance.getHomePageUrl(),
	// ProducerResponse.class);
	//
	// return String.format("{\"value\":%d}", response.getValue());
	// }

	// @RequestMapping(value = "/", produces = "application/json")
	// String consume() {
	// ServiceInstance instance = loadBalancerClient.choose("PRODUCER");
	// URI producerUri = URI.create(String.format("http://%s:%d",
	// instance.getHost(), instance.getPort()));
	//
	// RestTemplate restTemplate = new RestTemplate();
	// ProducerResponse response = restTemplate.getForObject(producerUri,
	// ProducerResponse.class);
	//
	// return String.format("{\"value\":%d}", response.getValue());
	// }

	// @RequestMapping(value = "/", produces = "application/json")
	// String consume() {
	// ProducerResponse response = restTemplate.getForObject("http://producer",
	// ProducerResponse.class);
	//
	// return String.format("{\"value\":%d}", response.getValue());
	// }

}
