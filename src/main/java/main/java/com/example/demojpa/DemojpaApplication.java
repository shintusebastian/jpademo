package main.java.com.example.demojpa;

import main.java.com.example.demojpa.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemojpaApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext applicationContext =
		SpringApplication.run(DemojpaApplication.class, args);
//		Product product = applicationContext.getBean(Product.class);
//		System.out.println("product = " + product);
		//this will print Product object from dev profile as the dev profile is active in application.yml

	}

}
