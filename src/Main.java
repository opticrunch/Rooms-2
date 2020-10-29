// Driver class containing main and game loop
public class Main {

    // Main method
    public static void main(String[] args) {

        // Creates instances of Player and Input that will be used for the game
        Player player = new Player(31, "Stephen", 98.6, "CONTAINMENT");
        Input userInput = new Input();

        // Prints the logo and handles main menu
        Graphics.printLogo();
        Menu.mainMenu(player, userInput);

        // Item initialization
        Item screwdriver = new Item("SCREWDRIVER");

        // Game loop
        while (player.isAlive()) {

            // Prints the HUD at start of game loop
            Graphics.printHud(player);
        }
    }
}
