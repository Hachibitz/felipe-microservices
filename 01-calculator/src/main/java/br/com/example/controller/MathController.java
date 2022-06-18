package br.com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.math.operations.MathOperations;

@RestController
public class MathController {

	MathOperations operation = new MathOperations();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{
		return operation.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return operation.sub(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return operation.mult(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/squareroot/{numberOne}")
	public Double squareRoot(@PathVariable("numberOne") String numberOne) {
		return operation.squareRoot(numberOne);
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return operation.division(numberOne, numberTwo);
	}
	
	@RequestMapping(value="/avg/{numberOne}/{numberTwo}")
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return operation.average(numberOne, numberTwo);
	}
}
