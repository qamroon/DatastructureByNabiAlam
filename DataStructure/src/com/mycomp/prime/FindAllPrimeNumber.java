package com.mycomp.prime;

import java.util.Scanner;

public class FindAllPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the Number");
		Scanner sc =new Scanner(System.in) ;
		int n=sc.nextInt(); //input data=10
		
		for(int i=2;i<=n;i++) {
			int j=2;
			while(i%j!=0 && j<=i/2 ) {
				j++;
			}
			if(j<=i/2) {
				//System.out.print("\t"+i);
			}
			else {
				System.out.print("\t"+i);
			}
			
		}
		
		
	}

}
