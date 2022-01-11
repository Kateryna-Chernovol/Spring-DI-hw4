package chernovol.service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MinusService minusService() {
        return new MinusService();
    }

    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public Calculator calculate(){
        return new Calculator();
    }
}
