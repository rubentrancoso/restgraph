package engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
//@EnableJpaRepositories (basePackageClasses = {ArticleRepository.class})
//@EntityScan (basePackages = {"engine.entities"})
@SpringBootApplication(scanBasePackages={"engine"})
public class Application {
	
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    } 

}
