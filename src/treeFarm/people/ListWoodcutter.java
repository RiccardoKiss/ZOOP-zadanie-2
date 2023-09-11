package treeFarm.people;

import java.util.ArrayList;
import java.util.Scanner;

public class ListWoodcutter {			// ZOZNAM DREVORUBACOV
	private static ArrayList<Woodcutter> wcList = new ArrayList<Woodcutter>();
	
	public ListWoodcutter(String firstName, String lastName, boolean sex, int age) {
		wcList.add(new Woodcutter(firstName, lastName, sex, age));
		
	}
	
	public static void showList() {
		System.out.println("WOODCUTER list:");
		if (!wcList.isEmpty()) {
			for (int i = 0; i < wcList.size(); i++) {
				System.out.printf("[ %d ]: %s %s, %b, %d", i+1, wcList.get(i).getFirstName(), wcList.get(i).getLastName(), wcList.get(i).getSex(), wcList.get(i).getAge());
			}
		} else {
			System.out.println("(empty)");
		}
	}
	
	public static void dissmissWoodcutter() {
		System.out.println("Dismiss WOODCUTTER:");
		if (!wcList.isEmpty()) {
			for (int i = 0; i < wcList.size(); i++) {
				System.out.printf("(%d) %s %s, %s, %d\n", i+1, wcList.get(i).getFirstName(), wcList.get(i).getLastName(), wcList.get(i).getSex(), wcList.get(i).getAge());
			}
			Scanner scDissmiss = new Scanner(System.in);
			wcList.remove(scDissmiss.nextInt()-1);
			//scDissmiss.close();
		} else {
			System.out.println("(empty)");
		}
		
	}
}
