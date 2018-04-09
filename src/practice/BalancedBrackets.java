package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	private static boolean isBalanced(String expression) {
		if (expression.length()%2 == 1 || expression.length() == 0) return false;
		ArrayList<Character> open = new ArrayList<>();
		open.add('{');open.add('[');open.add('(');
		Stack<Character> stack = new Stack<>();
		for (char c: expression.toCharArray()){
			if (open.contains(c)){
				stack.push(c);
			}else{
				if (!stack.empty()){
					Character peek = stack.peek();
					if (peek != null){
						if (!check_char(peek, c)){
							return false;
						}else {
							stack.pop();
						}
					}
				}else{
					return false;
				}
			}
		}
		return stack.empty();
	}

	private static boolean check_char(char open, char back) {
		switch (open) {
			case '{':
				return back == '}';
			case '[':
				return back == ']';
			default:
				return back == ')';
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = 1;
		for (int a0 = 0; a0 < t; a0++) {
			String expression = "{{}(";
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
	}
}
