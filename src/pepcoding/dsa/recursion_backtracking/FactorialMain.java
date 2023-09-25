package pepcoding.dsa.recursion_backtracking;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Value of N : ");
		int n = scn.nextInt();
		System.out.println(factorialOfNum(n));
	}
	public static int factorialOfNum(int n) {
		if(n==1) {
			return 1;
		}
		return n*factorialOfNum(n-1);
	}
}
