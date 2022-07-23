package com.sanchez.di.spring;

import org.springframework.stereotype.Component;

@Component
public class Perro implements SerVivo{

	@Override
	public void hablar(String texto) {
		System.out.println("Ladro: " + texto);
	}

}
