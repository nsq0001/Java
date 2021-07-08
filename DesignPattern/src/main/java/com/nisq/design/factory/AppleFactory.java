package com.nisq.design.factory;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0810:28
 */
public class AppleFactory implements FruitFactory{
	public Apple getFruit() {
		return new Apple("apple","red");
	}
	public FruitService getAppleService(){
		return new AppleServiceIpml();
	}


	public static void main(String[] args) {
		AppleFactory fruitFactory = new AppleFactory();
		FruitService appleService = fruitFactory.getAppleService();

		System.out.println(fruitFactory.getFruit().toString());
		System.out.println(appleService.getFruitName(fruitFactory.getFruit()));
	}

}
