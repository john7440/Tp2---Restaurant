package fr.ex.resto;

import java.util.Scanner;

public class Menus {
	
	public static String entryChoice() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Que souhaitez vous comme entrée :");
        System.out.println("1. Salade");
        System.out.println("2. Soupe");
        System.out.println("3. Quiche");
        System.out.println("4. Aucune");
        
        int choice = scan.nextInt();
        scan.nextLine();
        
        
        switch (choice) {
        	
        	case 1:
        		return "Salade";
        	case 2:
        		return "Soupe";
        	case 3:
        		return "Quiche";
        	case 4:
        		return "Aucune";
        	default:
        		System.out.println("Je n'ai pas saisi votre choix comme entrée. Aucune sélectionner par défaut.");
        		return "Aucune";
        		
        }
	}
	
	public static String plateChoice() {
			
			Scanner scan = new Scanner(System.in);
			
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
	        		System.out.println("Je n'ai pas saisi votre demande. Aucune sélectionner par défaut.");
	        		return "Aucun";
	        		
	        }
		}

	public static void main(String[] args) {


		String entry = entryChoice();
		String plate = plateChoice();
		System.out.println("Vous avez choisi en entrée: " + entry);
		System.out.println("Vous avez choisi comme plat: " + plate);

	}
}
