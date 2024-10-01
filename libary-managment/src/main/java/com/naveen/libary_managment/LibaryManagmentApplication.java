package com.naveen.libary_managment;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class LibaryManagmentApplication {

	public static void main(String[] args) {
		Dotenv dotenv=Dotenv.load();
		System.setProperty("MYSQL_USERNAME", Objects.requireNonNull(dotenv.get("MYSQL_USERNAME")));
		System.setProperty("MYSQL_PASSWORD", Objects.requireNonNull(dotenv.get("MYSQL_PASSWORD")));
		SpringApplication.run(LibaryManagmentApplication.class, args);
	}

}
