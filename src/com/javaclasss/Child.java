package com.javaclasss;

public class Child extends Parent {

	public void sclTenth() {
		// TODO Auto-generated method stub
		System.out.println("10th");
		this.twelth(); // current class reference keyword

	}

	private void twelth() {
		// TODO Auto-generated method stub
		System.out.println("12th");
		this.clg();
	}

	private void clg() {
		// TODO Auto-generated method stub
		System.out.println("clg");
		super.test1(); // parent class reference keyword
	}

	public static void main(String[] args) throws Throwable {
		Child c = new Child();
		c.finalize(); //To remove unwanted memory
	}
}
