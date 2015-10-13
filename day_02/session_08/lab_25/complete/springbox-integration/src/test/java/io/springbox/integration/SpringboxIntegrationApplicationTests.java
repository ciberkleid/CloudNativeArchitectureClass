package io.springbox.integration;

import io.springbox.integration.SpringboxIntegrationApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringboxIntegrationApplication.class)
@WebAppConfiguration
public class SpringboxIntegrationApplicationTests {

	@Test
	public void contextLoads() {
	}

}
