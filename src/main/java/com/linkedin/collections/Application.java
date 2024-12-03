package com.linkedin.collections;

import java.util.Collection;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.0);
		Room soweto = new Room("Soweto", "Premiere Room", 4, 450.00);
		Room alex = new Room("Alex", "Suite", 5, 1000.00);

		Collection<Room> rooms = List.of(cambridge, manchester, soweto, alex);

		double total = getPotentialRevenue(rooms);
		System.out.println(total);
	}
	
	private static double getPotentialRevenue(Collection<Room> rooms) {
		return rooms.stream()
				.mapToDouble(Room::getRate)
				.sum();
	}

}
