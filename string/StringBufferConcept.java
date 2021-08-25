package com.brainmentors.java.string;

public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("Hello");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("How are you I am Fine dbslfreliuhgieurhiugheirlughilueiugheughuehiugiuet");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("How are");
		System.out.println(sb.capacity()+" "+sb.length());

	}

}
