package treeFarm.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Coniferous extends Tree {  // IHLICNATE STROMY
	ArrayList<String> coniferousSpeciesList = new ArrayList<String>() {	// zatial nerobi nic, chcem dorobit, aby vstupy z klavesnice boli stromy z tohto pola a ked je iny vstup tak vypise "nespravny vstup"
		{
			add("spruce");	// smrek
			add("pine");	// borovica
			add("fir");		// jedla
			add("larch");	// smrekovec
			add("sequoia");	// sekvoja
			add("thuja");	// tuja
		}
	};
	static Scanner scConiferous = new Scanner(System.in);
	
	public Coniferous(String species, String color, int age, double height) {
		super(species, color, age, height);
	
	}
	
	public static void addConiferous() {
		System.out.printf("Enter [species, color, age, height]:\n> ");  // neskor zmenit len na input species, ostatne sa vygeneruju random na zaklade toho
		String coniferousSpecies = scConiferous.next();
		String coniferousColor = scConiferous.next();
		int coniferousAge = scConiferous.nextInt();
		double coniferousHeight = scConiferous.nextDouble();
		ListConiferous conList = new ListConiferous(coniferousSpecies, coniferousColor, coniferousAge, coniferousHeight);
		/*
		ListConiferous conList = new ListConiferous();
		conList.setList();	// alebo mozno nejak cez settery z Tree.java 
		*/
		System.out.printf(":: %s, %s, %d, %f\n", coniferousSpecies, coniferousColor, coniferousAge, coniferousHeight);
	}
}
