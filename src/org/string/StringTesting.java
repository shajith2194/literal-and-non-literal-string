package org.string;

public class StringTesting {
	public static void main(String[] args) {
		String s ="shajith";
		String s1="shajith";
		System.out.println("literal string");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		String s2= new String("shajith");
		String s3= new String("shajith");
		System.out.println("--------------------");
		System.out.println("non literal string");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
	}

}
