package fr.ex.resto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

	public static void main(String[] args) {
		
		System.out.println("Bonjour, combien de menus désirez vous commander? ");
		Scanner scan = new Scanner(System.in);
		
		int choice = scan.nextInt();
		scan.nextLine();
		
		List<String> listOrders = new ArrayList<>();
		
		for (int i = 1; i < choice +1; i++) {
			System.out.println("\n============Menu #" + i +"============");
			
			String entry = Menus.entryChoice();
			String mainCourse = Menus.mainCourseChoice();
			String side= Menus.sideChoice();
			String drink = Menus.drinkChoice();
			String dessert = Menus.dessertChoice();
			
			String order = "------Menu #" + i + "------" + "\n"
                    + "- Entrée : " + entry + "\n"
                    + "- Plat : " + mainCourse + "\n"
                    + "- Accompagnement : " + side + "\n"
                    + "- Boisson : " + drink + "\n"
                    + "- Dessert : " + dessert;

            listOrders.add(order);
		}
		
		System.out.println("\nRécapitulatif des commandes: ");
		for (String order : listOrders) {
            System.out.println("\n" + order);
        }
		
		scan.close();
		
	}

}
