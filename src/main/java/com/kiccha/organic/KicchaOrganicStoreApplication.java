package com.kiccha.organic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages= {"com.kiccha.organic.entities.*"})
@ComponentScan(basePackages= {"com.kiccha.organic.*"})
public class KicchaOrganicStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(KicchaOrganicStoreApplication.class, args);
	}

}
