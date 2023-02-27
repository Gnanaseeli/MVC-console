package com.ReservationSystem;
public class ParkingLot {
	   private int numSpaces;
	   private boolean[] spaces;

	   public ParkingLot(int numSpaces) {
	      this.numSpaces = numSpaces;
	      this.spaces = new boolean[numSpaces];
	   }

	   public boolean isSpaceAvailable() {
	      for (int i = 0; i < numSpaces; i++) {
	         if (!spaces[i]) {
	            return true;
	         }
	      }
	      return false;
	   }

	   public int reserveSpace() {
	      for (int i = 0; i < numSpaces; i++) {
	         if (!spaces[i]) {
	            spaces[i] = true;
	            return i;
	         }
	      }
	      return -1;
	   }

	   public void freeSpace(int spaceNumber) {
	      spaces[spaceNumber] = false;
	   }
	}
