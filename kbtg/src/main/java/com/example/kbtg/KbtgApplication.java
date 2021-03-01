package com.example.kbtg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KbtgApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KbtgApplication.class, args);
		String[] beans = context.getBeanDefinitionNames();
		for (int i = 0; i < beans.length; i++) {
//			System.out.println(beans);
		}
		System.out.println(context.getBeanDefinitionCount());

//		somkiat yser2 somkiat
	}

}
