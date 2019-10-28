package raj.mc.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan({"ratingResource","model"})
public class MovieRatingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRatingServiceApplication.class, args);
    }

}
