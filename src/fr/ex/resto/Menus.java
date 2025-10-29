package fr.ex.resto;

import java.util.Scanner;

public class Menus {
	
	private static final Scanner scan = new Scanner(System.in);
	
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
			System.out.println("Je n'ai pas saisi votre demande! Aucun(e) comme sélection par défaut!");
	        return "Aucun(e)";
		}
	}
	
	
	public static String entryChoice() {
	    return getChoice("Que souhaitez-vous comme entrée :", new String[] {
	        "Salade", "Soupe", "Quiche", "Aucune"
	    });
	}
	
	
	public static String mainCourseChoice() {
	    return getChoice("Que souhaitez-vous comme plat :", new String[] {
	        "Poulet", "Boeuf", "Poisson", "Végétarien", "Végan", "Aucun"
	    });
	}
	
	
	public static String sideChoice() {
	    return getChoice("Que souhaitez-vous comme accompagnements :", new String[] {
	        "Riz", "Pâtes", "Frites", "Légumes", "Aucun"
	    });
	}
	
	public static String drinkChoice() {
	    return getChoice("Que souhaitez-vous comme boissons :", new String[] {
	        "Eau Plate", "Eau Gazeuse", "Soda", "Vin", "Aucune"
	    });
	}
	
	public static String dessertChoice() {
	    return getChoice("Que désirez-vous comme dessert :", new String[] {
	        "Tarte Maison", "Mousse au chocolat", "Tiramisu", "Glaçes", "Aucun"
	    });
	}

	
		

	public static void main(String[] args) {


		String entry = entryChoice();
		String plate = mainCourseChoice();
		String accompagnements = sideChoice();
		String drink = drinkChoice();
		String dessert = dessertChoice();
		System.out.println("Vous avez choisi en entrée: " + entry);
		System.out.println("Vous avez choisi comme plat: " + plate);
		System.out.println("Vous avez choisi comme accompagenement: " + accompagnements);
		System.out.println("Vous avez choisi comme boisson: " + drink);
		System.out.println("Vous avez choisi comme dessert: " + dessert);

	}
}
