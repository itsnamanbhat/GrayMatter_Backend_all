package com.grayMatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.beans.Book;
import com.grayMatter.beans.Student;
import com.grayMatter.config.BookConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//using xml file
//    	ApplicationContext context= new ClassPathXmlApplicationContext("/com/grayMatter/config1/applicationContext.xml");
//    	Student st1= (Student) context.getBean("stdId");
//    	st1.display();
    	
    	//using java/springConfig class
    	ApplicationContext context= new AnnotationConfigApplicationContext(BookConfig.class);
    	Book b=(Book) context.getBean("bkId1");
    	b.display();
    	
    }
}
