package com.brainmentors.java.string;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Ram Kumar";
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		// 1 - index number(0), 3 - position number(1)
		System.out.println(name.substring(1, 3));
		System.out.println(name.trim()); // "   Ram Kumar    ";
		System.out.println(name.replace('m', 'o'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" New Delhi"));
		System.out.println(name+" Delhi");
		System.out.println(name.contains("Ra"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));

	}

}
