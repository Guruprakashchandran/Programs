package com.programs;

import java.util.Scanner;

public class NoOfCharacter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String secondString = scan.nextLine();
		int a[] = new int[secondString.length()];

		for(int index = 0;index<secondString.length();++index) {
			for(int innerIndex = 0;innerIndex<string.length();++innerIndex) {				
				
				if(string.charAt(innerIndex) == secondString.charAt(index)) {
					
					a[index] = a[index]+1;
				}
			}
		}
		for(int i = 0 ;i<secondString.length();++i) {
			
			System.out.print(secondString.charAt(i) +":"+a[i]+" ");
		}
		scan.close();
	}
}
