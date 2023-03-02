package com.kani.corejava.maincontroller;

public class BookingService {
double flightPrice;

public int addBookingService(String travellerName,int travellerage,int travellerMob,String toCityName,String fromCityName,String flightName)throws ClassNotFoundException {
	System.out.println("Booking Service Layer-2");
	System.out.println(travellerName+travellerage+travellerMob+toCityName+fromCityName+flightName);
	
	if(toCityName.equals("Hyderabad") && fromCityName.equals("Delhi") ) {
		
		flightPrice=5500;  }
	else if(toCityName.equals("Delhi") && fromCityName.equals("Hyderabad")){
		flightPrice=5000;	
	}
	
		
		else {
		System.out.println("Flight price is zero");
		
	}
	System.out.println(flightPrice);
	BookingBean bookingBean=new BookingBean();
	bookingBean.setTravellerName(travellerName);
	bookingBean.setTravellerage(travellerage);
	bookingBean.setTravellerMob(travellerMob);
	bookingBean.setToCityName(toCityName);
	bookingBean.setFromCityName(fromCityName);
	bookingBean.setFlightName(flightName);
	bookingBean.setFlightPrice(flightPrice);
	
	
	BookingDAO bookingDAO=new BookingDAO();  //HAS-A
    int k=   bookingDAO.addBooking(bookingBean);
       
   return k;

}

}
