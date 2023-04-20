import knight.Knight;
import utils.menu.Menu;

import java.util.Scanner;

import static utils.Utils.*;


public class Main {
    public static void main(String[] args) {

        boolean globalState = true;
        Scanner userInput = new Scanner(System.in);
        int userChoose;

        Knight knight = new Knight();

        do {
            Menu.showGlobalMenu();
            userChoose = userInput.nextInt();

            switch(userChoose) {
                case 1:
                    printKnightStats(knight);
                    continue;
                case 2:
                    showAmmunition(knight);
                    continue;
                case 3:
                    equipAmmunition(userInput, knight);
                    continue;
                case 6:
                    globalState = false;
                    break;
            }
        } while (globalState);
    }
}
