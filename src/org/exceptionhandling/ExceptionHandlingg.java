package org.exceptionhandling;

public class ExceptionHandlingg {
public static void main(String[] args) {

	int a=10;
	
	try {
		System.out.println(a/0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}finally {
		System.out.println("Done!");
	}
	
	

}
}
