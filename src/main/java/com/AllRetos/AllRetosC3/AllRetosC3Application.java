package com.AllRetos.AllRetosC3;

//import com.AllRetos.AllRetosC3.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableConfigurationProperties
//@EntityScan(basePackages = "Modelo")
@SpringBootApplication
public class AllRetosC3Application {

	public static void main(String[] args) {
		SpringApplication.run(AllRetosC3Application.class, args);
	}

}
