package com.ilpbatch4.utility;

public class secondlargest {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		// TODO Auto-generated method stub
		secondlargest(array);

	}

	private static void secondlargest(int[] array) {
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				secondlargest=largest;
				largest=array[i];
				
				
				
			}
			else if(array[i]>secondlargest)
				secondlargest=array[i];
			
		}
		System.out.println(secondlargest);
		
		// TODO Auto-generated method stub
		
	}

}
