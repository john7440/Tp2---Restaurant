package fr.ex.resto;

import java.util.Scanner;

public class Menus {
	
	// We declare a private static Scanner to be shared across all methods in the Menus class
	private static final Scanner scan = new Scanner(System.in);
	/**
     * Displays a question with a list of options and returns the user's selected choice.
     * If the input is invalid, a default value "Aucun(e)" is returned.
     *
     * @param question The question to display to the user
     * @param options The list of available choices
     * @return The selected option or "Aucun(e)" if the input is invalid
     */
	
	public static String getChoice(String question, String[] options) {
		System.out.println(question);
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + "." + options[i] );
		}
		
		int choice = scan.nextInt();
		scan.nextLine();
		
		if (choice >= 1 && choice <= options.length) {
			return options[choice -1];
		} else {
			System.out.println("Je n'ai pas saisi votre demande pour ! Aucun(e) comme sélection par défaut!\n");
	        return "Aucun(e)";
		}
	}
	
	
	// This method prompts the user to choose an appetizer
	public static String appetizerChoice() {
		
	    return getChoice("Que souhaitez-vous comme entrée :", new String[] {
	        "Salade", "Soupe", "Quiche", "Aucune"
	    });
	}
	
	// This method prompts the user to choose a main course
	public static String mainCourseChoice() {
	    return getChoice("Que souhaitez-vous comme plat :", new String[] {
	        "Poulet", "Boeuf", "Poisson", "Végétarien", "Végan", "Aucun"
	    });
	}
	
	// // This method prompts the user to choose an side dish
	public static String sideChoice() {
	    return getChoice("Que souhaitez-vous comme accompagnements :", new String[] {
	        "Riz", "Pâtes", "Frites", "Légumes", "Aucun"
	    });
	}
	
	// // This method prompts the user to choose a drink
	public static String drinkChoice() {
	    return getChoice("Que souhaitez-vous comme boissons :", new String[] {
	        "Eau Plate", "Eau Gazeuse", "Soda", "Vin", "Aucune"
	    });
	}
	
	// // This method prompts the user to choose a dessert
	public static String dessertChoice() {
	    return getChoice("Que désirez-vous comme dessert :", new String[] {
	        "Tarte Maison", "Mousse au chocolat", "Tiramisu", "Glaçes", "Aucun"
	    });
	}

}
