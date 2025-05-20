package programs;

public class Calculator {
	double a, b;
	String operation;

	public Calculator(double a, double b, String operation) {
		this.a = a;
		this.b = b;
		this.operation = operation;
	}

	public double calculate() {
		return switch (operation.toLowerCase()) {
		case "add" -> a + b;
		case "subtract" -> a - b;
		case "multiply" -> a * b;
		case "divide" -> (b != 0) ? a / b : Double.NaN;
		default -> Double.NaN;
		};
	}
}
