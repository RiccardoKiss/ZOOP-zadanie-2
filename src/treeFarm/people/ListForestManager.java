package treeFarm.people;

import java.util.ArrayList;
import java.util.Scanner;

public class ListForestManager {		// ZOZNAM SPRAVCOV LESA
	private static ArrayList<ForestManager> fmList = new ArrayList<ForestManager>();
	
	public ListForestManager(String firstName, String lastName, boolean sex, int age) {
		fmList.add(new ForestManager(firstName, lastName, sex, age));
		
	}

	public ArrayList<ForestManager> getList() {
		return fmList;
	}
	/*
	public void setList(ArrayList<ForestManager> fmList) {
		this.fmList = fmList;
	}
	*/
	public static void showList() {
		System.out.println("FOREST MANAGER List:");
		if (!fmList.isEmpty()) {
			for (int i = 0; i < fmList.size(); i++) {
				System.out.printf("[ %d ]: %s %s, %s, %d\n", i+1, fmList.get(i).getFirstName(), fmList.get(i).getLastName(), fmList.get(i).getSex(), fmList.get(i).getAge());
			}
		} else {
			System.out.println("(empty)");
		}
		
	}
	
	public static void dissmissForestManager() {
		System.out.println("Dismiss FOREST MANAGER:");
		if (!fmList.isEmpty()) {  // ak nie je pole prazdne
			for (int i = 0; i < fmList.size(); i++) {
				System.out.printf("(%d) %s %s, %s, %d\n", i+1, fmList.get(i).getFirstName(), fmList.get(i).getLastName(), fmList.get(i).getSex(), fmList.get(i).getAge());
			}
			Scanner scDissmiss = new Scanner(System.in);
			System.out.printf("> ");
			fmList.remove(scDissmiss.nextInt()-1);
			//scDissmiss.close();
		} else {  // ak je pole prazdne
			System.out.println("(empty)");
		}
	}
	
}
