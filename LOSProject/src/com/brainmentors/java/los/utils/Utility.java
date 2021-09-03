package com.brainmentors.java.los.utils;

import java.util.Scanner;

public class Utility implements StageConstants{
	
	public static Scanner scanner = new Scanner(System.in);
	public static int serialCounter = 1;
	
	public static String getStageName(int stageId)
	{
		switch(stageId)
		{
		case SOURCING:
			return "Sourcing Stage";
			
		case QDE:
			return "Quick Data Entry Stage";
			
		case DEDUPE:
			return "Dedupe Stage";
			
		case SCORING:
			return "Scoring Stage";
			
		case APPROVAL:
			return "Approval Stage";
			
		case REJECT:
			return "Rejection Stage";
			
		default:
			return "Invalid Stage";
		}
	}
}
