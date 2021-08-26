package com.brainmentors.java.string;

public class StringBuilderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		
		for(int i = 0; i < 10000; i++)
		{
			sb.append("Example");
		}
		
		System.out.println("Time taken by StringBuffer is: "
		+(System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb2 = new StringBuilder("Java");
		
		for(int i = 0; i < 10000; i++)
		{
			sb.append("Example");
		}
		
		System.out.println("Time taken by StringBuilder is: "
				+(System.currentTimeMillis() - startTime)+"ms");

	}

}
