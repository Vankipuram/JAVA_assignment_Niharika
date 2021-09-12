package com.cap.io;

public class MinMaxFinder {
	public static void FindMinMax(int[] array) {
		 int min = array[0];
		 int max = array[0];
		 for(int i=0; i<array.length; i++) {
			 if(array[i]<min)
				 min = array[i];
			 else if(array[i]>max)
				 max = array[i];
			 
		 }
		int resArray[] = {min,max};
		System.out.println(resArray);
		 
		
		
	}
		
		 
			
				
			
			

}
