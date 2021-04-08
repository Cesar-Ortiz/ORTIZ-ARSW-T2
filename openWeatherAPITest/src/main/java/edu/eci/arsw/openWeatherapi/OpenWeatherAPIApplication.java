package edu.eci.arsw.openWeatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"edu.eci.arsw.openWeather"})
public class OpenWeatherAPIApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OpenWeatherAPIApplication.class, args);
	}
}
