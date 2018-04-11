package com.Practice30days;

import java.util.Arrays;
import java.util.Scanner;

public class Day6LetsReview {
	public static void main(String[] args) {
		String S=new String();

		int N=0;
		String s1="",s2="";

		int T=0;
		Scanner scan=new Scanner(System.in);
		T=scan.nextInt();
		scan.nextLine();	// to remove the extra new line and use nextline after next int
		
		for(int j=0;j<T;j++)	//to run how many the number of strings taken as input. i.e. number of testcases.
		{
			S=scan.nextLine();
			int arrlen=S.length();
			String[] ss=(S.substring(0, arrlen)).split("");	//converting string to string array
			String sss="";

			for(int i=0;i<ss.length;i++)
			{
				if(i==0||i%2==0)
					s1=s1.concat(ss[i]);
				else
					s2=s2.concat(ss[i]);
			}
			System.out.println(s1+" "+s2);
			s1="";
			s2="";
		}
	}
}
//upload it