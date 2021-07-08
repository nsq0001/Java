package com.nisq.design.singleton;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description: 饿汉式:在使用前就创建好实例
 * @date 2021-07-089:37
 */
public class Singleton1 {

	public static Singleton1 singleton1 = new Singleton1();

	private Singleton1(){

	}

	public static Singleton1 getInstance(){
		return  singleton1;
	}
}
