package com.programs;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.print("Enter the String 1 : ");
			String s1 = scan.nextLine();
			System.out.print("Enter the String 2 :");
			String s2 = scan.nextLine();
			String s3 = "";
			for(int i = 0;i<s1.length();++i) {
				
				if(s1.charAt(i)+(s2.charAt(i)-97) < 123) {
					s3 += (char)(s1.charAt(i)+(s2.charAt(i)-96));
				}
				else {
					int value = s1.charAt(i)+(s2.charAt(i)-96) - 122;
					s3 += (char)(96+value);
				}
			}
			System.out.println("Output : "+s3);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			scan.close();
		}
	}
}
