package com.brainmentors.java.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix1[][] = {
				      		{1, 4},
				      		{3, 5}};
		
		int matrix2[][] = {
	      					{1, 4},
	      					{3, 5}};
		
		int m = matrix1.length; // rows
		int n = matrix1[0].length; // cols
		
		int result[][] = new int[m][n];
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
