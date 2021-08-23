package com.brainmentors.java.arrays;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		- It is a collection of similar types of data
		- It is a contiguous memory allocation
		- It is a homogeneous mixture
		- It is easy to access the value from the array*/
		
		// [] - subscript operator or closed bracket
		
		int arr[] = {1, 2, 3, 4, 5}; // declare and initialize
		//int arr2[] = new int[5]; // declare with size of the array
		
		System.out.println(arr[4]); // 5
		System.out.println(arr[2]); // 3
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}

	}

}
