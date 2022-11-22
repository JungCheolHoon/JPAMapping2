package kr.kwangan2.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJPATest {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringJPATest.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}
}
