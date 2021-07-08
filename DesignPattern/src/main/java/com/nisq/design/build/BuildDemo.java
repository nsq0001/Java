package com.nisq.design.build;

/**
 * @author nsq
 * @Title:
 * @Package
 * @Description: 建造者模式
 * @date 2021-07-0811:09
 */
public class BuildDemo {

	public static User builder() {
		return new User();
	}


	static class User{
		private String name;

		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}

		public User setUserName(String name){
			this.name = name;
			return this;
		}
		public User setUserAge(int age){
			this.age = age;
			return this;
		}

		public void build(){
			System.out.println(this.toString());
		}
	}

	public static void main(String[] args) {
		BuildDemo.builder()
				.setUserAge(18)
				.setUserName("nisq")
				.build();
	}
}
