package pepcoding.dsa.recursion_backtracking;

import java.util.Scanner;

public class PrintDecreasingIncreasingMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = scn.nextInt();
		printDecreasingIncreasing(n);
	}
	public static void printDecreasingIncreasing(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		printDecreasingIncreasing(n-1);
		System.out.println(n);
		
	}
}
