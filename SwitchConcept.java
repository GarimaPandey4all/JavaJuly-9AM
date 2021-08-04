import java.util.Scanner;

public class SwitchConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 10:
			System.out.println("10");
			break;
			
		case 15:
			System.out.println("15");
			break;
			
		default:
			System.out.println("No Match");
		}
		
		/*
		System.out.println("Enter your choice");
		String choice = sc.next();
		
		switch(choice)
		{
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("No Match");
		}
		
		System.out.println("Outside the Switch");*/
	}

}
