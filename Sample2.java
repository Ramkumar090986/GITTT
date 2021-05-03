package org.sample;

public class Sample2 {
public static void main(String[] args) {
		int num=12321;
		int n=num;
		int rem=0;
		int res=0;
		while (num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
			
		}
		if(n==res)
		{
			System.out.println("Given number is a Palindrome");
		}
		else
		{
			System.out.println("Given number is not a Palindrome");
		}
	}

}
