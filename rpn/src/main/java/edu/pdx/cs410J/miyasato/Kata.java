package edu.pdx.cs410J.miyasato;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
	
	
	public static void main(String[] args) {
		System.err.println("Missing command line arguments");
		System.exit(1);
	}
	
	public static int RPN(String... args) throws IllegalArgumentException {
		Stack<Integer> stack = new Stack();
		int result = 0;
		int first;
		int second;
		
		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
				case "/":
					if (stack.size() < 2) {
						throw new IllegalArgumentException("no enough parameters");
					}
					second = stack.pop();
					first = stack.pop();
					
					result = first / second;
					
					break;
				case "+":
					if (stack.size() < 2) {
						throw new IllegalArgumentException("no enough parameters");
					}
					second = stack.pop();
					first = stack.pop();
					
					result = first + second;
					break;
				case "-":
					if (stack.size() < 2) {
						throw new IllegalArgumentException("no enough parameters");
					}
					second = stack.pop();
					first = stack.pop();
					
					result = first - second;
					break;
				case "*":
					if (stack.size() < 2) {
						throw new IllegalArgumentException("no enough parameters");
					}
					second = stack.pop();
					first = stack.pop();
					
					result = first * second;
					
					break;
				default:
					stack.push(Integer.parseInt(args[i]));
					break;
			}
		}
		
		return result;
	}
}