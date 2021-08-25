package com.brainmentors.java.string;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ram"; // 1 or 0
		String name2 = "Ram";
		String name3 = new String("Ram").intern(); // 2 or 1
		String name4 = new String("Ram");
		
		System.out.println(name == name2); // == address comparison
		System.out.println(name == name3);
		System.out.println(name3 == name4);
		
		String t = "Hello";
		String y = t;
		System.out.println(y == t);
		
		t = t + "How are you?";
		System.out.println(y == t);
	}
}
