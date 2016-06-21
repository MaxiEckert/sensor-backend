package org.smarthome.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class models a temperature measurement.
 * 
 * @author Maxi
 *
 */
public class TemperatureSensorMeasurement {

	private int temp;
	private int humidity;
	
	private long timestamp; 
	
	public TemperatureSensorMeasurement() {
		
	}
	
	public TemperatureSensorMeasurement(int temp, int humidity, long timestamp) {
		this.temp = temp;
		this.humidity = humidity;
		this.timestamp = timestamp;
	}

	/**
	 * @return the temp value
	 */
	public int getTemp() {
		return temp;
	}

	/**
	 * @return the humidity value
	 */
	public int getHumidity() {
		return humidity;
	}
	
	/**
	 * @return the timestamp value
	 */
	public long getTimestamp() {
		return timestamp;
	}
	
	public String getTimeString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return df.format(timestamp);
	}
}
