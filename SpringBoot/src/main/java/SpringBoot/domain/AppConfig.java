package SpringBoot.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public Book book() {
        return new Book();
    }

    @Bean("book1")
    public Book book1() {
        Book bb = new Book(1232, "Book2");
        return bb;
    }

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public Engine getEngine(){
        return new Engine();
    }
}

