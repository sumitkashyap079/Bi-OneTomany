package com.demo.BiOnetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BiOnetomanyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BiOnetomanyApplication.class, args);
		System.out.println(" @@ App Started");
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootApplication.class);
	}

	@RequestMapping("/")//jar file
	public String printStartUpMessage(){
		return "App is Started";
	}

}
