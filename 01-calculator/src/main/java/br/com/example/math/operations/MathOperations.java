package br.com.example.math.operations;

import br.com.example.exception.InvalidOperatorException;

public class MathOperations {

	MathValidation validation = new MathValidation();
	
	public MathOperations() {
		
	}
	
	public Double sum(String numberOne, String numberTwo) {
		if (!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new InvalidOperatorException("must be a valid number");
		}else {
			Double sub = validation.convertToDouble(numberOne)-validation.convertToDouble(numberTwo);
			return sub;
		}
	}

	public Double sub(String numberOne, String numberTwo) {
		if (!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new InvalidOperatorException("must be a valid number");
		}else {
			Double sub = validation.convertToDouble(numberOne)-validation.convertToDouble(numberTwo);
			return sub;
		}
	}

	public Double mult(String numberOne, String numberTwo) {
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new InvalidOperatorException("must be a valid number");
		}else {
			Double mult = validation.convertToDouble(numberOne) * validation.convertToDouble(numberTwo);
			return mult;
		}
	}

	public Double squareRoot(String numberOne) {
		if(!validation.isNumeric(numberOne)) {
			throw new InvalidOperatorException("must be a valid number");
		}else {
			Double squareRoot = Math.sqrt(validation.convertToDouble(numberOne));
			return squareRoot;
		}
	}

	public Double division(String numberOne, String numberTwo) {
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new InvalidOperatorException("must be a valid number");
		}else {
			Double division = validation.convertToDouble(numberOne) / validation.convertToDouble(numberTwo);
			return division;
		}
	}
	
	public Double average(String numberOne, String numberTwo) {
		if(!validation.isNumeric(numberOne) || !validation.isNumeric(numberTwo)) {
			throw new InvalidOperatorException("must be a valid number");
		}else {
			Double average = (validation.convertToDouble(numberOne) + validation.convertToDouble(numberTwo))/2;
			return average;
		}
	}
}
