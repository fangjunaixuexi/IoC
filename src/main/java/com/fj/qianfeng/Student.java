package com.fj.qianfeng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("李晓春")
	private String name;
	@Value("23")
	private Integer age;
	@Autowired
	private Phone phone;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student() {
		System.out.println("进入student实体类");
	}
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	
}
