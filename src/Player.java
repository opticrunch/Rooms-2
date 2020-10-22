import java.util.ArrayList;
import java.util.List;

public class Player {

    // Fields
    int playerAge;
    String playerName;
    double playerTemp;
    String currentRoom;

    //Constructor
    public Player(int age, String name, double temp, String room) {
        playerAge = age;
        playerName = name;
        playerTemp = temp;
        currentRoom = room;
    }

    // Method to see if player is still alive
    public boolean isAlive() {
        return playerTemp >= 95.0;
    }
}
