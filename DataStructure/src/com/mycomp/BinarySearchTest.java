package com.mycomp;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {
	int arr[] = {10,3,5,7,12};	
    System.out.println("Enter the element to search");
    Scanner sc =new Scanner(System.in) ;
    int el=sc.nextInt();
    System.out.println(el);
    int j=0;
    for (int i :arr) {
    	
    	if(el==i) {
    		System.out.println("The element "+el+"is found at the position"+j );
    		
    	}else {
    		
    	}
    	j++;
    }
    
    
	}

}
