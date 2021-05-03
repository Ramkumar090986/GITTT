package org.sample;

public class Enumm {
	
	enum fruits{
		
		APPLE,
		MANGO,
		PINEAPPLE
		
}
	public static void main(String[] args) {
		 fruits[] frt = fruits.values();
		 for (fruits fruits2 : frt) {
			 System.out.println(fruits2);
			
		}
	}
}
