package com.prasad.Login.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.Login.Entity.Login;
import com.prasad.Login.Service.LoginServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000") 
public class LoginController {
	private static Logger logger = LogManager.getLogger();
	
	@Autowired
	LoginServiceImpl impl;
	
	
	@PostMapping("/loginC")
	public boolean login(@RequestBody Login loginc){
			logger.info("sending request to custoer login");
			return impl.login(loginc);
			
			
		}
		
	
	@PostMapping("/AdminLogin")
	public boolean AdminLogin(@RequestBody Login loginc){
		logger.info("sending request to admin login");
		return impl.AdminLogin(loginc);
		
	}

}