package fr.ex.resto;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {
	
	public static int getNextOrderNumber(String filename) {
		int lastOrderNumber = 0;
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
			String line;
			while((line = reader.readLine()) != null) {
				if (line.contains("Résumé de la commande n°")) {
					String[] parts = line.split("n°");
					if (parts.length >1) {
						String numberStr = parts[1].trim().split(" ")[0];
						lastOrderNumber = Integer.parseInt(numberStr);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// sil le fichier n'éxiste pas encore on laisse lastOrderNumber = 0 
		} catch (IOException e) {
			System.err.println("Erreur: " + e.getMessage());
		}
		return lastOrderNumber + 1;
	}
	
	public static void saveOrder(List<String> listOrders, String filename) {
		int orderNumber = getNextOrderNumber(filename);
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){
			
			writer.write("=== Résumé de la commande n°" + orderNumber + " ===");
			writer.newLine();
			writer.newLine();
			
			for (String order: listOrders) {
				writer.write(order);
				writer.newLine();
				writer.newLine();
			}
			
			writer.write("================================");
			writer.newLine();
			writer.newLine();
			
			System.out.println("\nCommande n°" + orderNumber + " sauvegardée dans " + filename);	
			
		} catch (IOException e) {
			System.err.println("Erreur lors de l'écriture du fichier: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		// It prompt the user to enter the number of menus they wish to order
		System.out.println("Bonjour, combien de menus désirez vous commander? ");
		Scanner scan = new Scanner(System.in);
		
		if (scan.hasNextInt()) {
			int choice = scan.nextInt();
			scan.nextLine();
			
			// We create a list to store all the menu orders
			List<String> listOrders = new ArrayList<>();
			
			// We loop through the number of menus requested and take user choices
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
			
			//ajout de la sauvergarde
			saveOrder(listOrders, "order.txt");
		} else {
			System.out.println("Je n'ai pas saisi votre demande! Veuillez saisir un nombre entier!");
		}
		scan.close();
		
	}

}
