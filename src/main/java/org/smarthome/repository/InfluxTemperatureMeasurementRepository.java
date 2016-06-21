package org.smarthome.repository;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;
import org.smarthome.entity.TemperatureSensorMeasurement;

public class InfluxTemperatureMeasurementRepository {
	
	private InfluxDB influxDB;
	private String dbName = "sensordata";
	
	private InfluxTemperatureMeasurementRepository() {
		influxDB = InfluxDBFactory.connect("http://192.168.0.14:8086", "root", "root");
	}

	public static InfluxTemperatureMeasurementRepository createTemperatureMeasurementRepository() {
		return new InfluxTemperatureMeasurementRepository();
	}

	public void save(TemperatureSensorMeasurement m) {
		Point p = Point.measurement("temperature")
                .time(System.currentTimeMillis(), TimeUnit.MILLISECONDS)
                .addField("temp", m.getTemp())
                .addField("humidity", m.getHumidity())
                .build();
		
		influxDB.write(dbName, "default", p);
	}

	public List<TemperatureSensorMeasurement> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
