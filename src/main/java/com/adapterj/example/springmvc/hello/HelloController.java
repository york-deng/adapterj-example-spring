package com.adapterj.example.springmvc.hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@ModelAttribute
	void parameters(HttpServletRequest request) {
		request.setAttribute("foo", "bar");
	}
		
	@GetMapping("/hello/foo")
	public String foo(@RequestAttribute("foo") String foo) {
		return "Got 'foo' request attribute value '" + foo + "'";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello world!";
	}

}
