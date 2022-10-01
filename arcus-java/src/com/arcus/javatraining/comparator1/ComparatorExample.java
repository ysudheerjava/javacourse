package com.arcus.javatraining.comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<Player> footballTeam = new ArrayList<>();
	    footballTeam.add(new Player(59, "John", 20));
	    footballTeam.add(new Player(67, "Roger", 22));
	    footballTeam.add(new Player(45, "Steven", 24));
	    footballTeam.add(new Player(45, "s", 19));
	    footballTeam.add(new Player(45, "A", 19));

		PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
		PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();

		System.out.println("Before Sorting : ");
		 for(Player player:footballTeam) {
			 System.out.println(player.getAge()+"|"+player.getName()+"|"+player.getRanking()); 
		 }
		 
		 Collections.sort(footballTeam, playerRankingComparator);
		   
		 Comparator<Player> playerNameComparator=Comparator.comparing(Player::getName);  
		 
		 
		
			System.out.println("After Sorting : ");
			 for(Player player:footballTeam) {
				 System.out.println(player.getAge()+"|"+player.getName()+"|"+player.getRanking()); 
			 }
			 
			 
			 Collections.sort(footballTeam, playerAgeComparator);
				
				System.out.println("After Sorting : ");
				 for(Player player:footballTeam) {
					 System.out.println(player.getAge()+"|"+player.getName()+"|"+player.getRanking()); 
				 }
				 
				 Collections.sort(footballTeam,playerNameComparator);
				 
				 System.out.println("After Sorting by Name : ");
				 for(Player player:footballTeam) {
					 System.out.println(player.getAge()+"|"+player.getName()+"|"+player.getRanking()); 
				 }
		

	}

}
