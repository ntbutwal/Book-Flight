package com.flight.serviceFlight;

import com.flight.DtoFlight.DtoFlightBook;

public class PriceService {
	
	public void calculatePrice(DtoFlightBook dtof) {
		
		if(dtof.getDtoairlines().contentEquals("united")) {
			if(dtof.getTrip().contentEquals("oneway")) {
				dtof.setPrice(500.00);
			}
			else {
				dtof.setPrice(700.99);
			}
		}
		
		else if (dtof.getDtoairlines().contentEquals("american")) {
			if(dtof.getTrip().contentEquals("oneway")) {
				dtof.setPrice(449.99);
			}
			else {
				dtof.setPrice(649.99);
			}
		}
		else if (dtof.getDtoairlines().contentEquals("alaska")) {
			if(dtof.getTrip().contentEquals("oneway")) {
				dtof.setPrice(429.99);
			}
			else {
				dtof.setPrice(600.99);
			}
		}
		else if (dtof.getDtoairlines().contentEquals("delta")) {
			if(dtof.getTrip().contentEquals("oneway")) {
				dtof.setPrice(400.99);
			}
			else {
				dtof.setPrice(549.99);
			}
		}
		
		else if (dtof.getDtoairlines().contentEquals("frontier")) {
			if(dtof.getTrip().contentEquals("oneway")) {
				dtof.setPrice(400.99);
			}
			else {
				dtof.setPrice(589.99);
			}
		}
		else if (dtof.getDtoairlines().contentEquals("spirit")) {
			if(dtof.getTrip().contentEquals("oneway")) {
				dtof.setPrice(389.99);
			}
			else {
				dtof.setPrice(549.99);
			}
		}
		
		
	}

}
