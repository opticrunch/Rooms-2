// This class handles all functions that print out ASCII graphics and long blocks of text
public class Graphics {

    // Prints the game title logo
    public static void printLogo() {
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
        System.out.println("          MAP           COMPASS          ITEMS");
        System.out.println("       ____ ____                         ");
        if (player.currentRoom.equals("ELECTRICAL")) {
            System.out.println("   ___| X  |    |___       N");
        } else if (player.currentRoom.equals("MESS HALL")) {
            System.out.println("   ___|    | X  |___       N");
        } else {
            System.out.println("   ___|    |    |___       N");
        }
        System.out.println("  |   |_  _|_  _|   |    W + E");
        if (player.currentRoom.equals("CONTAINMENT")) {
            System.out.println("  | X |    |    |          S");
        } else if (player.currentRoom.equals("DECONTAMINATION")) {
            System.out.println("  |   |    |    | X        S");
        } else {
            System.out.println("  |   |    |    |          S");
        }
        System.out.println("  |_________________|");
    }

    public static void printHelp() {
        System.out.println("ROOMS: ABSOLUTE ZERO is a text based puzzle adventure game.");
        System.out.println("Your goal is to escape a mysterious arctic research station.");
        System.out.println("You will have a MAP and COMPASS to help you navigate.\n");
        System.out.println("              MAP           COMPASS");
        System.out.println("           ____ ____ ");
        System.out.println("       ___|    |    |___       N");
        System.out.println("      |   |_  _|_  _|   |    W + E");
        System.out.println("      | X |    |    |          S");
        System.out.println("      |_________________|");
        System.out.println("The map shows an X to indicate what room you are in.");
        System.out.println("The compass will help you determine what direction to go.\n");
        System.out.println("Type in commands to move around and interact with the world.");
        System.out.println("A list of available commands will be displayed on the HUD.");
        System.out.println("Objects written in ALL CAPS are likely interactive.\n");
        System.out.println("Escape before the temperature in the facility falls too low...");
        System.out.println("                                         ...or it's game over!");

    }
}
