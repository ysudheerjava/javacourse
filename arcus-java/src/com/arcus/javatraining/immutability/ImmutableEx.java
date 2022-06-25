package com.arcus.javatraining.immutability;

public final class ImmutableEx {

	private final int intField;
	private final String stringField;

	public ImmutableEx(int id, String name) {
		this.intField = id;
		this.stringField = name;
	}

	public int getIntField() {
		return intField;
	}

	public String getStringField() {
		return stringField;
	}

}
