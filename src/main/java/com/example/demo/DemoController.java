package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/index")
	public String index(Authentication authentication, Model model) {
		if (authentication != null) {
			LOGGER.debug("index() ################ Name: {}", authentication.getName());
		} else {
			LOGGER.debug("index() ################ Authentication is null");
		}
		return "index";
	}

}
