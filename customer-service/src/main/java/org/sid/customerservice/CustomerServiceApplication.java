package org.sid.customerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class CustomerServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @PostConstruct
    public void init() {

    }

}

