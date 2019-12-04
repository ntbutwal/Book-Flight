package com.flight.contoller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flight.DtoFlight.DtoFlightBook;
import com.flight.serviceFlight.PriceService;

@Controller
public class FlightComtroller {
	
	private PriceService ps;
	
	@RequestMapping(value = "enterflight", method = RequestMethod.GET)
	public ModelAndView sendData() {
		DtoFlightBook  dto= new DtoFlightBook();
		ModelAndView mv= new ModelAndView("enterflight");
		mv.addObject("flight", dto);
		return mv;
		
	}

	@RequestMapping(value = "showflight", method = RequestMethod.POST)
	public ModelAndView saveData(DtoFlightBook kkc) {
		ModelAndView mv= new ModelAndView("showflight");
		ps.calculatePrice(kkc);
		mv.addObject("kkc", kkc);
		return mv;

	}

	public PriceService getPs() {
		return ps;
	}

	public void setPs(PriceService ps) {
		this.ps = ps;
	}
	

}
