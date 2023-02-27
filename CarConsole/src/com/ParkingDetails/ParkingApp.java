package com.ParkingDetails;
public class ParkingApp {
	   public static void main(String[] args) {
	      ParkingView parkingView = new ParkingView(10); //10 is the number of parking spaces
	      while (true) {
	         parkingView.showMainMenu();
	      }
	   }
	}
