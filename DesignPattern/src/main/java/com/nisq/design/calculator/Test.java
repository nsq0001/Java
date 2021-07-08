package com.nisq.design.calculator;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0811:55
 */
public class Test {
	public static void main(String[] args) {
		Calculator calculator1 = new Calculator1();
		Calculator calculator2 = new Calculator2();

		System.out.println("calculator1:" + calculator1.addCalcula(2, 3));
		System.out.println("calculator2:" + calculator2.addCalcula(2, 3));
	}


}
