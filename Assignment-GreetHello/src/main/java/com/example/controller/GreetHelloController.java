package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetapi/v1")
public class GreetHelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String greetHello() {
		return "Hello World!";

	}

	@GetMapping("/greetName")
	@ResponseBody
	public String greetHelloMessage(@RequestParam(name = "name") String name) {
		return "Hello " + name + "!!";

	}
}
