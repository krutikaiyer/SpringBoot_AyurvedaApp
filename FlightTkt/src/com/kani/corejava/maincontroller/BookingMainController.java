package com.kani.corejava.maincontroller;

import java.util.Scanner;

public class BookingMainController {

	public static void main(String[] args) {
		try {
			System.out.println("BookingMainController :1");
			String travellerName=null;
			int travellerage=0;
			int travellerMob=0;
			String toCityName;
			String fromCityName;
			String flightName=null;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Traveller's name:");
			travellerName=sc.next();
			System.out.println("Enter Traveller's age:");
			travellerage=sc.nextInt();			
			System.out.println("Enter Traveller's mob:");
			travellerMob=sc.nextInt();
			System.out.println("Traveller travelling to:");
			toCityName=sc.next();
			System.out.println("Traveller travelling from:");
			fromCityName=sc.next();
			System.out.println("Flight name:");
			flightName=sc.next();
			
			BookingService booking=new BookingService();
			int t=booking.addBookingService(travellerName,travellerage,travellerMob,toCityName,fromCityName,flightName);
			System.out.println("Main controller return value from DAO Layer:"+t);
		}
		catch(Exception e) {
		System.out.println(e);
		}

	}

}
