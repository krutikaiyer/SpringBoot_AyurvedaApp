package com.kani.corejava.maincontroller;

import java.io.Serializable;

public class BookingBean implements Serializable{
	private String travellerName;
	private int travellerage;
	private int travellerMob;
	private String toCityName;
	private String fromCityName;
	private String flightName;
	private double flightPrice;
	public String getTravellerName() {
		return travellerName;
	}
	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}
	public int getTravellerage() {
		return travellerage;
	}
	public void setTravellerage(int travellerage) {
		this.travellerage = travellerage;
	}
	public int getTravellerMob() {
		return travellerMob;
	}
	public void setTravellerMob(int travellerMob) {
		this.travellerMob = travellerMob;
	}
	public String getToCityName() {
		return toCityName;
	}
	public void setToCityName(String toCityName) {
		this.toCityName = toCityName;
	}
	public String getFromCityName() {
		return fromCityName;
	}
	public void setFromCityName(String fromCityName) {
		this.fromCityName = fromCityName;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}

	
	
}
