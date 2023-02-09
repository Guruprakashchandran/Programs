package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	private void sorting() {
		
		Scanner scan = new Scanner(System.in);
		final int length = scan.nextInt();
		final int[] array = new int[length];
		for(int i = 0;i<length;++i) {
			
			array[i] =scan.nextInt();
		}
		for(int i = 1;i<length;++i) {
			
			for(int j = i;j>0;j--) {
				
				if(array[j]<array[j-1]) {
		
					System.out.println(j);
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
				else break;
			}
		}
		System.out.println(Arrays.toString(array));
		scan.close();
	}
	public static void main(String[] args) {
		
		new InsertionSort().sorting();
	}
}
