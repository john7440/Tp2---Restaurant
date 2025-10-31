package fr.ex.resto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

	public static void main(String[] args) {
		
		// It prompt the user to enter the number of menus they wish to order
		System.out.println("Bonjour, combien de menus désirez vous commander? ");
		Scanner scan = new Scanner(System.in);
		
		if (scan.hasNextInt()) {
			int choice = scan.nextInt();
			scan.nextLine();
			
			// Create a list to store all the menu orders
			List<String> listOrders = new ArrayList<>();
			
			// Loop through the number of menus requested and collect user choices
			for (int i = 1; i < choice +1; i++) {
				System.out.println("\n============Menu #" + i +"============");
				
				// Collect individual choices for each part of the menu
				String entry = Menus.appetizerChoice();
				String mainCourse = Menus.mainCourseChoice();
				String side= Menus.sideChoice();
				String drink = Menus.drinkChoice();
				String dessert = Menus.dessertChoice();
				
				// Format the menu summary
				String order = "------Menu #" + i + "------" + "\n"
	                    + "- Entrée : " + entry + "\n"
	                    + "- Plat : " + mainCourse + "\n"
	                    + "- Accompagnement : " + side + "\n"
	                    + "- Boisson : " + drink + "\n"
	                    + "- Dessert : " + dessert;
				
				// Add the formatted menu to the list of orders
	            listOrders.add(order);
			}
			
			// Display the summary of all orders
			System.out.println("\nRécapitulatif des commandes: ");
			for (String order : listOrders) {
	            System.out.println("\n" + order);
	        }
		} else {
			System.out.println("Je n'ai pas saisi votre demande! Veuillez saisir un nombre entier!");
		}
		scan.close();
		
	}

}
