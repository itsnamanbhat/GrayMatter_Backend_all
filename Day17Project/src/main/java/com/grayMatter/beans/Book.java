package com.grayMatter.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Book {
	
	private String bookName;
	private String isbnNum;
	private double price;

	public void display() {
		System.out.println(bookName);
		System.out.println(isbnNum);
		System.out.println(price);
	}
	

}
