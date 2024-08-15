package com.grayMatter;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnGenerics  {

	public int add(int a,int b) {
		return a+b;
	}
	public String add(String a,String b) {
		
		return a+b;
	}
	
	public static <T> void printDetail(Collection <T> collection) {
		for(T t:collection)
			System.out.println(t);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String>alist= new ArrayList<String>();
		alist.add("amhoa");
		alist.add("ladaooie");
		alist.add("dgiadna");
		printDetail(alist);
		
		ArrayList<Integer> intList= new ArrayList<Integer>();
		intList.add(32);
		intList.add(332);
		printDetail(intList);
		
	}

}
