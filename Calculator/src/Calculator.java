import java.util.Scanner;

public class Calculator {

	public static int add(int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
	}
	
	public static int sub(int num1, int num2) {
		
		int result = num1 - num2;
		
		return result;
	}
	
	public static int multiply(int num1, int num2) {
		
		int result = num1 * num2;
		
		return result;
	}
	
	public static int division(int num1, int num2) {
		
		int result = num1 / num2;
		
		return result;
	}
	
	public static int mod(int num1, int num2) {
		
		int result = num1 % num2;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
			
		String calcContinue = "continue";
		
		while (!calcContinue.equalsIgnoreCase("!")) {
			
			System.out.println("Enter the first number");
			int num1 = userInput.nextInt();
		
			userInput.nextLine();
		
			System.out.println("Enter a operator(+, -, *, /, mod)");
			String sign = userInput.nextLine();
		
			System.out.println("Enter the second number");
			int num2 = userInput.nextInt();
		
			if (sign.equals("+")) {
				System.out.println("result: " + add(num1,num2));
			
			} else if (sign.equals("-")) {
				System.out.println("result: " + sub(num1,num2));
			
			} else if (sign.equals("*")) {
				System.out.println("result: " + multiply(num1,num2));
			
			} else if (sign.equals("/")) {
			
				if (num2 == 0) {
					System.out.println("Error: cannot divide by 0");
				} else {
					System.out.println("result: " + division(num1,num2));
				}
			
			} else if (sign.equals("mod")) {
				System.out.println("result: " + mod(num1,num2));
		
			} else {
				System.out.println("invalid operator");
			}
		
			System.out.println("Would you like to go again? Press ! to exit");
			calcContinue = userInput.nextLine();
			
			userInput.nextLine();
		}	
		
		
		userInput.close();
	}
		
}
