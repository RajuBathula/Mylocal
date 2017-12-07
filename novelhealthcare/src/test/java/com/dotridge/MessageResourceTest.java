package com.dotridge;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageResourceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSource ms = new ClassPathXmlApplicationContext("applicationContext.xml");
		String message = ms.getMessage("field.required", new Object[]{"raju","123"},"user Id Required and Password Required", Locale.US);
		System.out.println(message);
	}

}
