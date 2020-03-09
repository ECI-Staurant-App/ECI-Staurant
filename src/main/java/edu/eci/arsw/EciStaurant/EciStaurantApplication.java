package edu.eci.arsw.EciStaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = {"ecistaurant"})
public class EciStaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EciStaurantApplication.class, args);
	}

}
