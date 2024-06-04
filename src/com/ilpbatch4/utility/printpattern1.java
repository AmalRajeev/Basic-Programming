package com.ilpbatch4.utility;

public class printpattern1 {

	public static void main(String[] args) {
		int input=3;
		printpattern1(input);
		// TODO Auto-generated method stub

	}

	private static void printpattern1(int input) {
		for(int i=1;i<=input;i++)
		 {
			 for(int j=1;j<=i;j++) {
				 
				 if(j%2!=0&&j!=1) {
					 System.out.print(" "+j);
				 }else {
				 System.out.print( "  "+j);}
					
			 }
			 System.out.println();
		 }
		
		// TODO Auto-generated method stub
		
	}

}
