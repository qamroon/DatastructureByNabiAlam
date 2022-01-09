package com.mycomp.prime;

import java.util.Scanner;

public class CheckPrimeNumberTest {
public static void main(String arg[]) {
	System.out.println("Please enter the Number");
	Scanner sc =new Scanner(System.in) ;
	int n=sc.nextInt();
	// A number which is divisible by 1 and him self is known as prime number except 1,13
	// a number is divisible by its half and its lesser value.
	
	int i=2;
	while(n%i!=0 && i<=n/2) {  //   13= 2,3,4,5,6 - 7,8,9,10,11,12 ,1316
		i++;
	}
	
	if(i<=n/2) {
		System.out.println("the number is Not Prime number");
	}
	else {
		System.out.println("the number is  prime.");
	}
	
}
}

// time complexity of the above code: 
