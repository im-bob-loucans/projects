package sb.apartment.rentals.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

@SpringBootApplication(exclude = SpringDataWebAutoConfiguration.class)
public class Application {
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
