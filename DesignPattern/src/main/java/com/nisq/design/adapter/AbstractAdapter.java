package com.nisq.design.adapter;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0811:32
 */
public abstract class AbstractAdapter implements AdapterDemo{
	public void sayHello() {
		System.out.println("say hello");
	}

	public void bye() {
		System.out.println("bye bye");
	}
}
