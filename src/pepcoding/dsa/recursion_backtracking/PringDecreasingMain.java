package pepcoding.dsa.recursion_backtracking;

import java.util.Scanner;

public class PringDecreasingMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = scn.nextInt();
		printDecreasing(n);
	}
	
	public static void printDecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}

}
