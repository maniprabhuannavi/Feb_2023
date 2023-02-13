package com.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Interface {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> k = new LinkedHashMap<>();
		k.put(1, "burger");
		k.put(2, "pizza");
		k.put(3, "momos");
		k.put(5, "Biriyani");

		System.out.println(k);

		int size = k.size();

		System.out.println(size);

		String string = k.get(5);

		System.out.println(string);

		Set<Integer> keySet = k.keySet();

		System.out.println(keySet);
		
		Collection<String> values = k.values();
		
		System.out.println(values);
		
		Set<Entry<Integer,String>> entrySet = k.entrySet();
		
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
	}
}
