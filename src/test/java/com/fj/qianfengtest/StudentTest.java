package com.fj.qianfengtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fj.qianfeng.Student;

public class StudentTest {
//去除黄线
@SuppressWarnings("resource")
 @Test
 public void test1() {
	 
	 //初始化IOC容器
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 Student stu = (Student) context.getBean("student");
	 System.out.println("student"+stu);
 }
}
