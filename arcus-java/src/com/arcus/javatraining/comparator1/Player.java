package com.arcus.javatraining.comparator1;

public class Player {
	private Integer ranking;
	private String name;
	private Integer age;

	public Player(int ranking, String name, int age) {

		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

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

}