package com.sogeti.demo;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int Ten =10;
		int Twenty =20;
		int Thirty =30;
		
		boolean bValue;
		int iValue;
		
		bValue=(Thirty == Twenty + Ten)? true: false;
		System.out.println(bValue);
		iValue=(Thirty == Twenty + Ten)? 50: 100;
		System.out.println(iValue);
		
		iValue=(!(Thirty == Twenty + Ten))? 50: 100;
		System.out.println(iValue);
	}

}
