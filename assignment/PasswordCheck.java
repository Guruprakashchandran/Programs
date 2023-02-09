package com.assignment;

import java.util.Scanner;

public class PasswordCheck {

	private int len  = 0;
	private String s = "";
	private boolean stringNotExist = false;
	private void recursion(int i,int j,String[] string,String pass,int in) {
		
		if(in == string[j].length()) {
			
			s += string[j] +" " ;
			len = in;
		}
		else if(string[j].charAt(in) == pass.charAt(i+in)) {
			
			in++;
			recursion(i,j,string,pass,in);
		}
		else {
			stringNotExist = true;
//			System.out.println("Wrong Input");
			return;
		}
		return;
	}
	private void callingRecursion(String[] string,String pass){
		
		for(int i = 0;i<pass.length();++i) {
			
			for(int j = 0;j<string.length;++j) {
				
				if(pass.charAt(i) == string[j].charAt(0)) {
					
					recursion(i,j,string,pass,0);
					if(len== string[j].length()) {
						
						i += (string[j].length()-1);
						break;
					}
				}
			}
		}
		if(stringNotExist ==false) {
			
			System.out.println(s);
		}
		else {
			
			System.out.println("wrong output");
		}
	}
	private void process() {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the array length : ");
		final int arrayLength = scan.nextInt();
		final String[] string  = new String[arrayLength];
		for(int i = 0;i<arrayLength;++i) {
			
			string[i] = scan.next();
		}
		final String pass = scan.next();
		callingRecursion(string,pass);
		scan.close();
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total Arrays length : ");
		final int length = scan.nextInt();
		for(int i = 0;i<length;++i) {
			
			new PasswordCheck().process();
		}
		scan.close();
	}
}
