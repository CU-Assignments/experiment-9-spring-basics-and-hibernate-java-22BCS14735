import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Java Programming", 45);
    }

    @Bean
    public Student student() {
        Student s = new Student(course());
        s.setName("Priya");
        return s;
    }
}
