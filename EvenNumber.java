package org.sample;

public class EvenNumber {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
			sum=sum+i;

			}
			
		}
		System.out.println("Sum of even numbers:" + sum);

	}
}