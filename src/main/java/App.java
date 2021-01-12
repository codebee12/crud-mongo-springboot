import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.mongo.crud")
@EnableMongoRepositories("com.mongo.crud")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}