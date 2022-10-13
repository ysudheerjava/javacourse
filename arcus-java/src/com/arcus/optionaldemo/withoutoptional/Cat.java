package com.arcus.optionaldemo.withoutoptional;

public class Cat {

	private int age;
	/**
	 * @param age
	 * @param name
	 */
	public Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
