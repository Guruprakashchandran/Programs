package com.assignment;

import java.util.Scanner;

public class TwoFlavor {

	private void swap(int[] sortedArray,int length) {
		
		for(int i = 0;i<length-1;++i) {
			
			for(int j = i+1;j<length;++j) {
				
				if(sortedArray[i]>sortedArray[j]) {
					
					sortedArray[i] = sortedArray[i] + sortedArray[j];
					sortedArray[j] = sortedArray[i] - sortedArray[j];
					sortedArray[i] = sortedArray[i] - sortedArray[j];
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the total money : ");
		final int money = scan.nextInt();
		System.out.print("Enter the length : ");
		final int length = scan.nextInt();
		final int[] flavors = new int[length];
		final int[] sortedArray = new int[length];
		for(int i = 0;i<length;++i) {
			
			flavors[i] = scan.nextInt();
			sortedArray[i] = flavors[i];
		}
		new TwoFlavor().swap(sortedArray, length);;
	int start = 0,end = length-1;
		boolean exist = false,index = false;
		for(int i = 0;i<length-1;++i) {
			start = i;
			end = length-1;
			while(start < end) {

				if(sortedArray[start] + sortedArray[end] == money) {
					
					exist = true;
					index = true;
					break;
				}
				else if(sortedArray[start] + sortedArray[end] > money) {
					
					end--;
				}
				else {
					
					start++;
				}
			}
			if(exist == true) {
				
				exist = false;
				System.out.print("Two Indices : ");
				for(int j = 0;j<length;++j) {
				
					if(sortedArray[start] == flavors[j]) {
						
						System.out.print((j+1) +" ");
					}
					else if(sortedArray[end] == flavors[j]) {
						
						System.out.println((j+1)+" ");
					}
				}
			}
		}
		if(index == false) {
			
			System.out.println("two flavors not equal to money");
		}
		scan.close();
	}
}
