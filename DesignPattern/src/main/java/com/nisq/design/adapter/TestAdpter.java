package com.nisq.design.adapter;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0811:35
 */
public class TestAdpter {


	public static void main(String[] args) {
		AdapterDemo adapterDemo = new WrapperAdpter();

		adapterDemo.bye();
		adapterDemo.sayHello();
	}
}
