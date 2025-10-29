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
			
			
			System.out.println("Que souhaitez vous comme plats: ");
	        System.out.println("1. Poulet");
	        System.out.println("2. Boeuf");
	        System.out.println("3. Poisson");
	        System.out.println("4. Végétarien");
	        System.out.println("5. Végan");
	        System.out.println("6. Aucun");
	        
	        
	        int choice = scan.nextInt();
	        scan.nextLine();
	        
	        
	        switch (choice) {
	        	
	        	case 1:
	        		return "Poulet";
	        	case 2:
	        		return "Boeuf";
	        	case 3:
	        		return "Poisson";
	        	case 4:
	        		return "Végétarien";
	        	case 5:
	        		return "Végan";
	        	case 6:
	        		return "Aucun";
	        	default:
	        		System.out.println("Je n'ai pas saisi votre demande. Aucun sélectionner par défaut.");
	        		return "Aucun";
	        		
	        }
		}
	
	public static String sideChoice() {
			
			
			System.out.println("Que souhaitez vous comme accompagnements :");
	        System.out.println("1. Riz");
	        System.out.println("2. Pâtes");
	        System.out.println("3. Frites");
	        System.out.println("4. Légumes");
	        System.out.println("5. Aucun");
	        
	        int choice = scan.nextInt();
	        scan.nextLine();
	        
	        
	        switch (choice) {
	        	
	        	case 1:
	        		return "Riz";
	        	case 2:
	        		return "Pâtes";
	        	case 3:
	        		return "Frites";
	        	case 4:
	        		return "Légumes";
	        	case 5:
	        		return "Aucun";
	        	default:
	        		System.out.println("Je n'ai pas saisi votre choix. Aucune sélectionner par défaut.");
	        		return "Aucun";
	        		
	        }
		}
	
	public static String drinkChoice() {
		
		
		System.out.println("Que souhaitez vous comme boissons :");
        System.out.println("1. Eau plate");
        System.out.println("2. Eau Gazeuse");
        System.out.println("3. Soda");
        System.out.println("4. Vin");
        System.out.println("5. Aucune");
        
        int choice = scan.nextInt();
        scan.nextLine();
        
        
        switch (choice) {
        	
        	case 1:
        		return "Eau plate";
        	case 2:
        		return "Eau Gazeuse";
        	case 3:
        		return "Soda";
        	case 4:
        		return "Vin";
        	case 5:
        		return "Aucune";
        	default:
        		System.out.println("Je n'ai pas saisi votre choix. Aucune sélectionner par défaut.");
        		return "Aucune";
        		
        }
	}
	
	public static String dessertChoice() {
			
			
			System.out.println("Que souhaitez vous comme desserts :");
	        System.out.println("1. Tarte Maison");
	        System.out.println("2. Mousse au Chocolat");
	        System.out.println("3. Tiramisu");
	        System.out.println("4. Glaçes");
	        System.out.println("5. Aucun");
	        
	        int choice = scan.nextInt();
	        scan.nextLine();
	       
	        
	        switch (choice) {
	        	
	        	case 1:
	        		return "Tarte Maison";
	        	case 2:
	        		return "Mousse au Chocolat";
	        	case 3:
	        		return "Tiramisu";
	        	case 4:
	        		return "Glaçes";
	        	case 5:
	        		return "Aucun";
	        	default:
	        		System.out.println("Je n'ai pas saisi votre choix. Aucune sélectionner par défaut.");
	        		return "Aucun";
	        		
	        	
	        }
	        
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
