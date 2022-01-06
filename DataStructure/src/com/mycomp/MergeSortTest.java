package com.mycomp;

public class MergeSortTest {

	public static void mergeSort(int arr[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
	}
		//int b[]= new int[high];	
	}
	
	public static void merge(int arr[],int low,int mid,int high) {
		int i=low;
		int j=mid+1;
		int k=low;
		int b[]= new int[7];
		while(i<=mid && j<=high ) {
			if(arr[i]<=arr[j]) {
				b[k]=arr[i];
				i++;
			}else {
				//int temp=arr[i];
				//arr[i]=arr[j];
				b[k]=arr[j];
				//arr[j]=temp;
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=high) {
				b[k]=arr[j];
				j++;
				k++;
			}
		}else {
			while(i<=mid) {
				b[k]=arr[i];
				i++;
				k++;
			}
		}
	for(int l=low;l<=high;l++) {
		arr[l]=b[l];
	}
	}
	public static void main(String[] args) {
		int arr[] = {10,3,7,5,12,14,2};
		System.out.println("=====Before Swapping=====");
		for(int i:arr) {
			System.out.print("\t"+i);
		}
		mergeSort(arr,0,arr.length-1);
		System.out.println();
		System.out.println("=====After sorting=======");
		
		for(int i:arr) {
			System.out.print("\t"+i);
		}
	

	}

}
