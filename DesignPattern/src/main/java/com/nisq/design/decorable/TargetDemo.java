package com.nisq.design.decorable;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0811:44
 */
public class TargetDemo implements Decorable{
	public void eat() {
		System.out.println("TargetDemo eat");
	}

	public void bash() {
		System.out.println("TargetDemo bash");
	}
}
