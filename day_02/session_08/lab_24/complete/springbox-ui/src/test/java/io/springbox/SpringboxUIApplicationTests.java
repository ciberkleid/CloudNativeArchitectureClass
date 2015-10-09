package io.springbox;

import io.springbox.SpringboxUIApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringboxUIApplication.class)
@WebAppConfiguration
public class SpringboxUIApplicationTests {

	@Test
	public void contextLoads() {
	}

}
