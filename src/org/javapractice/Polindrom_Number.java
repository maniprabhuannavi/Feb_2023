package org.javapractice;

public class Polindrom_Number {

	public static void main(String[] args) {
		int a,b = 0,c;
		int n=12321;
		
		while (n>0) {
			a=n%10; //reminder only --1	//2 	//3		//2		//1
			b=(b*10)+a;			//1		//12	//123	//1232	//12321
			n=n/10;				//	1232//123	//12	//1		//0
		}
		System.out.println(b);
	}
}
