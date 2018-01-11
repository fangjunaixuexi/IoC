package com.fj.qianfeng;

import org.springframework.stereotype.Component;

@Component
public class Phone {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "phone [id=" + id + ", name=" + name + "]";
	}
	public Phone() {
		System.out.println("进入注解类");
	}
	public Phone(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

}
