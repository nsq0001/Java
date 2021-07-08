package com.nisq.design.decorable;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0811:45
 */
public class Decorator implements Decorable{

	TargetDemo targetDemo;

	public Decorator(TargetDemo targetDemo){
		this.targetDemo = targetDemo;
	}

	public void eat() {
		System.out.println("Decorator before");

		targetDemo.eat();
		System.out.println("Decorator after");
	}

	public void bash() {
		System.out.println("Decorator bash");
		targetDemo.bash();
		System.out.println("Decorator bash");
	}

	public static void main(String[] args) {
		Decorable decorable = new Decorator(new TargetDemo());
		decorable.eat();
		decorable.bash();
	}
}
