package com.nisq.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description:
 * @date 2021-07-0814:08
 */
public class Subject {
	private List<Observer> observerList = new ArrayList<Observer>();

	public void add(Observer observer) {
		observerList.add(observer);
	}

	public void noticeAll() {
		for (Observer observer : observerList) {
			observer.notice();
		}
	}

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.noticeAll();
	}
}
