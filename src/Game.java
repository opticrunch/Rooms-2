// Driver class containing main

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

    public static void printHud(Player player) {
        System.out.println("______________________________________________________________");
        System.out.println("NAME: " + player.playerName + " | AGE: " + player.playerAge +
                " | ROOM: " + player.currentRoom + " | BODY TEMP: " + player.playerTemp);
        System.out.println();
        System.out.println("          MAP           COMPASS");
        System.out.println("       ____ ____");
        System.out.println("   ___|    |    |___       N");
        System.out.println("  |   |_  _|_  _|   |    W + E");
        System.out.println("  |   |    |    |          S");
        System.out.println("  |_________________|");
    }

    // Initializes the main menu
    public static void mainMenu(Player player, Input userInput) {
        System.out.println("Enter START to begin. Enter HELP for instructions.");
        String playerChoice = userInput.getStringInput();
        while (!playerChoice.equals("START")) {
            if (playerChoice.equals("HELP")) {
                System.out.println("Help goes here.");
            } else {
                System.out.println("Please enter a valid choice");
            }
            playerChoice = userInput.getStringInput();
        }
        System.out.println("Enter your name:");
        player.playerName = userInput.getStringInput();
        System.out.println("Enter your age:");
        player.playerAge = userInput.getIntInput();
    }

    // Main method
    public static void main(String[] args) {
        Player player = new Player(31, "Stephen", 98.6, "CONTAINMENT");
        Input userInput = new Input();
        printLogo();
        mainMenu(player, userInput);
        System.out.println(player.playerName + player.playerAge);

        while (player.isAlive()) {
            // Game loop here
            printHud(player);
            System.out.println("GAME LOOP");
            userInput.getStringInput();
        }
    }
}
