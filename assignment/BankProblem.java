package com.assignment;

import java.util.Scanner;

public class BankProblem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		final int size = scan.nextInt();
		System.out.print("Enter the days : ");
		final int days = scan.nextInt();
		final int[] expenditure = new int[size];
		for(int i = 0;i<size;++i) {
			
			expenditure[i] = scan.nextInt();
		}
		int sum = 0,count = 0;
		for(int i = 0;i<days;++i) {
			
			sum += expenditure[i];
		}
		for(int i = days;i<size;++i) {
			
			int average = sum/days;
			if(average*2 >= expenditure[i]) {
				
				count++;
			}
			sum = sum - expenditure[i-days];
			sum += expenditure[i];
		}
		System.out.print(count);
		scan.close();
	}
}