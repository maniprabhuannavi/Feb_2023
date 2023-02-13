package org.javapractice;

public class Armstromg_Number {
public static void main(String[] args) {
	//1252= 1*3+ 2*3 +5*3 = 125
	
	int a,b = 0,c,n=153;
	
	while (n>0) {
		a=n%10;
		b=b+(a*a*a);
		n=n/10;
	}
	System.out.println(b);
}
}
