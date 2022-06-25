package com.arcus.javatraining.immutability;

public final class ImmutableStudent1 {

    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent1(int id, String name, Age age) {
    this.name = name;
    this.id = id;
    this.age = age;
    }

    public int getId() {
    return id;
    }

    public String getName() {
    return name;
    }

    public Age getAge() {
    return age;
    }
}