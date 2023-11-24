package com.example.controller;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.*;

import org.junit.Test;

@RunWith(PowerMockRunner.class)
public class GreetHelloControllerTest {
	@InjectMocks
	GreetHelloController controller;
	
	
	@Test
	public void greetTest() {
		assertEquals("Hello World!", controller.greetHello());
	}

	@Test
	public void greethelloName(){
		assertNotNull(controller.greetHelloMessage("Mayuri"));
	}
}
