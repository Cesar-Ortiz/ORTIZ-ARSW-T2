package edu.eci.arsw.openWeather.services;

import org.springframework.beans.factory.annotation.Autowired;

 edu.eci.arsw.openWeather.persistence.OpenWeatherPersistence;

public class IWeatherServices {
	
	@Autowired
    OpenWeatherPersistence wp = null;
	
	 public Weather searchCity(String city) {
		 return wp.searchCity(city);
	 }
}
