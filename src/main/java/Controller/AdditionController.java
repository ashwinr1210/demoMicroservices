package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.AddService;




	@RestController
	@CrossOrigin(origins = "*",allowCredentials = "true",allowedHeaders = "*")
public class AdditionController {
		@Autowired
		AddService service;
		@PostMapping("/add")
		public Integer login( @RequestParam int number1,@RequestParam int number2) {
			Integer result = service.addNumbers(number1,number2);
			System.out.println("*******************");
			return result;
		}
		
}
