package com.adapterj.example.springmvc.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerRevisited {

	@GetMapping(path="/hello/revisited", headers="Accept=text/plain")
	public String hello() {
		return "Hello world revisited!";
	}
}
