package com.nisq.design.factory;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0810:09
 */
public class AppleServiceIpml implements FruitService{
	public String getFruitName(Fruit fruit) {
		return fruit.getName();
	}

	public String getFruitColor(Fruit fruit) {
		return fruit.getColor();
	}
}
