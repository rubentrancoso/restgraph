package engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableAutoConfiguration
//@EnableJpaRepositories (basePackageClasses = {ArticleRepository.class})
//@EntityScan (basePackages = {"engine.entities"})
@SpringBootApplication(scanBasePackages={"engine"})
public class Application {
	
    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    } 
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://www.test-cors.org").allowedOrigins("201.159.114.71");
            }
        };
    }
    
}
