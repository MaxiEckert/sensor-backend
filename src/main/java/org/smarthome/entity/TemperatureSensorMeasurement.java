package org.smarthome.entity;

/**
 * This class models a temperature measurement.
 * 
 * @author Maxi
 *
 */
public class TemperatureSensorMeasurement {

	private int temp;
	private int humidity;
	
	public TemperatureSensorMeasurement() {
		
	}
	
	public TemperatureSensorMeasurement(int temp, int humidity) {
		this.temp = temp;
		this.humidity = humidity;
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
}
