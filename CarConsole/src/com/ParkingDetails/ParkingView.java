package com.ParkingDetails;
import java.util.Scanner;

import com.SpaceManagement.ParkingController;

public class ParkingView {
   private Scanner scanner;
   private ParkingController parkingController;

   public ParkingView(int numSpaces) {
      this.scanner = new Scanner(System.in);
      this.parkingController = new ParkingController(numSpaces);
   }

   public void showMainMenu() {
      System.out.println("Select an option:");
      System.out.println("1. Show availability");
      System.out.println("2. Reserve parking space");
      System.out.println("3. Free parking space");
      System.out.println("4. Exit");

      int choice = scanner.nextInt();
      switch (choice) {
         case 1:
            parkingController.showAvailability();
            break;
         case 2:
            int spaceNumber = parkingController.reserveSpace();
            if (spaceNumber != -1) {
               System.out.println("Parking space " + spaceNumber + " reserved. Please pay the parking fee.");
               payFee();
            }
            break;
         case 3:
            System.out.println("Enter the parking space number to free:");
            int spaceToFree = scanner.nextInt();
            parkingController.freeSpace(spaceToFree);
            break;
         case 4:
            System.exit(0);
         default:
            System.out.println("Invalid choice. Please try again.");
            break;
      }
   }

   public void payFee() {
      System.out.println("Please select a payment method:");
      System.out.println("1. Credit/debit card");
      System.out.println("2. Mobile wallet");
      int choice = scanner.nextInt();
      if (choice == 1) {
         System.out.println("Please swipe your card.");
      } else if (choice == 2) {
         System.out.println("Please scan the QR code.");
      } else {
         System.out.println("Invalid choice. Please try again.");
         payFee();
      }
   }
}
