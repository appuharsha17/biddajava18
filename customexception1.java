package javop;

class DivisionByZeroException extends Exception {
	 public DivisionByZeroException(String message) {
	     super(message);
	 }
	}
	class Calculator {
	 public static double divide(int numerator, int denominator) throws DivisionByZeroException {
	     if (denominator == 0) {
	         throw new DivisionByZeroException("Division by zero is not allowed.");
	     }
	     return (double) numerator / denominator;
	 }
	}
	
	public class customexception1 {
	 public static void main(String[] args) {
	     try {
	         // Example division
	         int numerator = 10;
	         int denominator = 0;

	         double result = Calculator.divide(numerator, denominator);
	         System.out.println("Result of division: " + result);
	     } catch (DivisionByZeroException e) {
	         System.err.println("Error: " + e.getMessage());
	     } finally {
	         System.out.println("Finally block executed.");
	     }
	 }
	}
