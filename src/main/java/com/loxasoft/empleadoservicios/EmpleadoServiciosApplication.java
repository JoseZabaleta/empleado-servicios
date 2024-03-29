package com.loxasoft.empleadoservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmpleadoServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpleadoServiciosApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){// RestTemplate permite comuinicarse entre los microservicios
		return  new RestTemplate();
	}
}
