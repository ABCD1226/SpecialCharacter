package com.eec.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eec.pojo.TestEntity;

public class Test {
	public static void main(String[] args) {
		// 加载applicationContext.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		TestEntity te = (TestEntity) ac.getBean("entity");
		te.showValue();
		
	}
}
