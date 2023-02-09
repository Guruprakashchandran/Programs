package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAString {

	private void swap(int i,int j,int[] numbers,String[] string,int[] index) {
		
		numbers[i] = numbers[i] + numbers[j];
		numbers[j] = numbers[i] - numbers[j];
		numbers[i] = numbers[i] - numbers[j];
		String temp = string[i];
		string[i] = string[j];
		string[j] = temp;
		index[i] = index[i] + index[j];
		index[j] = index[i] - index[j];
		index[i] = index[i] - index[j];
	}
	private void printString(String[] string,int[] index,int length) {
		
		for(int i = 0;i<length;++i) {
			
			if(index[i]<=(length/2)) {
					
					System.out.print((char)(45)+" ");
				}
			else {
					
				System.out.print(string[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		final int length = scan.nextInt();
//		final int length = 20;
		final int[] numbers = new int[length];
		final String[] string = new String[length];
//		final int[] numbers = {0,6,0,6,4,0,6,0,6,0,4,3,0,1,5,1,2,4,2,4};
//		final String[] string = {"ab","cd","ef","gh","ij","ab","cd","ef","gh","ij","that","be","to","be","question","or","not","is","to","the"};
		final int[] index = new int[length];
		for(int i = 0;i<length;++i) {
			
			System.out.print("Enter the number : ");
			numbers[i] = scan.nextInt();
			System.out.print("Enter the String : ");
			string[i] = scan.next();
			index[i] = i+1;
		}
		for(int i = 0;i<length;++i) {
			
			for(int j = 0;j<length;++j) {
				
				if(numbers[j]>numbers[i]) {

					new SortingAString().swap(i,j,numbers,string,index);
				}
				else if(numbers[i] == numbers[j] && index[i]<index[j]) {
					
					new SortingAString().swap(i,j,numbers,string,index);
				}
			}
		}
		new SortingAString().printString(string,index,length);
		scan.close();
	}
}
