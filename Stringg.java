package org.sample;

public class Stringg {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Greens Tech");
		System.out.println(System.identityHashCode(s1));
		StringBuffer s2=new StringBuffer("Greens Tech");
		System.out.println(System.identityHashCode(s2));
		
		String s="java";
		System.out.println(System.identityHashCode(s));
		
		String s3="java";
		System.out.println(System.identityHashCode(s3));
		
	}

}
