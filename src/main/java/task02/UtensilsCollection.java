/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task02;

/**
 *
 * @author TripleA679
 */
import java.util.ArrayList;

public class UtensilsCollection {
    public static void main(String[] args) {
        // Define an ArrayList<String> with food utensils
        ArrayList<String> utensils = new ArrayList<>();
        utensils.add("Chopstick");
        utensils.add("Fork");
        utensils.add("Spoon");
        utensils.add("Knife");

        // Add "Spatula" to the start of the list
        utensils.add(0, "Spatula");

        // Add "Tongs" to the end of the list
        utensils.add("Tongs");

        // Print the name of the third utensil
        String thirdUtensil = utensils.get(2);
        System.out.println("Name of the third utensil: " + thirdUtensil);

        // Print the index of "Chopstick"
        int chopstickIndex = utensils.indexOf("Chopstick");
        System.out.println("Index of \"Chopstick\": " + chopstickIndex);

        // Remove the fourth utensil
        utensils.remove(3);

        // Print the names of all the utensils using an enhanced for loop
        System.out.println("Names of all utensils:");
        for (String utensil : utensils) {
            System.out.println(utensil);
        }
    }
}
