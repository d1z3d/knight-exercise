package utils;

import knight.Knight;
import utils.menu.Menu;

import java.util.Scanner;

public class Utils {
    public static void printKnightStats(Knight knight) {
        knight.showStats();
        loader();
    }

    public static void showAmmunition(Knight knight) {
        System.out.println("");
        String swordToShow = (knight.sword.getCost() + knight.sword.getDamage() + knight.sword.getWeight()) > 0 ? knight.showSword() : knight.sword.getDefaultValue();
        System.out.println(swordToShow);

        String helmetToShow = (knight.helmet.getCost() + knight.helmet.getProtection() + knight.helmet.getWeight()) > 0 ? knight.showHelmet() : knight.helmet.getDefaultValue();
        System.out.println(helmetToShow);

        loader();
    }

    public static void equipAmmunition(Scanner userInput, Knight knight) {
        Menu.showOutfitMenu();
        int userChoose = userInput.nextInt();

        switch (userChoose) {
            case 1:
                equipSword(userInput, knight);
                break;
            case 2:
                equipHelmet(userInput, knight);
                break;
        }
    }

    private static void equipSword(Scanner userInput, Knight knight) {

        //Пользователь выбирает weight
        System.out.println("Input sword weight:");
        int selectedSwordWeight = userInput.nextInt();

        //Пользователь выбирает cost
        System.out.println("Input sword cost:");
        int selectedSwordCost = userInput.nextInt();

        //Пользователь выбариает damage
        System.out.println("Input sword damage:");
        int selectedSwordDamage = userInput.nextInt();

        knight.equipSword(selectedSwordWeight, selectedSwordCost, selectedSwordDamage);

        loader();
    }
    private static void equipHelmet(Scanner userInput, Knight knight) {
        System.out.println("Input helmet weight:");
        int selectedHelmetWeight = userInput.nextInt();

        System.out.println("Input helmet cost:");
        int selectedHelmetCost = userInput.nextInt();

        System.out.println("Input helmet protection:");
        int selectedHelmetProtection = userInput.nextInt();

        knight.equipHelmet(selectedHelmetWeight, selectedHelmetCost, selectedHelmetProtection);
        loader();
    }

    private static void loader(){
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print(".");
                Thread.sleep(750);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("");
        }
    }
}
