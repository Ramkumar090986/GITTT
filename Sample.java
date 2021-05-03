package org.sample;

import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
		int[] a= {40,20,30,10};
		for (int i : a) {
			System.out.println(i);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
	
