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

public class Student {
private int id;
private String name;
private int age;

public void display() {
	System.out.println("Name "+": "+name);
	System.out.println("id "+": "+id);
	System.out.println("age "+": "+age);
}

}
