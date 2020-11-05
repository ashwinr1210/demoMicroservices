package service;


import org.springframework.stereotype.Service;


@Service
public class AddService {
	public Integer addNumbers(Integer number1,Integer number2) {
		Integer result=number1+number2;
		return result;
	} 
	}

