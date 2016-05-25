package org.smarthome.entity;

/**
 * This class models a temperature measurement.
 * 
 * @author Maxi
 *
 */
public class TemperatureSensorMeasurement {

	private int value;
	
	public TemperatureSensorMeasurement() {
		
	}
	
	public TemperatureSensorMeasurement(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

}
