package com.dotridge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;

public class ResourceLoader {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ResourceBundle rb = (ResourceBundle) ctx.getBean("resourceBundle");
		// Resource resource = ctx.getResource("db.properties");
		MessageSource mr = new ClassPathXmlApplicationContext("applicationContext.xml");

		Resource resource = rb.getBaseName();
		InputStream inputStream = resource.getInputStream();
		BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
		String str = new String();
		while ((str = bf.readLine()) != null) {
			System.out.println(str);
		}
	}

}
