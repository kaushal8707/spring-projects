package com.spring.basics.app.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication
{
	public static void main(String[] args)
	{
        ApplicationContext applicationContext=SpringApplication.run(BasicApplication.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
//		BinarySearchImpl binarySearch1=applicationContext.getBean(BinarySearchImpl.class);
//		System.out.println(binarySearch1);
		int result=binarySearch.binarySearch(new int[]{2,4,1},3);
		System.out.println(result);

	}
}
