import java.util.Scanner;

public class LineSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        int [] dataPoints = new int[100];
        int userNum = Helper.getRangedInt(scan, "Choose a number between 1 and 100", 1, 100);
        int counter = 0;

        // Sets the random values in the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)((Math.random() * 100) + 1);
        }

        // Prints out the random values with a spacer between them
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        // Counts how many instances the user number appears in a random set
        for (int i = 0; i < dataPoints.length; i++) {
            if (userNum == dataPoints[i]) {
                counter ++;
            }
        }

        System.out.println(" ");
        System.out.println("The number " + userNum + " is found " + counter + " time(s).");

        // Reset counter and ask for a new number
        userNum = Helper.getRangedInt(scan, "Choose another number (1-100)", 1, 100);
        counter = -1;

        // Finds the first instance of an imputed number
        // If the number is not in the data set there is a message
        for (int i = 0; i < dataPoints.length; i++) {
            if (userNum == dataPoints[i]) {
                counter = i;
                break;
            }
        }

        if (counter != -1) {
            System.out.println(userNum + " is found at the " + counter + " index");
        } else {
            System.out.println(userNum + " is not found in the array");
        }
    }
}
