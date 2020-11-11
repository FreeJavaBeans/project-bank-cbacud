package com.freejavabank.customerinterface;

import com.freejavabank.connection.DBConnection;

public class Customer_Interface {

	public Customer_Interface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
    		DBConnection.getConnectionUtil();
        	
    	}
    	catch(Exception IOException){
    	}
	}

}
