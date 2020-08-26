package com.siddhu;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SiddhuSpringBootWebfluxSimpleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SiddhuSpringBootWebfluxSimpleApplication.class, args);
		SpringApplication application = new SpringApplication(SiddhuSpringBootWebfluxSimpleApplication.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
        application.run(args);
	}

}
