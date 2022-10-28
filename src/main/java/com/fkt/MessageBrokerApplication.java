package com.fkt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
@EnableSwagger2
@EnableWebMvc
@SpringBootApplication
public class MessageBrokerApplication {
    private static final Logger log = LoggerFactory.getLogger(MessageBrokerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MessageBrokerApplication.class, args);
        log.info("Web Document Reference http://127.0.0.1:8081/swagger-ui/index.html");
        log.info("Server is Running on http://127.0.0.1:8081");
    }

}
