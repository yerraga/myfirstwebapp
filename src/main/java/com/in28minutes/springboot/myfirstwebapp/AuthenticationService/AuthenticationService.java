package com.in28minutes.springboot.myfirstwebapp.AuthenticationService;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authentication (String username, String password) {
		
		boolean isValidateUsername = username.equalsIgnoreCase("Ganesh");
		boolean isValidatePassword = password.equalsIgnoreCase("YGs*25719");
		
		return isValidateUsername && isValidatePassword;
	}

}
