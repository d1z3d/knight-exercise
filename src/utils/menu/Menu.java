package utils.menu;

public class Menu {
    public static void showGlobalMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print knight stats");
        System.out.println("2. Show ammunition");
        System.out.println("3. Equip ammunition");
        System.out.println("6. Exit");
        System.out.println("");
        System.out.println("Choose option and press Enter:");
    }

    public static void showOutfitMenu(){
        System.out.println("");
        System.out.println("What kind of ammunition do you want to equip?");
        System.out.println("1. ClassesEquipment.Sword");
        System.out.println("2. ClassesEquipment.Helmet");
        System.out.println("");
        System.out.println("Choose option and press Enter:");
    }
}
