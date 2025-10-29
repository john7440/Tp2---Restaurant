package fr.ex.resto;

import java.util.Scanner;

public class Menus {
	
	public static String entryChoice() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choisissez une entrée :");
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
        		System.out.println("Je n'ai pas saisi votre demande. Aucune sélectionner par défaut.");
        		return "Aucune";
        		
        }
	}

	public static void main(String[] args) {


		String entry = entryChoice();
		System.out.println("Vous avez choisi en entré: " + entry);

	}

}
