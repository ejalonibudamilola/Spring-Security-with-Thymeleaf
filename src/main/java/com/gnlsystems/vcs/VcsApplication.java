package com.gnlsystems.vcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gnlsystems.vcs")
public class VcsApplication {

	public static void main(String[] args) {

		SpringApplication.run(VcsApplication.class, args);
	}



}
