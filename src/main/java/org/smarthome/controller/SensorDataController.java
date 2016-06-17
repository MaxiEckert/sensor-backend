package org.smarthome.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.time.*;

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
       	System.out.println("received measurement: " + LocalTime.now() + "	temp: " + t.getTemp() + ", humidity: " + t.getHumidity());
       	//TODO persist measurement
       	return t;
    }
	
	@RequestMapping(value = "/temperature", 
			method = RequestMethod.GET, 
			produces = "application/json")
    public @ResponseBody List<TemperatureSensorMeasurement> getAllTemperatureMeasurements() {
       	System.out.println("received GET!");
       	//TODO load persisted measurements
       	TemperatureSensorMeasurement t1 = new TemperatureSensorMeasurement(27, 43);
       	TemperatureSensorMeasurement t2 = new TemperatureSensorMeasurement(26, 56);
       	List<TemperatureSensorMeasurement> results = new ArrayList<TemperatureSensorMeasurement>();
       	results.add(t1);
       	results.add(t2);
       	return results;
    }
}
