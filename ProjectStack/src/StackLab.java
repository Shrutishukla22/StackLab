import java.util.Scanner;
import java.util.Stack;

public class StackLab {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter the problem you want to solve");
		String userInput = scan1.nextLine();
		// char[] cArray = userInput.toCharArray();
		int a = 0;
		int b = 0;
		int c = 0;
		int multiplication = 0;
		int input = 0;
		int add = 0;
		for (int i = 0; i < userInput.length(); i++) {
			if (userInput.charAt(i) == '5') {

				input = Character.getNumericValue(userInput.charAt(i));

				s.push(input);
				a = s.pop();
			} else if (userInput.charAt(i) == '2') {
				input = Character.getNumericValue(userInput.charAt(i));

				s.push(input);
				b = s.pop();
			} else if (userInput.charAt(i) == '*') {
				multiplication = a * b;
				System.out.println(multiplication);
			} else if (userInput.charAt(i) == '3') {
				input = Character.getNumericValue(userInput.charAt(i));

				s.push(input);
				c = s.pop();
			} else if (userInput.charAt(i) == '+') {
				add = multiplication + c;
				System.out.println(add);
			}

		}

	}
}
