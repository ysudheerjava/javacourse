package com.arcus.javatrainings.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemonew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> motorBikes = new ArrayList<>();

		ArrayList<Integer> motorBikecode = new ArrayList<>();

		motorBikes.add("Yamaha");//0
		motorBikes.add("Honda");//1
		motorBikes.add("Bullet");//2
		motorBikes.add("Suzuki");//3

		motorBikes.set(3, "Kawasaki");
		motorBikes.add("Triumph");
		motorBikes.add("Ducati");
		motorBikes.add("Vespa");

		System.out.println("Contents of ArrayList: ");
		
		for (String motorBike : motorBikes) {

			System.out.println(motorBike);
		}

	}

}
