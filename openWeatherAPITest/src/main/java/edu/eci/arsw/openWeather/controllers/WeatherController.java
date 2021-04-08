package edu.eci.arsw.openWeather.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.openWeather.services.IWeatherServices;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {
	
	@Autowired
	IWeatherServices ws;
	    
    @RequestMapping(path = {"weather/{city}"},method = RequestMethod.GET)
    public ResponseEntity<?> buscarPorCiudad(@PathVariable String city){
        try{
            return new ResponseEntity<>(ws.searchCity(city),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(WeatherController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontró la ciudad :"+city,HttpStatus.NOT_FOUND);
        }
    }
}