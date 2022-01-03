package com.mycomp;

import java.util.Scanner;

public class MyQuickSortTest {

public static void quickSort(int arr[],int i,int j) {
		if(i<j) {
		int loc=partition(arr,i,j);
		quickSort(arr,i,loc-1);
		quickSort(arr,loc+1,j);
		
		}
	}
	
public static int partition(int arr[],int i,int j) {
		
		int pivot=arr[i];
		int start=i;
		int end=j;		
		while(start<end) {
		while(arr[start]<=pivot) {
			start ++;
		}
		
		while(arr[end]>pivot) {
			end --;
		}
		if(start<end) {
		swap(arr,start,end);
		}
		
	}
		swap(arr,i,end);
		return end;

}

public static void swap(int arr[] ,int x,int y) {
	int temp=arr[x];
	arr[x]=arr[y];
	arr[y]=temp;
}

	public static void main(String[] args) {
		int arr[] = {10,3,5,7,12,23,19,18,55};
		System.out.println("=====Before swapping=====");
		for(int i:arr) {
			System.out.print("\t"+i);
		}
		
		quickSort(arr,0,arr.length-1);
		System.out.println();
		System.out.println("=====After sorting=======");
		
		for(int i:arr) {
			System.out.print("\t"+i);
		}
	}

}
