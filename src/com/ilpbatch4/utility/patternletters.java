package com.ilpbatch4.utility;

public class patternletters {

	public static void main(String[] args) {
		 int input=5;
		patternletter(input);
		// TODO Auto-generated method stub

	}

	private static void patternletter(int input) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=input;i++)
		 {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
				
			}
			
		
		
	}


