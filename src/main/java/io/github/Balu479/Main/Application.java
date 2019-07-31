package io.github.Balu479.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("io.github")
@EnableJpaRepositories("io.github.Balu479.Repository")
@EntityScan("io.github.Balu479.Entity")
public class Application {
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
		System.out.println("Main Method");
	}
}
