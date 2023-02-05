package com.programs;

import java.util.Scanner;

public class PrintValueBetweenXAndY {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			
			System.out.print("Enter the N value : ");
			int n = scan.nextInt();
			System.out.print("Enter the X value : ");
			int x = scan.nextInt();
			System.out.print("Enter the Y value : ");
			int y = scan.nextInt();
			int[] array = new int[n];
			int j = 0;
			for(int i = 0;i<n;++i) {
				
				array[i] = scan.nextInt();
			}
			for(int i = 0;i<array.length;++i) {
				
				if(array[i]>x && array[i] < y) {
					
					array[j] = array[i];
					j++;
				}
			}
			for(int i = 0;i<j;++i) {
				
				System.out.print(array[i]+" ");
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			scan.close();
		}
	}
}
