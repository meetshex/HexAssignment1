package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping("/testExceptionHandling")
	public RecourceNotFoundException checkException(@RequestParam String code) {
		
		RecourceNotFoundException throwException = new RecourceNotFoundException();
	
    //Condition Checking by Code
		   if (code.equals("404")) {
			    throwException
			        .setexception("Given Resource Not Found");
			
		   return throwException;
			
		}
	//Other Requested response
		
		   else if(code.equals("401")) {
			   throwException
			       .setexception("You Are Not Authorized");
			
		   return throwException;
		}
		
	       return throwException;
		
	}
}