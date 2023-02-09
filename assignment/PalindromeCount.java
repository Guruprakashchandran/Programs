package com.assignment;

import java.util.Scanner;

public class PalindromeCount {

	private void call(String s) {
		
		int count = 0;
		for(int i = 0;i<s.length();++i) {
			
			for(int j = i+1;j<s.length();++j) {
				
				if(s.charAt(i) == s.charAt(j)) {
					
					count++;
					break;
				}
			}
			if(count == 1) {
				
				break;
			}
		}
		if(count == 1) {
			if(s.length()-2 == 0) {
				
				System.out.println("1");
			}
			else {
				System.out.println(s.length()-2);
			}
		}
		else {
			
			System.out.println("1");
		}
	}
	private void count(int[][] input,String str) {
		
		
		for(int i = 0;i<input.length;++i) {
			String s = "";
			for(int j = 0;j<input[i][1];++j) {
				
				if(j>=input[i][0]-1 && j+1<=input[i][1]) {
					s += str.charAt(j);
				}
			}
			call(s);
		}
//		System.out.println(s);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final String s = scan.next();
		final int length = scan.nextInt();
		final int[][] input = new int[length][2];
		for(int i = 0;i<length;++i) {
			
			input[i][0] = scan.nextInt();
			input[i][1] = scan.nextInt();
			
		}
		new PalindromeCount().count(input,s);
		scan.close();
	}
}
