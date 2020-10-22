// This class handles functions that receive and return player input
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    // Method to get player String input
    public String getStringInput(){
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input.toUpperCase();
    }

    // Method to get player Int input
    public int getIntInput(){
        Scanner userInput = new Scanner(System.in);
        int number = 0;
        boolean isInteger = false;
        while (!isInteger)
            try {
                number = userInput.nextInt();
                isInteger = true;
            } catch (InputMismatchException ex) {
                System.out.println("Enter a valid integer");
                userInput.nextLine();
            }
        return number;
    }

    /*
    public String movePlayer(String currentRoom, String chosenDirection){
        String nextRoom = null;
        switch (currentRoom){
            case "CONTAINMENT":
                if (chosenDirection.equals("EAST")) {
                    nextRoom = "OBSERVATION";
                } else {
                    System.out.println("There's nowhere to go that way");
                }
                break;
            case  "OBSERVATION":
                //code here 2
                break;
            case "QUARTERS":
                //code here 3
                break;
            case "ELECTRICAL":
                //code here 4
                break;
            case "MESS HALL":
                //code here 5
                break;
            case "DECONTAMINATION":
                //code here 6
            default:
                //code here 7
        }
        return nextRoom;
    }

     */
}
