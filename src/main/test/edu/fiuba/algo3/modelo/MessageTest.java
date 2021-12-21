package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MessageTest {
	@Test
	public void messageGreeting() {
		Message message = new Message("Hola Mundo!", "Hello world!");

		assertEquals("Hello world!", message.greet("us"));
	}

	@Test
	public void messageGreetingDefaultLanguage() {
		Message message = new Message("Hola Mundo!", "Hello world!");

		assertEquals("Hola Mundo!", message.greet());
	}
}
