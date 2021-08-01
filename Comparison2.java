
public class Comparison2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "hello";
		String two = "Hello";
		
		if(one.equalsIgnoreCase(two)) {
			System.out.println("Both the Strings are same");
		}
		else {
			System.out.println("Not Same");
		}
		
		if(one.equals(two)) {
			System.out.println("Both the Strings are Same");
		}
		else {
			System.out.println("Not Same");
		}

	}

}
