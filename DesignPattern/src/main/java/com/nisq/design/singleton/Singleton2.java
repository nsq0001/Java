package com.nisq.design.singleton;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description: 懒汉式：使用到才创建实例
 * @date 2021-07-089:39
 */
public class Singleton2 {
	//volatile 保证线程可见性，防止指令重排序
	public static volatile Singleton2 singleton2 = null;


	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		if (singleton2 == null) {
			synchronized (Singleton2.class) {
				if (singleton2 == null) {
					singleton2 = new Singleton2();
				}
			}
		}
		return singleton2;
	}
}
