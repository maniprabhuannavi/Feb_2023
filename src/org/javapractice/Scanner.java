package org.javapractice;

public class Scanner {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		System.out.println("Card Inserted");
		
		System.out.println("Enter Your pin :");
		
		int nextInt = s.nextInt();
		
		System.out.println("Enter Your Name :");
		
		String next = s.next();
		
		System.out.println("Enter Your Amount :");
		
		float Amount = s.nextFloat();
		
		System.out.println(Amount);
		
		s.close();
		
	}
}
