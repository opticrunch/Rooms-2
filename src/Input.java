import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    // Method to get player String input
    public String getStringInput(){
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput.toUpperCase();
    }

    // Method to get player Int input
    public int getIntInput(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean isInt = false;
        while (!isInt)
            try {
                number = input.nextInt();
                isInt = true;
            } catch (InputMismatchException ex) {
                System.out.println("Enter a valid integer");
                input.nextLine();
            }
        return number;
    }

}
