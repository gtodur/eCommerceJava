package com.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guruprasad.Todur
 *
 */
@RestController
public class HelloWorldController {
	
	@GetMapping(value = "/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}

}
