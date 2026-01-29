package SpringBoot;

import SpringBoot.domain.AppConfig;
import SpringBoot.domain.Book;
import SpringBoot.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Book b1 = context.getBean(Book.class);
        b1.setTitle("Tell me your address");
        System.out.println(b1.getTitle());


        Car c1 = context.getBean((Car.class));
        c1.setBrand(("AUDI"));
        System.out.println(c1.getBrand());



        Book bb=context.getBean("book1", Book.class);
        System.out.println(bb.getTitle());

        c1.show();





	}

}
