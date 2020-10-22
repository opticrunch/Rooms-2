public class Menu {

    // Initializes the main menu
    public static void mainMenu(Player player, Input userInput) {
        System.out.println("Enter START to begin. Enter HELP for instructions.");
        String playerChoice = userInput.getStringInput();
        while (!playerChoice.equals("START")) {
            if (playerChoice.equals("HELP")) {
                Graphics.printHelp();
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
}
