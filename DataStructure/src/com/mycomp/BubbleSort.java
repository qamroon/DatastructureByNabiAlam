package com.mycomp;

import java.util.HashMap;
import java.util.Set;

public class BubbleSort {

	public static void main(String[] args) {
		String s="hypermicrocondria";
		// now I want to erase a particula character from the String.
		//How do you reverse an array in place in Java
		/*
		 * int arr[] = {2,3,5,6,7}; for(int i=arr.length-1;i>=0;i--) {
		 * System.out.print("\t"+arr[i]); }
		 */
		
		HashMap <Character,Integer> map=new HashMap();
		for(int i=0;i<s.length();i++) {
			
			if(map.containsKey(s.charAt(i))){
				int count=map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		Set<Character> charct = map.keySet();
		for (Character ch: charct){
		     int nc= map.get(ch);
		     if(nc>1){
		        System.out.println(ch+ " - " + nc);
		     }
		

	}

}
}
