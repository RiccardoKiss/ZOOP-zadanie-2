package treeFarm.main;

import java.util.Scanner;

import treeFarm.people.ForestManager;
import treeFarm.people.ListForestManager;
import treeFarm.people.ListWoodcutter;
import treeFarm.tree.Coniferous;
import treeFarm.tree.Deciduous;
import treeFarm.tree.ListConiferous;
import treeFarm.tree.ListDeciduous;

/** KODOVANIE STAVOV MENU:
 * @author Riccardo Kiss
 * 0 - main menu
 * 01 - forest manager menu
 * 	011 - add FM
 * 	012 - remove FM
 * 	013 - show all FM
 *		0131 - back
 * 	014 - add WC
 * 	015 - remove WC
 * 	016 - back
 * 02 - woodcutter menu
 * 	021 - show all WC
 *		0211 - back
 * 	022 - pick axe
 * 	023 - pick bucket
 * 	024 - back
 * 03 - tree menu
 * 	031 - deciduous menu
 *		0311 - add deciduous
 *		0312 - show all deciduous
 *			03121 - back
 *		0313 - back
 *	032 - coniferous menu
 *		0321 - add coniferous
 *		0322 - show all coniferous
 *			03221 - back
 *		0323 - back
 *	033 - back
 * 04 - next day
 */
public class Menu {			// MENU
	private static int counterDay = 0;
	private static String currentMenu = "" + 0;
	
	public static  String getCurrentMenu() {
		return currentMenu;
	}

	public static void setCurrentMenu(String currentMenu) {
		Menu.currentMenu = currentMenu;
	}

	public static void switchMenu(String currentMenu) {
		switch (currentMenu) {
		case "0":		menuMain(); break;
		case "01":		menuForestManager(); break;
		case "011":		ForestManager.hireForestManager(); menuBack(currentMenu); break;
		case "012":		ListForestManager.dissmissForestManager(); menuBack(currentMenu); break;	// zoznam FM pod sebou, po zvoleni poradia sa dotycny vymaze
		case "013":		ListForestManager.showList(); menuBack(currentMenu); break;
		//case "0131":	menuBack(currentMenu, 2); break;  // nepotrebujem, spravi sa automaticky
		case "014":		ForestManager.hireWoodcutter(); menuBack(currentMenu); break;
		case "015":		ListWoodcutter.dissmissWoodcutter(); menuBack(currentMenu); break;
		case "016":		menuBack(currentMenu, 2); break;
		case "02":		menuWoodcutter(); break;
		case "021":		ListWoodcutter.showList(); menuBack(currentMenu); break;
		//case "0211":	menuBack(currentMenu); menuBack(currentMenu); break;  // nepotrebujem, spravi sa automaticky
		case "022":		Menu.menuPickAxe(); menuBack(currentMenu); break;			// TBD
		case "023":		Menu.menuPickBucket(); menuBack(currentMenu); break;		// TBD
		case "024":		menuBack(currentMenu, 2); break;
		case "03":		menuTree(); break;
		case "031":		menuDeciduous(); break;
		case "0311":	Deciduous.addDeciduous(); menuBack(currentMenu); break;
		case "0312":	ListDeciduous.showList(); menuBack(currentMenu); break;
		//case "03121":	menuBack(currentMenu, 2); break;	// nepotrebujem, spravi sa automaticky
		case "0313":	menuBack(currentMenu, 2); break;
		case "032":		menuConiferous(); break;
		case "0321":	Coniferous.addConiferous(); menuBack(currentMenu); break;
		case "0322":	ListConiferous.showList(); menuBack(currentMenu); break;
		//case "03221":	menuBack(currentMenu, 2); break;	// nepotrebujem, spravi sa automaticky
		case "0323":	menuBack(currentMenu, 2); break;
		case "033":		menuBack(currentMenu, 2); break;
		case "04":		nextDay(); menuMain(); break;
		//case "05":		return;	// nefunguje
		default:		return;	//break;
		}
		currentMenu = getCurrentMenu();
	}
	
	public static void nextDay() {
		counterDay++;
		System.out.printf(">>>>> DAY #%d <<<<<", counterDay);
	}

	private static void menuPickBucket() {
		// TODO Auto-generated method stub
		
	}

	private static void menuPickAxe() {
		// TODO Auto-generated method stub
		
	}

	private static void menuBack(String currentMenu) {
		currentMenu = currentMenu.substring(0, currentMenu.length()-1);  // vymazat poslednu cifru, endIndex je exclusive
		setCurrentMenu(currentMenu);
		switchMenu(getCurrentMenu());
	}
	private static void menuBack(String currentMenu, int key) {		// overload
		currentMenu = currentMenu.substring(0, currentMenu.length()-key);
		setCurrentMenu(currentMenu);
		switchMenu(getCurrentMenu());
	}

	private static void menuMain() {
		System.out.printf("\n##### Main Menu #####\n");
		System.out.println("(1) Forest Manager");
		System.out.println("(2) Woodcutter");
		System.out.println("(3) Tree");
		System.out.println("(4) NEXT DAY");
		System.out.println("(5) EXIT");
		System.out.println("#####################");
	}
	private static void menuForestManager() {
		System.out.printf("\n***** Forest Manager Menu *****\n");
		System.out.println("(1) Hire forest manager");
		System.out.println("(2) Dismiss forest manager");
		System.out.println("(3) Show all");
		System.out.println("(4) Hire woodcutter");
		System.out.println("(5) Dismiss woodcutter");
		System.out.println("(6) BACK");
		System.out.println("*******************************");
	}
	private static void menuWoodcutter() {
		System.out.printf("\n***** Woodcutter Menu *****\n");
		System.out.println("(1) Show all");
		System.out.println("(2) Pick axe");
		System.out.println("(3) Pick bucket");
		System.out.println("(4) BACK");
		System.out.println("***************************");
	}
	public static void menuTree() {
		System.out.printf("\n***** Tree Menu *****\n");
		System.out.println("(1) Deciduous trees");
		System.out.println("(2) Coniferous trees");
		System.out.println("(3) BACK");
		System.out.println("*********************");
	}
	public static void menuDeciduous() {
		System.out.printf("\n~~~~~ Deciduous Tree Menu ~~~~~\n");
		System.out.println("(1) Add deciduous tree");
		System.out.println("(2) Show all");
		System.out.println("(3) BACK");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	private static void menuConiferous() {
		System.out.printf("\n~~~~~ Coniferous Tree Menu ~~~~~\n");
		System.out.println("(1) Add coniferous tree");
		System.out.println("(2) Show all");
		System.out.println("(3) BACK");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
