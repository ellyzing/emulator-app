package com.emulatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages={"com.springboot.emulatorapp","com.springboot.emulatorapp.controller","com.springboot.emulatorapp.model","com.springboot.emulatorapp.service"})
public class EmulatorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmulatorAppApplication.class, args);
	}

}