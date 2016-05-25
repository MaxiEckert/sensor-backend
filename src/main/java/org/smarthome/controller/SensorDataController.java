package org.smarthome.controller;

import org.smarthome.entity.TemperatureSensorMeasurement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling sensor data via REST-Interface.
 * 
 * @author Maximilian Eckert
 *
 */
@RestController
@RequestMapping("/sensordata")
public class SensorDataController {

	@RequestMapping(value = "/temperature", 
			method = RequestMethod.POST, 
			produces = "application/json",
			consumes = "application/json")
    public @ResponseBody TemperatureSensorMeasurement addTemperatureMeasurement(@RequestBody TemperatureSensorMeasurement t) {
       	System.out.println("received POST!");
       	return t;
    }
}
