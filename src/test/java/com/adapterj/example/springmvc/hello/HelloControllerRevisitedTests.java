package com.adapterj.example.springmvc.hello;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.http.MediaType;

public class HelloControllerRevisitedTests {

	@Test
	public void hello() throws Exception {
		standaloneSetup(new HelloControllerRevisited()).build()
			.perform(get("/hello/revisited").accept(MediaType.TEXT_PLAIN))
			.andExpect(status().isOk())
			.andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
			.andExpect(content().string("Hello world revisited!"));
	}

}
