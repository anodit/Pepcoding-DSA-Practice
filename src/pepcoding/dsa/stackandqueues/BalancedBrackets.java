package pepcoding.dsa.stackandqueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		Stack<Character> st = new Stack<>();
		char[] s = str.toCharArray();
		for(char ch:s) {
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}else if(ch==')'){
				boolean val = handleClosing(st,'(');
				if(val==false) {
					System.out.println(false);
					return;
				}
				
			}else if(ch=='}') {
				boolean val = handleClosing(st,'{');
				if(val==false) {
					System.out.println(false);
					return;
				}
				
			}else if(ch==']') {
				boolean val = handleClosing(st,'[');
				if(val==false) {
					System.out.println(false);
					return;
				}
				
			}
		}
		if(st.size()==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
	public static boolean handleClosing(Stack<Character> st,char corresOpeningChar) {
		if(st.size()==0) {
			return false;
		}else if(st.peek()!=corresOpeningChar){
			return false;
		}else {
			st.pop();
			return true;
		}
	}

}
