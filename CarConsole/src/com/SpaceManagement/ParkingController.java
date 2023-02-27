package com.SpaceManagement;

import com.ReservationSystem.ParkingLot;
public class ParkingController {
	   private Car[] spaces;
	private ParkingLot parkingLot;
	   
	   public ParkingController(int numSpaces) {
	      spaces = new Car[numSpaces];
//	   }

//public class ParkingController<invalid> {
	   ParkingLot parkingLot;
//	   int numSpaces = 0;
//	   invalid[] spaces = null;

//	   public ParkingController(int numSpaces) {
	      this.parkingLot = new ParkingLot(numSpaces);
	   }  

//	   public void showAvailability() {
//		      boolean allFree = true;
//		      System.out.println("Parking spaces availability:");
//		      int numSpaces = 0;
//			for (int i = 0; i < numSpaces; i++) {
//		         invalid[] spaces = null;
//				if (spaces[i] == null) { // access spaces array as an instance variable
//		            System.out.println((i + 1) + ". Free");
//		            allFree = false;
//		         } else {
//		            System.out.println((i + 1) + ". Occupied");
//		         }
//		      }
//		      if (allFree) {
//		         System.out.println("All parking spaces are free.");
//		      }
//		   }
//	   public void showAvailability() {
//		    System.out.println("Parking spaces availability:");
//		    for (int i = 0; i < spaces.length; i++) {
//		        if (spaces[i] == null) {
//		            System.out.println("Space " + i + " is free.");
//		        } else {
//		            System.out.println("Space " + i + " is occupied" );
//		        }
//		    }
//		}
	   public void showAvailability() {
		      boolean allFree = true;
		      for (int i = 0; i < spaces.length; i++) {
		         if (spaces[i] != null) {
		            System.out.println("Parking space " + i + " is occupied by a car.");
		            allFree = false;
		         }
		      }
		      if (allFree) {
		         System.out.println("All parking spaces are free.");
		      }
		   }



//	   public int reserveSpace() {
//		   int numSpaces = 0;
//		for (int i = 0; i < numSpaces; i++) {
//		      if (spaces[i] == null) {
//		         spaces[i] = new Car(null);
//		         return i + 1; // return i + 1 instead of i
//		      }
//		   }
//		   System.out.println("Sorry, all parking spaces are currently occupied.");
//		   return -1;
//		}
	   public int reserveSpace() {
		    for (int i = 0; i < spaces.length; i++) {
		        if (spaces[i] == null) {
		            spaces[i] = new Car(null);
		            return i;
		        }
		    }
		    return -1; // no available spaces
		}



	   public void freeSpace(int spaceNumber) {
	      parkingLot.freeSpace(spaceNumber);
	      System.out.println("Parking space " + spaceNumber + " freed.");
	   }
	}
