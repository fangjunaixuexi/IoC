package com.fj.qianfengtest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fj.qianfeng.Phone;

public class PhoneTest {
	@Test
	public void test() {
	/*	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Phone phone = (Phone) context.getBean("phone");
		System.out.println("phone"+phone);*/
		/*ע�����ʹ��*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Phone bean = context.getBean("phone", Phone.class);
		System.out.println(bean);
	}
}
