package edu.eci.arsw.openWeather.persistence;

import edu.eci.arsw.openWeather.model.Weather;

public interface OpenWeatherPersistence {
	public Weather searchCity(String city);
}
