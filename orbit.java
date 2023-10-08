/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ei;
import java.util.Scanner;
/**
 *
 * @author keerthana
 */
public class orbit {
   
  
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Satellite satellite = new Satellite();

        System.out.println("Initial state:");
        displayWithDelay(satellite.getStatus(), 1000);

        while (true) {
            displayWithDelay("Enter command by number:",1000);
            displayWithDelay("1. Rotate",1000);
            displayWithDelay("2. Activate Panels", 1000);
            displayWithDelay("3. Deactivate Panels", 1000);
            displayWithDelay("4. Collect Data", 1000);
            displayWithDelay("5. Display Status", 1000);
            displayWithDelay("6. Exit", 1000);
            System.out.print("Enter command number: ");

            int commandNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (commandNumber) {
                case 1:
                    System.out.print("Enter direction (North/South/East/West): ");
                    String direction = scanner.nextLine().trim();
                    satellite.rotate(direction);
                    displayWithDelay("Direction changed", 1000);
                    break;
                case 2:
                    satellite.activatePanels();
                    displayWithDelay("Activated", 1000);
                    break;
                case 3:
                    satellite.deactivatePanels();
                    displayWithDelay("Deactivated", 1000);
                    break;
                case 4:
                    satellite.collectData();
                    displayWithDelay("Data collected.", 1000);
                    break;
                case 5:
                    displayWithDelay("Current Status:", 1000);
                    displayWithDelay(satellite.getStatus(), 1000);
                    break;
                case 6:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid command number. Please enter a valid command number.");
            }

            if (commandNumber != 6) {
                try {
                    Thread.sleep(1000); // Introduce a 1-second time gap
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to display a message with a specified delay
    private static void displayWithDelay(String message, long delayMillis) {
        System.out.println(message);
        try {
            Thread.sleep(delayMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
