package com.mycomp;

import java.util.Scanner;

public class BinarySearch{
	
public static int  BinarySearch(int arr[],int n,int data){
		 int l=0 ;
		 int r=n-1;
		 while(l<=r) {
		 int mid=(l+r)/2; 
		 if(data==arr[mid]) {
			return mid; 
		 }else if(data<arr[mid]) {
			 r=mid-1;
		 }else {
			 l=mid+1;
		 }
				
	 }
		 return -1;	
	    }
public static void main(String args[]) {
	int arr[] = {3,5,7,12,30};	
    System.out.println("Enter the element to search");
    Scanner sc =new Scanner(System.in) ;
    int el=sc.nextInt();
    int n=BinarySearch.BinarySearch(arr, 5, el);
    
    if(n==-1) {
    	System.out.println("the elemnt "+el +"is not prsent in the array" );
    }else {
    	System.out.println("The elemnt "+el +"is  prsent in the array at arr["+n+"]" );
    }
    
    
 
}
}
