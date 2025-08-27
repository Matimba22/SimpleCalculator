import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//step 1: get two numbers
		System.out.print("Enter the first number:");
		double num1 = scanner.nextDouble(); // nextDouble Reads a decimal number from the user
		
		System.out.print("Enter the second number");
		double num2 = scanner.nextDouble();
		
		//step 2: get the operation
		System.out.print("Enter an operation (+, -, *, /):");
		char operation = scanner.next().charAt(0); //scanner.next() Reads a word or character input from the user (like +, -, hello. as a String).
		//charAt(0) Gets the first character of that input/String
		
		double result;
		
		//step 3: perform calculation
		switch (operation) {
		 
		case '+':
			result = num1 + num2;
			System.out.println("Result:" + result);
			break;
			
		case '-':
			result = num1 - num2;
			System.out.println("Result:" + result);
			break;
			
		case '*':
			result = num1 * num2;
			System.out.println("Result:" + result);
			break;
			
		case '/':
			if(num2 != 0) {
				result = num1 / num2;
				System.out.println("Result:" + result);
			}else {
				System.out.println("Error: Cannot divide by zero.");
			}
			break;
		
		default:
				System.out.println("Invalid operation");
				break;
		}
		
	}

}
