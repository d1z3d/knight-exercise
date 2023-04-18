package utils;

import knight.ammunition.helmet.Helmet;
import knight.ammunition.sword.Sword;

import java.util.Scanner;

public class Utils {
    public static void printKnightStats(Helmet knightHelmet, Sword knightSword) {
        try {
            System.out.println("Ammunition cost: " + (knightHelmet.getCost() + knightSword.getCost()));
            System.out.println("Ammunition weight: " + (knightHelmet.getWeight() + knightSword.getCost()));
            System.out.println("Ammunition damage: " + (knightHelmet.getDamage() + knightSword.getDamage()));
            System.out.println("Ammunition protection: " + (knightHelmet.getProtection() + knightSword.getProtection()));
            System.out.println("");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void showAmmunition(Helmet knightHelmet, Sword knightSword) {
        try {
            String showSword = (knightSword.getCost() + knightSword.getDamage() + knightSword.getWeight()) > 0 ? showSword(knightSword) : knightSword.getDefaultValue();
            System.out.println(showSword);

            String showHelmet = (knightHelmet.getCost() + knightSword.getProtection() + knightSword.getWeight()) > 0 ? showHelmet(knightHelmet) : knightHelmet.getDefaultValue();
            System.out.println(showHelmet);

            System.out.println("");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void equipAmmunition(Scanner userInput, Helmet knightHelmet, Sword knightSword) {
        System.out.println("What kind of ammunition do you want to equip?");
        System.out.println("1. ClassesEquipment.Sword");
        System.out.println("2. ClassesEquipment.Helmet");
        System.out.println("");
        System.out.println("Choose option and press Enter:");

        int userChoose = userInput.nextInt();

        //наверно можно сделать IEquip. хз как сделать через интерфейс
        switch (userChoose) {
            case 1:
                equipSword(userInput, knightSword);
                break;
            case 2:
                equipHelmet(userInput, knightHelmet);
                break;
        }
    }

    private static void equipSword(Scanner userInput, Sword knightSword) {
        try {
            System.out.println("Input sword weight:");
            int selectedSwordWeight = userInput.nextInt();
            knightSword.setWeight(selectedSwordWeight);

            System.out.println("Input sword cost:");
            int selectedSwordCost = userInput.nextInt();
            knightSword.setCost(selectedSwordCost);

            System.out.println("Input sword damage:");
            int selectedSwordDamage = userInput.nextInt();
            knightSword.setDamage(selectedSwordDamage);
            System.out.println("");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    private static void equipHelmet(Scanner userInput, Helmet knightHelmet) {
        try {
            System.out.println("Input helmet weight:");
            int selectedHelmetWeight = userInput.nextInt();
            knightHelmet.setWeight(selectedHelmetWeight);

            System.out.println("Input helmet cost:");
            int selectedHelmetCost = userInput.nextInt();
            knightHelmet.setCost(selectedHelmetCost);

            System.out.println("Input helmet protection:");
            int selectedHelmetProtection = userInput.nextInt();
            knightHelmet.setProtection(selectedHelmetProtection);
            System.out.println("");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print knight stats");
        System.out.println("2. Show ammunition");
        System.out.println("3. Equip ammunition");
        System.out.println("6. Exit");
        System.out.println("");
        System.out.println("Choose option and press Enter:");
    }

    private static String showSword(Sword knightSword) {
         return "ClassesEquipment.Sword{damage=" + knightSword.getDamage() +
                ", weight=" + knightSword.getWeight() +
                ", cost=" + knightSword.getCost() + "}";
    }

    private static String showHelmet(Helmet knightHelmet) {
        return "ClassesEquipment.Helmet{protection=" + knightHelmet.getProtection() +
                ", weight=" + knightHelmet.getWeight() +
                ", cost=" + knightHelmet.getCost() + "}";
    }
}
