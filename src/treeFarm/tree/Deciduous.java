package treeFarm.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Deciduous extends Tree {   // LISTNATE STROMY
	ArrayList<String> deciduousSpeciesList = new ArrayList<String>() {
		{
			add("oak");		// dub
			add("birch");	// breza
			add("maple");	// javor
			add("beech");	// buk
			add("lime");	// lipa
			add("poplar");	// topol
			add("ash");		// jasen
			add("willow");	// vrba
			//add("apple_tree");	//jablon  // nehodi sa do tohto lesa asi
		}
	};
	static Scanner scDeciduous = new Scanner(System.in);
	
	public Deciduous(String species, String color, int age, double height) {
		super(species, color, age, height);

	}
	
	public static void addDeciduous() {
		System.out.printf("Enter [species, color, age, height]:\n> ");  // neskor zmenit len na input species, ostatne sa vygeneruju random na zaklade toho
		String deciduousSpecies = scDeciduous.next();
		String deciduousColor = scDeciduous.next();
		int deciduousAge = scDeciduous.nextInt();
		double deciduousHeight = scDeciduous.nextDouble();
		ListDeciduous deciduousList = new ListDeciduous(deciduousSpecies, deciduousColor, deciduousAge, deciduousHeight);
		/*
		ListDeciduous decList = new ListDeciduous();
		decList.setList();	// alebo mozno nejak cez settery z Tree.java 
		*/
		System.out.printf(":: %s, %s, %d, %f\n", deciduousSpecies, deciduousColor, deciduousAge, deciduousHeight);
	}
}
