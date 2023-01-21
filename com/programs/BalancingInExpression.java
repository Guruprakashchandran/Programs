package com.programs;

import java.util.Scanner;
import java.util.Stack;

public class BalancingInExpression {
	
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<>();
		Scanner scan =new Scanner(System.in);
		String expression = scan.nextLine();
		boolean invalid = false;
		for(int index = 0;index<expression.length();++index) {
		
			if(expression.charAt(index) == '(') {
				
				stack.push(expression.charAt(index));
			}
			else if((expression.charAt(index) >= 'A'&& expression.charAt(index) <= 'Z') || (expression.charAt(index) >= 'a' && expression.charAt(index) <= 'z')) {
				
				if(index+1 < expression.length() && ((expression.charAt(index+1) >= 'A'&& expression.charAt(index+1) <= 'Z') || (expression.charAt(index+1) >= 'a' && expression.charAt(index+1) <= 'z'))) {
					
					invalid = true;
					System.out.println("invalid");
					break;
					
				}
				else {
					
					continue;
				}
			}
			else if(expression.charAt(index) == '+' || expression.charAt(index) == '-' || expression.charAt(index) == '*' || expression.charAt(index) == '/') {
				
				if((index-1)>-1 && (index+1)<expression.length() && ((expression.charAt(index + 1) >= 'a' && expression.charAt(index+1) <= 'z') || (expression.charAt(index + 1) >= 'A' && expression.charAt(index+1) <= 'Z')) &&((expression.charAt(index - 1) >= 'a' && expression.charAt(index-1) <= 'z') || (expression.charAt(index - 1) >= 'A' && expression.charAt(index-1) <= 'Z'))) {
					
					continue;
				} 
				else {
					
					System.out.println("Invalid");
					invalid = true;
					break;
				}
			}
			else {
				
				if(stack.isEmpty()) {
					
					System.out.println("invalid");
					break;
				}
				else {
					
					stack.pop();
				}
			}
		}
		if(stack.isEmpty() ) {
			
			if(invalid == false) {
				System.out.println("Expression : valid");
			}
		}
		else if(invalid == false){
				System.out.println("Expression : Invalid");
		}
		scan.close();
	}
}
