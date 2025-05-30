package com.CICDTest01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class Controllers {

	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to CICD pipeLine with Github Action";
	}

}
