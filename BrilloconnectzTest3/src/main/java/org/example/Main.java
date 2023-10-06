package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PancakeShop shop = new PancakeShop();
        int startTime = 0;
        int endTime = 30;
        int totalTime = 0;

        while (totalTime <= 300) { // Run for a maximum of 300 seconds.
            shop.makePancakes();

            int totalPancakesEaten = 0;
            int user1Eaten = 0;
            int user2Eaten = 0;
            int user3Eaten = 0;

            while (totalPancakesEaten < 12) {
                // Calculate how many pancakes each user wants to eat.
                user1Eaten = Math.min(5, shop.getPancakesMade() - totalPancakesEaten);
                user2Eaten = Math.min(5, shop.getPancakesMade() - totalPancakesEaten - user1Eaten);
                user3Eaten = Math.min(5, shop.getPancakesMade() - totalPancakesEaten - user1Eaten - user2Eaten);

                // Update the total pancakes eaten.
                totalPancakesEaten += user1Eaten + user2Eaten + user3Eaten;

                // Serve the pancakes to users.
                shop.servePancakes(user1Eaten);
                shop.servePancakes(user2Eaten);
                shop.servePancakes(user3Eaten);
            }

            System.out.println("Starting time: " + startTime + " seconds");
            System.out.println("Ending time: " + endTime + " seconds");
            System.out.println("Pancakes made by the shopkeeper: " + shop.getPancakesMade());
            System.out.println("Pancakes eaten by the users: " + shop.getPancakesEaten());
            System.out.println("Shopkeeper met the needs of the users: " + (shop.getPancakesEaten() >= 12));
            System.out.println("Pancakes wasted: " + (shop.getPancakesMade() - shop.getPancakesEaten()));
            System.out.println("------------------------------------");
            startTime = endTime;
            endTime += 30;
            totalTime += 30;

            if (shop.getPancakesEaten() >= 12) {
                break;
            }
        }
    }

}