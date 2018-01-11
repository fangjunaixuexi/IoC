package com.fj.qianfeng;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//设置为多例
@Scope("prototype")
public class Phone {
	//注解注入值
	@Value("666")
	private Integer id;
	@Value("铁三角")
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
