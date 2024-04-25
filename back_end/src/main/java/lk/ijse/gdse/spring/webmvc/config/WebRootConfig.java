package lk.ijse.gdse.spring.webmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.spring.webmvc.service")
@Import(JPAConfig.class)
@PropertySource("classpath:application.properties")
public class WebRootConfig {
}
