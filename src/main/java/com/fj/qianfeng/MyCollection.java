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
		System.out.println("这是初始化方法时调用");
	}
	public void destory() {
		System.out.println("这是销毁方法时的调用");
	}
}
