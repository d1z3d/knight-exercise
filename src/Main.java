import knight.Knight;
import java.util.Scanner;

import static utils.Utils.*;


public class Main {
    public static void main(String[] args) {

        boolean globalState = true;
        Scanner userInput = new Scanner(System.in);
        int userChoose;

        Knight knight = new Knight();

        do {
            showMenu();
            userChoose = userInput.nextInt();

            switch(userChoose) {
                case 1:
                    printKnightStats(knight.helmet, knight.sword);
                    continue;
                case 2:
                    showAmmunition(knight.helmet, knight.sword);
                    continue;
                case 3:
                    equipAmmunition(userInput, knight.helmet, knight.sword);
                    continue;
                case 6:
                    globalState = false;
                    break;
            }
        } while (globalState);
    }
}
