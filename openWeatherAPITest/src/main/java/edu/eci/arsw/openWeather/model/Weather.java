package edu.eci.arsw.openWeather.model;

public class Weather {
	private String key;
	private String city;
    
    
    public Weather(String city,String key){
    	this.key=key;
        this.city=city;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }
    
    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }
}
