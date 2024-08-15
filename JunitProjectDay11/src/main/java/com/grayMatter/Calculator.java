package com.grayMatter;

public class Calculator {

	public static int addNum(int a,int b) {
		return a+b;
	}
	public static int subNum(int a,int b) {
		return a-b	;
	}
	public static int mulNum(int a,int b) {
		return a*b;
	}
	public static int divNum(int a ,int b) {
		return a/b;
	}
	
	public static boolean  isEven(int a) {
		return a%2==0;
	}
	
	public static int[] arrayEquals(int a[]) {
		return a;
	}
	public static String checkString () {
		return null;
	}
	
	public  static Student createStudent() {
		Student s1= new Student("hari",23,44);
		return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculator has been created");
	}

}
