package org.smarthome;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
 * Main class. Starts the spring boot application.
 * 
 * @author Maximilian Eckert
 *
 */
@SpringBootApplication
public class SensorBackendMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SensorBackendMain.class, args);
    }

}