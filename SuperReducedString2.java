package com.imran.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString2 {
	static String super_reduced_string(String s){
		// Complete this function
		String result="";
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		for(int i=1;i<sb.length();i++)
		{ 
			if(sb.charAt(i)==sb.charAt(i-1))
			{ 
				sb.delete(i-1,i+1);
				i=0;
			}
		}
		
		result=sb.toString();
		
		if(sb.length()==0)
			return "Empty String";

		else {
			return result;
		}


	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
