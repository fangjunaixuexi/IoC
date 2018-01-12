package com.fj.qianfengtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fj.qianfeng.MyCollection;

public class MyCollectionTest {
	@Test
	public void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyCollection bean = context.getBean("myCollection", MyCollection.class);
		System.out.println(bean.getArrs().length);
	}
	@Test
	//生命周期方法测试
	public void test1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyCollection bean = context.getBean("myCollection", MyCollection.class);
		System.out.println(bean.getArrs().length);
		context.close();
	}
}