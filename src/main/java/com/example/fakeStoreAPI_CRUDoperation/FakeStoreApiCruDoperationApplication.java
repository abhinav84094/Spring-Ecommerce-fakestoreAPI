package com.example.fakeStoreAPI_CRUDoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;

@SpringBootApplication(scanBasePackages = {"Controllers"})
public class FakeStoreApiCruDoperationApplication {

	public static void main(String[] args) {
		
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach( entry -> System.setProperty(entry.getKey(), entry.getValue()));
		
		SpringApplication.run(FakeStoreApiCruDoperationApplication.class, args);
	}

}
