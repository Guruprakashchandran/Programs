package com.programs;

import java.util.Scanner;

public class SplitIntoTwoArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int numberLength =scan.nextInt();
		int number[] = new int[numberLength];
		int total=0;
		int array1[] = new int[numberLength]; 
		int array2[] = new int[numberLength];
		int array1Length = 0,array2Length = 0;
		for(int i = 0;i<number.length;++i) {
			
			number[i] = scan.nextInt();
			total += number[i];
		}
		if(total % 2 != 0) {
			
			System.out.println("Do not Split two Array");
		}
		else {
			
			for(int index = 0;index<number.length;++index) {
				
				for(int innerIndex = index+1;innerIndex<number.length;++innerIndex) {
					
					if(number[index] > number[innerIndex]) {
						
						int temp = number[index];
						number[index] = number[innerIndex];
						number[innerIndex] = temp;
					}
				}
			}
			int value = total/2;
			for(int index = number.length-1;index>=0;--index) {
				if(number[index]<=value) {
					
					
					if(value == number[index]) {
						
						array1[array1Length++] = number[index];
						value -= number[index];
						number[index] = Integer.MAX_VALUE;
						break;
					}
					else {
						
						array1[array1Length++] = number[index];
						value = value - number[index];
						number[index] = Integer.MAX_VALUE;
					}
				}
			}
			if(value == 0) {
				value = total/2;
				for(int i = 0;i<number.length;++i) {
				
					if(number[i]!= Integer.MAX_VALUE) {
						
						array2[array2Length++] = number[i]; 
					}
				}
				System.out.println("1 Array");
				for(int index = 0;index<array1Length;++index) {
					System.out.println(array1[index]);
				}
				System.out.println("2 Array");
				for(int index = 0;index<array2Length;++index) {
					System.out.println(array2[index]);
				}
			}
			else {
				
				System.out.println("Cant Split two Arrays");
			}
		}	
		scan.close();
	}
}
