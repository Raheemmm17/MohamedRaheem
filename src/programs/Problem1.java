package programs;
import java.util.Scanner;

public class Problem1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter b: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter operation (add, subtract, multiply, divide): ");
	        String op = sc.next();

	        Calculator calc = new Calculator(a, b, op);
	        double result = calc.calculate();
	        System.out.println("Result: " + result);
	    }
}
