package com.arcus.javatraining.accessmodifiers;

public class ClockReader {

	Clock clock = new Clock();

public long readClock()
	{
		return clock.time;
	}
}
