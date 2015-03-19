package de.nh.addressBook.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.nh.addressBook.service.SpeicherService;

@Controller
public class SpeichernController {
	
	@Autowired
	SpeicherService speichernService;
	
	@RequestMapping(value = "/adresse", method = RequestMethod.GET)
	public ModelAndView seiteAnzeigen(@RequestParam(defaultValue = "0") String error, HttpServletRequest request) {
		
		Map<String, Object> viewMap = new HashMap<>();
		
		return new ModelAndView("adresse", viewMap);
	}
	
	
	@RequestMapping(value = "/adresse", method = RequestMethod.POST)
	public void adresseSpeichern(@RequestParam String name, @RequestParam String vorname, @RequestParam String strasse,
			@RequestParam String plz, @RequestParam String ort, @RequestParam String telefon, HttpServletRequest request, 
			HttpServletResponse response ) throws IOException {


		speichernService.adresseSpeichern(name, vorname, strasse,plz, ort, telefon);

		response.sendRedirect(request.getContextPath());
	
	}

}
