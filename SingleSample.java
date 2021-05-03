package org.sample;

public class SingleSample {
	
	public static SingleSample singl;
	
	private SingleSample() {
		
	}

	
	public static SingleSample getInstance() {
		if (singl==null) {
			singl=new SingleSample();
		}
        return singl;
	}
	
	public static void main(String[] args) {
		SingleSample s=getInstance();
	    System.out.println(System.identityHashCode(s));
	    SingleSample s1=getInstance();
	    System.out.println(System.identityHashCode(s1));
	}
}
