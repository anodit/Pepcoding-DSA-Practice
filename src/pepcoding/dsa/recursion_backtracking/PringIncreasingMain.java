package pepcoding.dsa.recursion_backtracking;

import java.util.Scanner;

public class PringIncreasingMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = scn.nextInt();
		printIncreasing(n);
	}
	
	public static void printIncreasing(int n) {
		if(n==0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}

}
