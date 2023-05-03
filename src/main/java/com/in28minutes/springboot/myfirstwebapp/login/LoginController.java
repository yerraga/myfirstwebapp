package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.myfirstwebapp.AuthenticationService.AuthenticationService;

@Controller
public class LoginController {
	private Logger logger = org.slf4j.LoggerFactory.getLogger(LoginController.class);
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginPage() {
		return "login";
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (authenticationService.authentication(name, password)) {
		model.put("name", name);
		return "welcome";
		}
		model.put("errorMessage", "Invalid credentials please try again.");
		return "login";
	}
}
