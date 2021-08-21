package com.brainmentors.java.oops;

interface Add {
	int add(int a, int b);
}

interface Print {
	void show();
}

public class LambdaConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add add = (a, b)->(a + b);
		System.out.println(add.add(30, 10));
		
		Print show = ()->{
			System.out.println("This is a Show Example");
		};
		
		show.show();

	}

}
