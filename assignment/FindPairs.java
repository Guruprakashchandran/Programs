package com.assignment;

import java.util.Scanner;

public class FindPairs {

	private void sort(int[] sortedArray,int length) {
		
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
	private void pairs(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length : ");
		final int length = scan.nextInt();
		System.out.print("Enter the k value : ");
		final int k = scan.nextInt();
		final int[] sortedArray = new int[length];
		for(int i = 0;i<length;++i) {
			
			sortedArray[i] = scan.nextInt();
		}
		sort(sortedArray,length);
		int start,end;
		boolean exist = false;
		
		System.out.println("pairs : ");
		for(int i = 0;i<length-1;++i) {
			start = i;
			end = length-1;
			while(start < end) {

				if((sortedArray[start] + sortedArray[end])%k == 0) {
					
					exist = true;
					System.out.println(sortedArray[start]+" "+sortedArray[end]);
					break;
				}
				else if((sortedArray[start] + sortedArray[end])%k > 0 ) {
					
					end--;
				}
				else {
					
					start++;
				}
			}
		}
		if(exist == false) {
			
			System.out.println("Pairs Not found");
		}
		scan.close();
	}
	public static void main(String[] args) {
		
		new FindPairs().pairs();
	}
}
