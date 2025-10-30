# 🍽️ Système de Commande de Menus

Cette application **console en Java** permet aux utilisateurs de **passer des commandes** de repas en sélectionnant **différentes options pour chaque partie du menu** : entrée, plat principal, accompagnement, boisson et dessert. 
Elle prend en charge plusieurs commandes et affiche un récapitulatif à la fin.

### 📦 Structure du Package
fr.ex.resto
- **MainMenu.java** : Classe principale qui exécute le programme et gère l'interaction utilisateur.
- **Menus.java** : Classe utilitaire pour afficher les options et récupérer les choix.

### 🚀 Fonctionnement
1. L'utilisateur indique combien de menus il souhaite commander.
2. Pour chaque menu, le programme demande à l'utilisateur de choisir:
   - Une entrée
   - Un plat principal
   - Un accompagnement
   - Une boisson
   - Un dessert
  3. Chaque sélection est enregistrée et affichée dans un récapitulatif des commandes.

### 📁 Exécution
- Prérequis: Java 8 ou supérieur.
- Compilation et éxécution:

        javac fr/ex/resto/MainMenu.java
        java fr.ex.resto.MainMenu
