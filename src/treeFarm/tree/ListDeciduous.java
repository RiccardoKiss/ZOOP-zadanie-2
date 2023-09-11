package treeFarm.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDeciduous {			// ZOZNAM LISTNATYCH STROMOV
	private static ArrayList<Deciduous> deciduousList = new ArrayList<Deciduous>();

	public ListDeciduous(String species, String color, int age, double height) {
		deciduousList.add(new Deciduous(species, color, age, height));

	}

	public ArrayList<Deciduous> getList() {
		return deciduousList;
	}
	/*
	public void setList(ArrayList<Deciduous> deciduousList) {
		this.deciduousList = deciduousList;
	}
	 */
	public static void showList() {
		System.out.println("DECIDUOUS TREES list:");
		if (!deciduousList.isEmpty()) {
			for (int i = 0; i < deciduousList.size(); i++) {
				System.out.printf("%s, %s, %d, %f\n", deciduousList.get(i).getSpecies(), 
													  deciduousList.get(i).getColor(), 
													  deciduousList.get(i).getAge(), 
													  deciduousList.get(i).getHeight());
			}
		} else {
			System.out.println("(empty)");
		}
		
	}

	public static void cutDeciduous() {
		System.out.println("Cut Deciduous:");
		for (int i = 0; i < deciduousList.size(); i++) {
			System.out.printf("(%d) %s %s, %d, %f\n", i, deciduousList.get(i).getSpecies(), 
														 deciduousList.get(i).getColor(), 
														 deciduousList.get(i).getAge(), 
														 deciduousList.get(i).getHeight());
		}
		Scanner scDissmiss = new Scanner(System.in);
		int diss = scDissmiss.nextInt();
		scDissmiss.close();
		deciduousList.remove(diss);
	}

}
