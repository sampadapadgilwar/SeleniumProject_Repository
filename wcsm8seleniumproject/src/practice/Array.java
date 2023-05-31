package practice;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		System.out.println("Enter the value of row:");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		System.out.println("enter the value of column:");
		int c = sc.nextInt();
		int array[][]= new int[r][c];
		System.out.println("enter element from user:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) 
				array[i][j] = sc.nextInt();
			
		}
			System.out.println("print the array value");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) 
					System.out.print(array[i][j] + " ");
					System.out.println();
				
			}
		}
	
}
