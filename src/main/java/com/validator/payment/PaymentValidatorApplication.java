package com.validator.payment;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

@SpringBootApplication
public class PaymentValidatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PaymentValidatorApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PaymentValidatorApplication.class);
	}
	
	@RestController
	class PaymentValidatorRestController {
		
		private final List<String> VALID = Lists.newArrayList("111-22222-333");
		
	    @RequestMapping(value = "/validate", method = RequestMethod.POST)
	    public String Validate(@RequestBody final PaymentDetailsDTO request) {
	    	return VALID.contains(request.getAccountNumber()) ? HttpStatus.OK.name() : HttpStatus.NOT_ACCEPTABLE.name();
	    }
	    
	}
}
