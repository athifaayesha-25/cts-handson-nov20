package com.example.app4;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("m3")
public class App4Controller {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping
	public String greetings() {
		LOG.info("::::: greetings in m4 ::::::::");
		return "Hello World";
	}
}

