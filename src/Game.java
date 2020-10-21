// Driver class containing main

// Import to use Scanner to get player input
import java.util.Scanner;

public class Game {

    // Prints the game title logo
    public static void printLogo(){
        System.out.println("             _____   ____   ____  __  __  _____");
        System.out.println("            |  __ \\ / __ \\ / __ \\|  \\/  |/ ____|");
        System.out.println("            | |__) | |  | | |  | | \\  / | (___ ");
        System.out.println("            |  _  /| |  | | |  | | |\\/| |\\___ \\");
        System.out.println("            | | \\ \\| |__| | |__| | |  | |____) |");
        System.out.println("            |_|  \\_|\\____/ \\____/|_|  |_|_____/\n");
        System.out.println("____ ___  ____ ____ _    _  _ ___ ____    ___  ____ ____ ____ ");
        System.out.println("|__| |__] [__  |  | |    |  |  |  |___      /  |___ |__/ |  | ");
        System.out.println("|  | |__] ___] |__| |___ |__|  |  |___     /__ |___ |  \\ |__|\n");
    }

    // Initializes the main menu
    public static void mainMenu(){

    }

    // Main method
    public static void main(String[] args) {

        printLogo();

        mainMenu();

        Player player = new Player(31, "Stephen", 98.6, "CONTAINMENT");
    }
}
