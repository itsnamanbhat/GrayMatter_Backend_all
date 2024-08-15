package com.grayMatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grayMatter.beans.Book;

@Configuration
public class BookConfig {
@Bean
public Book bkId1() {
	Book b1= new Book();
	b1.setBookName("shiva");
	b1.setIsbnNum("3");
	b1.setPrice(399);
	return b1;
}
}
