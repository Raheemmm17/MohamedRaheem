package programs;
import java.util.Scanner;

public class Problem3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();

	        for (int i = 1; i <= a; i += 2) {
	            System.out.print(i + (i + 2 <= a ? ", " : ""));
	        }
	    }
}
