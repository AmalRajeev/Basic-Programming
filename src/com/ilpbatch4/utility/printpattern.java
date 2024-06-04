package com.ilpbatch4.utility;

public class printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
		printpattern(input);

	}

	private static void printpattern(int input) {
		 for(int i=1;i<=input;i++)
		 {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		// TODO Auto-generated method stub
		
	}

}
