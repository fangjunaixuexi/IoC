package com.fj.qianfengtest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fj.qianfeng.Student;

public class StudentTest {
	
 @Test
 public void test1() {
	 //³õÊ¼»¯IOCÈÝÆ÷
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 Student stu = (Student) context.getBean("student");
	 System.out.println("student"+stu);
 }
}
