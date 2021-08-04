import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		char gender = sc.next().charAt(0);
		
		int age = sc.nextInt();
		
		long mobileNo = sc.nextLong();
		
		double cgpa = sc.nextDouble();
		
		System.out.println("Name is: "+name);
		System.out.println("Gender is: "+gender);
		System.out.println("Age is: "+age);
		System.out.println("MobileNo is: "+mobileNo);
		System.out.println("CGPA is: "+cgpa);

	}

}
