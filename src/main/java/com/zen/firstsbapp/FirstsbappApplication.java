package com.zen.firstsbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstsbappApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FirstsbappApplication.class, args);
		ApplicationContext context = SpringApplication.run(FirstsbappApplication.class, args);

		GreetingService gs = context.getBean("greetingService", GreetingService.class);
		gs.greet();
	}

	
}
