import java.math.BigDecimal;

public class BigDecimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without using bigdecimal
		/*
		double a = 0.03;
		double b = 0.05;
		
		double c = b - a;
		
		System.out.println(c);
		*/
		//with using bigdecimal
		
		BigDecimal a = new BigDecimal("0.04");
		
		BigDecimal b = new BigDecimal("0.06");
		
		BigDecimal c = b.subtract(a);
		
		System.out.println(c);
	}

}
