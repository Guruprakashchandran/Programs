package com.programs;

import java.util.Scanner;

public class SubStringmatch {

	public static int stringMatches(char a[],char b[]) {
		
		boolean charExist = false;
		for(int index = 0;index<b.length;++index) {
			
			for(int innerIndex = 0;innerIndex<a.length;++innerIndex) {
				
				if(a[innerIndex] == b[index]) {
				
					a[innerIndex] = '1';
					charExist = true;
					break;
				}
			}
			if(charExist == false) {
				
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Super Strings Length : ");
		int superStringssLength = scan.nextInt();
		String superStrings[] = new String[superStringssLength];
		for(int i = 0;i<superStrings.length;++i) {
			
			superStrings[i] = scan.nextLine();
		}
		scan.nextLine();
		System.out.print("Sub Strings Length : ");
		int length1 = scan.nextInt();
		scan.nextLine();
		String subStrings[] = new String[length1];
		for(int i = 0;i<subStrings.length;++i) {
			
			subStrings[i] = scan.nextLine();
		}
		int match = 0,count =0;
		for(int index = 0;index<superStrings.length;++index) {
			
			match = 0;
			for(int innerIndex = 0;innerIndex<subStrings.length;++innerIndex) {
				
				match += stringMatches(superStrings[index].toCharArray(),subStrings[innerIndex].toCharArray());
				if(match  == 0) {
					
					break;
				}
			}
			if(match == subStrings.length) {
				
				count++;
			}
		}
		System.out.println("count : "+count);
		scan.close();
	}
}
