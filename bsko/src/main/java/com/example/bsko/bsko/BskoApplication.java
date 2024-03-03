package com.example.bsko.bsko;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BskoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BskoApplication.class, args);
	}

}
class Coffee{
	private final String id;
	private String name;

	public Coffee(String id, String name){
		this.id = id;
		this.name = name;
	}
	public Coffee(String name){
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}