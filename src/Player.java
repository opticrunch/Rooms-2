import java.util.Scanner;

public class Player {

    // Fields
    int playerAge;
    String playerName;
    double playerTemp;
    String currentRoom;

    //Constructor
    public Player(int age, String name, double temp, String room){
        playerAge = age;
        playerName = name;
        playerTemp = temp;
        currentRoom = room;
    }

    // Method to get player input
    public String getInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // Method to see if player is still alive
    public boolean isAlive(){
        return playerTemp >= 95.0;
    }

    /*
    public String movePlayer(String playerInput){

        String nextRoom;

        switch (currentRoom){
            case "CONTAINMENT":
                if (playerInput == )
                //code here
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
