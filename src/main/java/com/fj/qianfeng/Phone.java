package com.fj.qianfeng;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//����Ϊ����
@Scope("prototype")
public class Phone {
	//ע��ע��ֵ
	@Value("666")
	private Integer id;
	@Value("������")
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
		System.out.println("����ע����");
	}
	public Phone(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

}
