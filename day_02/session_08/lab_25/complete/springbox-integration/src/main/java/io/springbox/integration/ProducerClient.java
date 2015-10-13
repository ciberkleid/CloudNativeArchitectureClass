package io.springbox.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class ProducerClient {
	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="generateProducerFallback")
	public ProducerResponse getValue() {
		return restTemplate.getForObject("http://producer", ProducerResponse.class);
	}
	
	public ProducerResponse generateProducerFallback() {
		return new ProducerResponse();
	}
	
	
}
