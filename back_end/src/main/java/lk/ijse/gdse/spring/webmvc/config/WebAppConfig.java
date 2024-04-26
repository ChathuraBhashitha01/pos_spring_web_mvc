package lk.ijse.gdse.spring.webmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.gdse.spring.webmvc.api","lk.ijse.gdse.spring.webmvc.advice"})
@EnableWebMvc
public class WebAppConfig {

}
