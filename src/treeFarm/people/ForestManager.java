package treeFarm.people;

import java.util.Scanner;

public class ForestManager extends Worker{		// SPRAVCA LESA
	static Scanner scForestManager = new Scanner(System.in);
	
	public ForestManager(String firstName, String lastName, boolean sex, int age) {
		super(firstName, lastName, sex, age);
		
	}
	
	public static void hireForestManager() {
		System.out.printf("Enter [first name, last name, sex, age]:\n> ");
		String fmFirstName = scForestManager.next();
		String fmLastName = scForestManager.next();
		boolean fmSex = scForestManager.nextBoolean();
		int fmAge = scForestManager.nextInt();
		ListForestManager fmList = new ListForestManager(fmFirstName, fmLastName, fmSex, fmAge);
		System.out.printf("::%s %s, %s, %d\n", fmLastName, fmFirstName, fmSex ? "male" : "female", fmAge);
		/*
		ListForestManager fmList = new ListForestManager();
		fmList.setList();	// alebo mozno nejak cez settery z Worker.java 
		*/
	}
	
	public static void hireWoodcutter() {
		System.out.printf("Enter [first name, last name, sex, age]:\n> ");
		String wcFirstName = scForestManager.next();
		String wcLastName = scForestManager.next();
		boolean wcSex = scForestManager.nextBoolean();
		int wcAge = scForestManager.nextInt();
		ListWoodcutter wcList = new ListWoodcutter(wcFirstName, wcLastName, wcSex, wcAge);
	}
	
}
