package com.ilpbatch4.utility;

public class factorialofanumber {

	public static void main(String[] args) {
		 int input=3;
		factorialofanumber(input);
		
		// TODO Auto-generated method stub

	}

	private static void factorialofanumber(int input) {
		// TODO Auto-generated method stub
		float sum=0;
	    for(int i=1;i<=input;i++)
	    {
	    	sum=sum+( i/fact(i));
	    	
	    }
	    System.out.println(sum);
		
	}

	private static float fact(int i) {
	    
	    int fact=1;
		for(int j=1;j<=i;j++) {
			fact=fact*i;
		
		}
		return(fact);
		
		
		
	}
	
        
}
