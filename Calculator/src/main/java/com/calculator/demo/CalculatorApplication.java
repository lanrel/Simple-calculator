package com.calculator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.calculator.demo.model.Calculator;


@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		
		Calculator calc = new Calculator();
		
	 System.out.println(calc.addition(23, 10));	
	}

}
