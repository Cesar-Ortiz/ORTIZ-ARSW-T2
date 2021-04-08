package edu.eci.arsw.openWeather.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.openWeather.services.IWeatherServices;

@RestController
@RequestMapping(value = "/coronavirus")
public class WeatherController {
	
	@Autowired
	IWeatherServices ows= null;
}