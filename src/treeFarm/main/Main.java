package treeFarm.main;

import java.util.Scanner;

//import java.util.concurrent.ThreadLocalRandom;
//int min = 0, max = 10;
//int randomInt = ThreadLocalRandom.current().nextInt(min, max + 1);

public class Main {

	public static void main(String[] args) {
		String currentMenu = "" + 0;  // aby som mohol lahko menit na stavy (vid. Menu.java), napr. 03+1=031 stav 
		Scanner scMain = new Scanner(System.in);
		Menu.nextDay();
		while(true) {
			currentMenu = Menu.getCurrentMenu();  // potrebujem returnovat hodnotu currentMenu z Menu.java do Mainu
			Menu.switchMenu(currentMenu);
			System.out.printf("Main>> ");
			currentMenu = Menu.getCurrentMenu();  // !!!musim ho znova getnut lebo vo switchMenu() sa menil currentMenu v Menu.java
			currentMenu += scMain.nextInt();
			if (currentMenu.equals("05")) {		// ked zadam na vstupe kod pre stav "EXIT" programu
				break;
			} else {
				Menu.setCurrentMenu(currentMenu);
			}
		}
		scMain.close();
	}
}
