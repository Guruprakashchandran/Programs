package com.assignment;

import java.util.Scanner;

public class PatternPrinting {

	private void pattern() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Pattern Size :");
		final int length = scan.nextInt();
		int start = 0, end = length - 1;
		
		if(length %2 == 1) {
			
			int values[][] = new int[length][length];
			do{
	         
				for (int i = start; i <= end; i++) { 
	            
	            			
	            	values[i][start] = 1;
	            	values[start][i] = 1;
	            	values[i][end] = 1; 
	            	values[end][i] = 1;
	            
	            }
	            
	            start += 2;
	            end -= 2;
			}while(start < end);
	        
	        values[start][end] = 1;
//	        System.out.println(start+" "+end);
	        for(int in = 0;in<length;++in) {
	        	for(int j = 0;j<length;++j) {
	        		
	        		System.out.print(values[in][j]);
	        	}
	        	System.out.println();
	        }
        }
		else {
			
			System.out.println("Enter Odd Number");
		}
		scan.close();
	}
	public static void main(String[] arg) {
	
		new PatternPrinting().pattern();
	}
}
