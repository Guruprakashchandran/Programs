package java_program;

import java.util.Scanner;

public class SnakePattern {

	public void pattern1(int n,int size,int start) {
		
		for(int i = 0;i<n*2-1;++i) {
			
			if((size-n>i) || (i>size-1)) {
				
				System.out.print("\t");
			}
			else {
				
				System.out.print(start+++"\t");
			}
		}
	}
	public void pattern2(int n,int size,int start) {
		
		for(int i = 0;i<n*2-1;++i) {
			
			if((size-n>i) || (i>size-1)) {
				
				System.out.print("\t");
			}
			else {
				
				System.out.print(start--+"\t");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			SnakePattern pattern = new SnakePattern();
			System.out.print("Enter the Input : ");
			int n = scan.nextInt();
			int size = n*2;
			int value = 0;
			int start = 1,end = n;
			for(int i = 0;i<n;++i) {
				while(i%2 == 0) {
					value = value+1;
					start = value;
					pattern.pattern1(n,--size,start);
					break;
				}
				while(i%2 == 1) {
					value = (i+1)*n;
					end = value;
					pattern.pattern2(n,--size,end);
					break;
				}
				System.out.println();
				start = n+1;
				end = n*2;
			}
			System.out.println(2^3);
			//0010
			//0010
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			scan.close();
		}
	}
}
