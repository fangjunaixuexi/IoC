package com.fj.qianfengtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fj.qianfeng.Phone;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-Test.xml"})
public class StudentTest2 {
	@Autowired
	private  Phone phone;
	@Test
	public void test() {
		System.out.println(phone);
	}

}
