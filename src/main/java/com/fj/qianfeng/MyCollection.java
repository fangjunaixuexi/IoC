package com.fj.qianfeng;

public class MyCollection {
	private Object[] arrs;

	public Object[] getArrs() {
		return arrs;
	}

	public void setArrs(Object[] arrs) {
		this.arrs = arrs;
	}
	public void init() {
		System.out.println("���ǳ�ʼ������ʱ����");
	}
	public void destory() {
		System.out.println("�������ٷ���ʱ�ĵ���");
	}
}
