package com.assignment;

import java.util.Scanner;

public class MovingClockwiseOnArray {

	private void moveClockwise(int size,int[][] array) {
		
		final int[][] temp = new int[size][size];
		int k = 0,l = 0;
		for(int i = size-1;i>=0;--i,k++) {
			l = 0;
			for(int j = 0;j < size;++j,l++) {
				
				temp[k][l] = array[j][i];
			}
		}
		new MovingClockwiseOnArray().print(temp,size);
	}
	private void print(int[][] temp,int size) {
		
		for(int i = 0;i<size;++i) {
			
			for(int j = 0;j<size;++j) {
				
				System.out.print(temp[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	private void onetoAnother() {
		
		Scanner scan = new Scanner(System.in);
		final int size = scan.nextInt();
		final int[][] array = new int[size][size];
		for(int i = 0;i<size;++i) {	
			for(int j = 0;j<size;++j) {
				
				array[i][j] = scan.nextInt();
			}
		}	
		new MovingClockwiseOnArray().moveClockwise(size,array);
		scan.close();
	}
	public static void main(String[] args) {
		
		new MovingClockwiseOnArray().onetoAnother();
	}
}
