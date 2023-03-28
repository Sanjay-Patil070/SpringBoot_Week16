package com.GL.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GL.Library.serviceImple.LibrayRepoServiceImple;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class SamarthNarulaApplication implements CommandLineRunner {
	@Autowired
	LibrayRepoServiceImple libraryReadServiceImple;
	
	public static void main(String[] args) {
		SpringApplication.run(SamarthNarulaApplication.class, args);
		System.out.println("Instructor Samarth Narula");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("command line runner");
	log.info("Fetch All libraries ->{}",libraryReadServiceImple.getAllLibrary());
	}

}
