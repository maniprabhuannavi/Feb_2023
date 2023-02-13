package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(23);
		l.add(41);
		l.add(65);
		l.add(1, 24);

		System.out.println(l);

		int size = l.size();
		System.out.println(size);

		Integer integer = l.get(2);
		System.out.println(integer);

		Integer set = l.set(3, 11);
		System.out.println(l);

		Integer remove = l.remove(3);
		System.out.println(l);

		int indexOf = l.indexOf(23);
		System.out.println(indexOf);

		boolean contains = l.contains(12);
		System.out.println(contains);

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(33);
		l1.add(23);
		l1.add(55);
		l1.add(12);
		l.addAll(l1);
		System.out.println(l);

		l.retainAll(l1);
		System.out.println(l);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		boolean equals = l.equals(l1);
		System.out.println(equals);
	}
}
