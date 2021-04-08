package edu.eci.arsw.coronavirus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.coronavirus.service.CoronavirusServices;

@RestController
@RequestMapping(value = "/coronavirus")
public class CoronavirusAPIControllers {
	
	@Autowired
    CoronavirusServices cs= null;
}