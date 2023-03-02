package com.kani.corejava.maincontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BookingDAO {

	int i;
	
	public int addBooking(BookingBean bookingBean)throws ClassNotFoundException{
		System.out.println("Booking DAO Layer-2");
		System.out.println("Traveller's name:"+bookingBean.getTravellerName());
		System.out.println("Traveller's age:"+bookingBean.getTravellerage());
		System.out.println("Traveller's mob:"+bookingBean.getTravellerMob());
		System.out.println("Traveller's to City Name:"+bookingBean.getToCityName());
		System.out.println("Traveller's from City name:"+bookingBean.getFromCityName());
		System.out.println("Flight name:"+bookingBean.getFlightName());
		
		
		
		Connection connection = null;
	      String url = "jdbc:mysql://localhost:3306/";
	      String dbName = "mydb";
	      String driverName = "com.mysql.jdbc.Driver";
	      String userName = "root";
	      String password = "root";
	      try{
	        Class.forName(driverName); // Calculation cal=new Calculation();
	        connection = DriverManager.getConnection(url+dbName, userName, password);
	        String query="insert into booking values(?,?,?,?,?,?,?)";
	        
	        PreparedStatement pstmt=connection.prepareStatement(query);
	        pstmt.setString(1, bookingBean.getTravellerName());
	        pstmt.setInt(2,bookingBean.getTravellerage());
	        pstmt.setInt(3,bookingBean.getTravellerMob());
	        pstmt.setString(4, bookingBean.getToCityName());
	        pstmt.setString(5, bookingBean.getFromCityName());
	        pstmt.setString(6, bookingBean.getFlightName());
	        pstmt.setDouble(7,bookingBean.getFlightPrice());
	        
	        i= pstmt.executeUpdate();

	        }
	        catch(SQLException e) {
	          System.out.println(e);
	        }
	        return i;
	        }

	        }


