package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dao")
@ComponentScan("service")
@ComponentScan("controller")
public class AppleAnnotationConfig {

}
