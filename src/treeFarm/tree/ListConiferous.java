package treeFarm.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class ListConiferous {			// ZOZNAM IHLICNATYCH STROMOV
	private static ArrayList<Coniferous> coniferousList = new ArrayList<Coniferous>();

	public ListConiferous(String species, String color, int age, double height) {
		coniferousList.add(new Coniferous(species, color, age, height));

	}

	public ArrayList<Coniferous> getList() {
		return coniferousList;
	}
	/*
	public void setList(ArrayList<Coniferous> conList) {
		this.conList = conList;
	}
	 */
	public static void showList() {
		System.out.println("CONIFEROUS TREES list:");
		if (!coniferousList.isEmpty()) {
			for (int i = 0; i < coniferousList.size(); i++) {
				System.out.printf("%s, %s, %d, %f\n", coniferousList.get(i).getSpecies(), 
													  coniferousList.get(i).getColor(), 
													  coniferousList.get(i).getAge(), 
													  coniferousList.get(i).getHeight());
			}
		} else {
			System.out.println("(empty)");
		}
		
	}

	public static void cutDeciduous() {
		System.out.println("Cut Coniferous:");
		for (int i = 0; i < coniferousList.size(); i++) {
			System.out.printf("(%d) %s, %s, %d, %f\n", i, coniferousList.get(i).getSpecies(), 
														  coniferousList.get(i).getColor(), 
														  coniferousList.get(i).getAge(), 
														  coniferousList.get(i).getHeight());
		}
		Scanner scDissmiss = new Scanner(System.in);
		int diss = scDissmiss.nextInt();
		scDissmiss.close();
		coniferousList.remove(diss);
	}

	
}
