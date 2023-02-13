package org.javapractice;

public class String_Function {
public static void main(String[] args) {
	String s="i am a tester";
	String s1="   i am   a Tester  ";
	
	int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	boolean startsWith = s.startsWith("i am");
	System.out.println(startsWith);
	
	boolean endsWith = s.endsWith("tester");
	System.out.println(endsWith);
	
	boolean contains = s.contains("a");
	System.out.println(contains);
	
	int indexOf = s.indexOf("t");
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf("t");
	System.out.println(lastIndexOf);
	
	char charAt = s.charAt(7);
	System.out.println(charAt);
	
	String replace = s.replace("tester", "dev");
	System.out.println(replace);
	
	String substring = s.substring(4);
	System.out.println(substring);
	
	String substring2 = s.substring(4, 7);
	System.out.println(substring2);
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	//String s="i am a tester";
	
	String[] split = s.split(" ");
	System.out.println(split);
	for (String str : split) {
		System.out.println(str);
	}
	
	String trim = s1.trim();
	System.out.println(trim);
	
	String concat = s1.concat(s);
	System.out.println(concat);
}
}
